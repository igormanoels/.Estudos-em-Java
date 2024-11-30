package felype.paciente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexaoMariaDB.MariaDB;

public class PacienteDAOImpl implements PacienteDAO {
  private static final String DB_CLASS = "org.mariadb.jdbc.Driver";
  private MariaDB mdb = new MariaDB();

  private Connection con = null;

  public PacienteDAOImpl() throws PacienteException {
    try {
      Class.forName(DB_CLASS);
      con = DriverManager.getConnection(mdb.getURL(), mdb.getUSER(), mdb.getPASS());
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
      throw new PacienteException(e);
    }
  }

  @Override
  public void inserir(Paciente p) throws PacienteException {
    try {
      // Primeiro insere a entidade mae pessoa
      inserirPessoa(p);
      // Agora insere a entidade filha
      String SQL = """
          INSERT INTO paciente (pessoaCpf, cartaoSus)
          VALUES (?, ?)
          """;
      PreparedStatement stm = con.prepareStatement(SQL);
      stm.setInt(1, 0);
      stm.setString(2, p.getCartaoSus());
      stm.executeUpdate();
    } catch (SQLException er) {
      er.printStackTrace();
      throw new PacienteException(er);
    }
  }

  private void inserirPessoa(Paciente p) throws PacienteException {
    try {
      // Inserir pessoa
      String SQL = """
          INSERT INTO pessoa (cpf, nome, cadastro, sexo, endereco, telefone, email)
          VALUES (?, ?, ?, ?, ?, ?, ?, ? )
          """;
      PreparedStatement stm = con.prepareStatement(SQL);
      stm.setInt(1, 0);
      stm.setString(2, p.getNome());
      java.sql.Date dt = java.sql.Date.valueOf(p.getCadastro());
      stm.setDate(3, dt);
      stm.setString(4, p.getSexo());
      stm.setString(5, p.getEndereco());
      stm.setString(6, p.getTelefone());
      stm.setString(5, p.getEmail());
      stm.executeUpdate();
    } catch (SQLException er) {
      er.printStackTrace();
      throw new PacienteException(er);
    }
  }

  @Override
  public void atualizar(Paciente p) throws PacienteException {
    try {
      // atualizar Pessoa
      atualizarPessoa(p);
      String SQL = """
          UPDATE paciente SET cartaoSus=?
          WHERE pessoaCpf=?
          """;
      PreparedStatement stm = con.prepareStatement(SQL);
      stm.setString(1, p.getCartaoSus());
      stm.setInt(2, p.getId());
      stm.executeUpdate();
    } catch (SQLException er) {
      er.printStackTrace();
      throw new PacienteException(er);
    }
  }

  private void atualizarPessoa(Paciente p) throws PacienteException {
    try {
      // atualizar Pessoa
      atualizarPessoa(p);
      String SQL = """
          UPDATE pessoa SET nome=?, cadastro=?, sexo=?, endereco=?, telefone=?, email=?
          WHERE cpf=?
          """;
      PreparedStatement stm = con.prepareStatement(SQL);
      stm.setString(1, p.getNome());
      java.sql.Date dt = java.sql.Date.valueOf(p.getCadastro());
      stm.setDate(2, dt);
      stm.setString(3, p.getSexo());
      stm.setString(4, p.getEndereco());
      stm.setString(5, p.getTelefone());
      stm.setString(6, p.getEmail());
      stm.setInt(7, p.getId());
      stm.executeUpdate();
    } catch (SQLException er) {
      er.printStackTrace();
      throw new PacienteException(er);
    }
  }

  @Override
  public void remover(Paciente p) throws PacienteException {
    try {
      // remove primeiro da classe filha
      String SQL = """
              DELETE FROM paciente WHERE pessoaCpf=?
          """;
      PreparedStatement stm = con.prepareStatement(SQL);
      stm.setInt(1, p.getId());
      stm.executeUpdate();
      // remove da classe mae
      removerPessoa(p);
    } catch (SQLException er) {
      er.printStackTrace();
      throw new PacienteException(er);
    }
  }

  private void removerPessoa(Paciente p) throws PacienteException {
    try {
      // remove da classe mae
      String SQL = """
              DELETE FROM pessoa WHERE cpf=?
          """;
      PreparedStatement stm = con.prepareStatement(SQL);
      stm.setInt(1, p.getId());
      stm.executeUpdate();
    } catch (SQLException er) {
      er.printStackTrace();
      throw new PacienteException(er);
    }
  }

  @Override
  public List<Paciente> pesquisarPorNome(String nome) throws PacienteException {
    List<Paciente> lista = new ArrayList<>();
    try {

      String SQL = """
            SELECT pessoa.cpf, pessoa.nome, pessoa.cadastro, pessoa.sexo, pessoa.endereco, pessoa.telefone, pessoa.email, paciente.cartaoSus FROM pessoa
            INNER JOIN paciente ON paciente.pessoaCpf = pessoa.cpf
            WHERE nome LIKE ?
          """;
      PreparedStatement stm = con.prepareStatement(SQL);
      stm.setString(1, "%" + nome + "%");
      // Lista com o resultado da query
      ResultSet rs = stm.executeQuery();
      // Enquanto existir elementos na lista continua o while
      while (rs.next()) {
        Paciente p = new Paciente();
        p.setId(rs.getInt("cpf"));
        p.setNome(rs.getString("nome"));
        p.setCadastro(rs.getDate("cadastro").toLocalDate());
        p.setSexo(rs.getString("sexo"));
        p.setEndereco(rs.getString("endereco"));
        p.setTelefone(rs.getString("telefone"));
        p.setEmail(rs.getString("email"));
        p.setCartaoSus(rs.getString("cartaoSus"));
        lista.add(p);
      }
    } catch (SQLException er) {
      er.printStackTrace();
      throw new PacienteException(er);
    }
    return lista;
  }

  @Override
  public List<Paciente> pesquisarTodos() throws PacienteException {
    List<Paciente> lista = new ArrayList<>();
    try {
      String SQL = """
              SELECT pessoa.cpf, pessoa.nome, pessoa.cadastro, pessoa.sexo, pessoa.endereco, pessoa.telefone, pessoa.email, paciente.cartaoSus FROM pessoa
              INNER JOIN paciente ON paciente.pessoaCpf = pessoa.cpf
          """;
      PreparedStatement stm = con.prepareStatement(SQL);
      ResultSet rs = stm.executeQuery();
      while (rs.next()) {
        Paciente p = new Paciente();
        p.setId(rs.getInt("cpf"));
        p.setNome(rs.getString("nome"));
        p.setCadastro(rs.getDate("cadastro").toLocalDate());
        p.setSexo(rs.getString("sexo"));
        p.setEndereco(rs.getString("endereco"));
        p.setTelefone(rs.getString("telefone"));
        p.setEmail(rs.getString("email"));
        p.setCartaoSus(rs.getString("cartaoSus"));
        lista.add(p);
      }
    } catch (SQLException er) {
      er.printStackTrace();
      throw new PacienteException(er);
    }
    return lista;
  }
}