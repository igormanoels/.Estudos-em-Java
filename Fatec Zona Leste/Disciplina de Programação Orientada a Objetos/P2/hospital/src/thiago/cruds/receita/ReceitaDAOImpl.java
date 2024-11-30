package thiago.cruds.receita;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import conexaoMariaDB.MariaDB;
import thiago.cruds.gestaoPedidos.estoque.Estoque;
import thiago.cruds.gestaoPedidos.estoque.EstoqueException;

public class ReceitaDAOImpl implements ReceitaDAO {

  private static final String DB_CLASS = "org.mariadb.jdbc.Driver";
  private MariaDB mdb = new MariaDB();
  private Connection con = null;

  public ReceitaDAOImpl() throws ReceitaException {
    try {
      Class.forName(DB_CLASS);
      con = DriverManager.getConnection(mdb.getURL(), mdb.getUSER(), mdb.getPASS());
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
      throw new ReceitaException(e);
    }
  }

  public boolean pesquisarMedicamento(List<String> medicamentos) throws ReceitaException {

    try {
      for (String m : medicamentos) {
        String SQL = """
                SELECT estoque.medicamento FROM estoque
                WHERE medicamento=?
            """;
        PreparedStatement stm = con.prepareStatement(SQL);
        stm.setString(1, "%" + m + "%");
        ResultSet rs = stm.executeQuery();
        // if (!rs.getString("medicamento").contains(m)) {
        // return false;
        // }
      }
    } catch (SQLException er) {
      er.printStackTrace();
      throw new ReceitaException(er);
    }
    return true;
  }

  public List<String> buscarListaMed(List<String> medicamentos) throws ReceitaException {

    List<String> meds = new ArrayList<>();
    try {
      for (String m : medicamentos) {
        String SQL = """
                SELECT medicamento FROM estoque
                WHERE medicamento=?
            """;
        PreparedStatement stm = con.prepareStatement(SQL);
        stm.setString(1, "%" + m + "%");
        ResultSet rs = stm.executeQuery();
        while (rs.next()) {
          String med = rs.getString("medicamento");
          meds.add(med);
        }
      }
    } catch (SQLException er) {
      er.printStackTrace();
      throw new ReceitaException(er);
    }
    return meds;
  }

  @Override
  public void inserir(Receita r) throws ReceitaException {
    try {
      String SQL = """
          INSERT INTO receita (id, dataReceita, medicoCrm)
          VALUES (?, ?, ?)
          """;
      PreparedStatement stm = con.prepareStatement(SQL);
      stm.setInt(1, 0);
      Date dt = Date.valueOf(r.getDataReceita());
      stm.setDate(2, dt);
      stm.setString(3, r.getMedicoCRM());
      int i = stm.executeUpdate();
      System.out.println(i);
      inserirAssociativa(r);
    } catch (SQLException er) {
      er.printStackTrace();
      throw new ReceitaException(er);
    }
  }

  private void inserirAssociativa(Receita r) throws ReceitaException {
    List<Integer> medIds = buscaIdEstoque(r.getMedicamentos());

    try {
      for (Integer m : medIds) {
        String SQL = """
            INSERT INTO receitaEstoque (estoqueId, receitaId)
            VALUES (?, ?)
            """;
        PreparedStatement stm = con.prepareStatement(SQL);
        stm.setInt(1, m);
        stm.setInt(2, r.getId());
        int i = stm.executeUpdate();
        System.out.println(i);
      }
    } catch (SQLException er) {
      er.printStackTrace();
      throw new ReceitaException(er);
    }

  }

  private List<Integer> buscaIdEstoque(String medicamentos) throws ReceitaException {
    String[] vetMed = medicamentos.split(",");
    List<String> listaMed = new ArrayList<>();
    for (String item : vetMed) {
      listaMed.add(item);
    }

    List<Integer> medIds = new ArrayList<>();
    ResultSet rs;
    try {
      for (String m : listaMed) {
        String SQL = """
            SELECT id FROM estoque WHERE medicamento =?
            """;
        PreparedStatement stm = con.prepareStatement(SQL);
        stm.setString(1, m);
        rs = stm.executeQuery();
        // Aponta para a primeira linha
        if (rs.next()) {
          medIds.add(rs.getInt("id"));
        }
      }
    } catch (SQLException er) {
      er.printStackTrace();
      throw new ReceitaException(er);
    }
    return medIds;
  }

  @Override
  public void atualizar(Receita r) throws ReceitaException {
    // Devido a assoativa ter como chave o id de estoque, não é possivel atualizar
    // os medicamentos, informar o usuário desta regra
    try {
      String SQL = """
          UPDATE receita SET dataReceita=?, medicoCrm=?
          WHERE id=?
          """;
      PreparedStatement stm = con.prepareStatement(SQL);
      java.sql.Date dt = java.sql.Date.valueOf(r.getDataReceita());
      stm.setDate(1, dt);
      stm.setString(2, r.getMedicoCRM());
      stm.setInt(3, r.getId());
      int i = stm.executeUpdate();

    } catch (SQLException e) {
      e.printStackTrace();
      throw new ReceitaException(e);
    }
  }

  @Override
  public void remover(Receita r) throws ReceitaException {
    try {
      // É preciso remover a assoativa antes
      removerAssociativa(r);
      String SQL = """
          DELETE FROM receita WHERE id=?
          """;
      PreparedStatement stm = con.prepareStatement(SQL);
      stm.setInt(1, r.getId());
      int i = stm.executeUpdate();
      System.out.println(i);
    } catch (SQLException e) {
      e.printStackTrace();
      throw new ReceitaException(e);
    }
  }

  private void removerAssociativa(Receita r) throws ReceitaException {
    try {
      // É preciso remover a assoativa antes
      String SQL = """
          DELETE FROM receitaEstoque WHERE receitaId=?
          """;
      PreparedStatement stm = con.prepareStatement(SQL);
      stm.setInt(1, r.getId());
      int i = stm.executeUpdate();
      System.out.println(i);
    } catch (SQLException e) {
      e.printStackTrace();
      throw new ReceitaException(e);
    }
  }

  @Override
  public List<Receita> pesquisarPorCRM(String crm) throws ReceitaException {
    List<Receita> lista = new ArrayList<>();
    try {
      String SQL = """
          SELECT * FROM receita WHERE medicoCrm LIKE ?
          """;
      PreparedStatement stm = con.prepareStatement(SQL);
      stm.setString(1, "%" + crm + "%");
      ResultSet rs = stm.executeQuery();
      while (rs.next()) {
        Receita r = new Receita();
        r.setId(rs.getInt("medicoCrm"));
        r.setDataReceita(rs.getDate("dataReceita").toLocalDate());
        r.setMedicamentos(buscarEstoqueMedicamento(rs.getInt("id")));
        r.setMedicoCRM(rs.getString("medicoCrm"));

        lista.add(r);
      }
    } catch (SQLException e) {
      e.printStackTrace();
      throw new ReceitaException(e);
    }
    return lista;
  }

  private String buscarEstoqueMedicamento(int id) throws ReceitaException {

    StringBuilder meds = new StringBuilder();
    try {

      String SQL = """
              SELECT estoque.medicamento FROM estoque
              INNER JOIN receitaEstoque ON receitaEstoque.estoqueId = estoque.id
              WHERE receitaEstoque.receitaId=?
          """;
      PreparedStatement stm = con.prepareStatement(SQL);
      stm.setInt(1, id);
      ResultSet rs = stm.executeQuery();

      // Aponta para a primeira linha do ResultSet
      if (rs.next()) {
        meds.append(rs.getString("medicamento"));
        while (rs.next()) {
          meds.append(",");
          String med = rs.getString("medicamento");
          meds.append(med);
        }
      }
    } catch (SQLException er) {
      er.printStackTrace();
      throw new ReceitaException(er);
    }
    return meds.toString();
  }

  @Override
  public List<Receita> pesquisarTodos() throws ReceitaException {
    List<Receita> lista = new ArrayList<>();
    try {
      String SQL = """
          SELECT * FROM receita
          """;
      PreparedStatement stm = con.prepareStatement(SQL);
      ResultSet rs = stm.executeQuery();
      while (rs.next()) {
        Receita r = new Receita();
        r.setId(rs.getInt("id"));
        r.setDataReceita(rs.getDate("dataReceita").toLocalDate());
        r.setMedicamentos(buscarEstoqueMedicamento(r.getId()));
        r.setMedicoCRM(rs.getString("medicoCrm"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
      throw new ReceitaException(e);
    }
    return lista;
  }
}
