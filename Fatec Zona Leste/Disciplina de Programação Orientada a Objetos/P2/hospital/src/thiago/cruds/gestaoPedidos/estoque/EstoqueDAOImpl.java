package thiago.cruds.gestaoPedidos.estoque;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexaoMariaDB.MariaDB;

public class EstoqueDAOImpl implements EstoqueDAO {
  
  private static final String DB_CLASS = "org.mariadb.jdbc.Driver";
  private MariaDB mdb = new MariaDB();
  private Connection con = null;

  public EstoqueDAOImpl() throws EstoqueException {
    try {
      Class.forName(DB_CLASS);
      con = DriverManager.getConnection(mdb.getURL(), mdb.getUSER(), mdb.getPASS());
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
      throw new EstoqueException(e);
    }
  }

  @Override
  public void inserir(Estoque e) throws EstoqueException {
    try {
      String SQL = """
          INSERT INTO estoque (id, medicamento, quantidade, fornecedor, funcionarioRegistro)
          VALUES (?, ?, ?, ?, ?)
          """;
      PreparedStatement stm = con.prepareStatement(SQL);
      stm.setInt(1, 0);
      stm.setString(2, e.getMedicamento());
      stm.setInt(3, e.getQuantidade());
      stm.setString(4, e.getFornecedor());
      stm.setInt(5, e.getFuncionarioRegistro());
      int i = stm.executeUpdate();
      System.out.println(i);
    } catch (SQLException er) {
      er.printStackTrace();
      throw new EstoqueException(er);
    }
  }

  @Override
  public void atualizar(Estoque e) throws EstoqueException {
    try {
      String SQL = """
          UPDATE estoque SET medicamento=?, quantidade=?, fornecedor=?,funcionarioRegistro=?
          WHERE id=?
          """;
      PreparedStatement stm = con.prepareStatement(SQL);
      stm.setString(1, e.getMedicamento());
      stm.setInt(2, e.getQuantidade());
      stm.setString(3, e.getFornecedor());
      stm.setInt(4, e.getFuncionarioRegistro());
      stm.setInt(5, e.getId());
      int i = stm.executeUpdate();
      System.out.println(i);
    } catch (SQLException er) {
      er.printStackTrace();
      throw new EstoqueException(er);
    }
  }

  @Override
  public void remover(Estoque e) throws EstoqueException {
    try {
      String SQL = """
              DELETE FROM estoque WHERE id=?
          """;
      PreparedStatement stm = con.prepareStatement(SQL);
      stm.setInt(1, e.getId());
      stm.executeUpdate();
    } catch (SQLException er) {
      er.printStackTrace();
      throw new EstoqueException(er);
    }
  }

  @Override
  public List<Estoque> pesquisarPorMedicamento(String medicamento) throws EstoqueException {
    List<Estoque> lista = new ArrayList<>();
    try {
      String SQL = """
            SELECT * FROM estoque WHERE medicamento LIKE ?
          """;
      PreparedStatement stm = con.prepareStatement(SQL);
      stm.setString(1, "%" + medicamento + "%");
      // Lista com o resultado da query
      ResultSet rs = stm.executeQuery();
      // Enquanto existir elementos na lista continua o while
      while (rs.next()) {
        Estoque e = new Estoque();
        e.setId(rs.getInt("id"));
        e.setMedicamento(rs.getString("medicamento"));
        e.setQuantidade(rs.getInt("quantidade"));
        e.setFornecedor(rs.getString("fornecedor"));
        e.setFuncionarioRegistro(rs.getInt("funcionarioRegistro"));
        lista.add(e);
      }
    } catch (SQLException er) {
      er.printStackTrace();
      throw new EstoqueException(er);
    }
    return lista;
  }

  @Override
  public List<Estoque> pesquisarTodos() throws EstoqueException {
    List<Estoque> lista = new ArrayList<>();
    try {
      String SQL = """
          SELECT * FROM estoque
          """;
      PreparedStatement stm = con.prepareStatement(SQL);
      ResultSet rs = stm.executeQuery();
      while (rs.next()) {
        Estoque e = new Estoque();
        e.setId(rs.getInt("id"));
        e.setMedicamento(rs.getString("medicamento"));
        e.setQuantidade(rs.getInt("quantidade"));
        e.setFornecedor(rs.getString("fornecedor"));
        e.setFuncionarioRegistro(rs.getInt("funcionarioRegistro"));
        lista.add(e);
      }
    } catch (SQLException er) {
      er.printStackTrace();
      throw new EstoqueException(er);
    }
    return lista;
  }

}
