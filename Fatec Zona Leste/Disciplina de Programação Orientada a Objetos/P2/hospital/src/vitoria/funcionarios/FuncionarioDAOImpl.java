package vitoria.funcionarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexaoMariaDB.MariaDB;

public class FuncionarioDAOImpl implements FuncionarioDAO {

    private MariaDB mdb = new MariaDB();
    private static final String DB_CLASS = "org.mariadb.jdbc.Driver";
    private Connection con = null;

    public FuncionarioDAOImpl() throws FuncionarioException {
        try {
            Class.forName(DB_CLASS);
            con = DriverManager.getConnection(mdb.getURL(), mdb.getUSER(), mdb.getPASS());
        } catch (ClassNotFoundException | SQLException e) {
            throw new FuncionarioException("Erro ao inicializar conexão com o banco de dados.:" + e);
        }
    }

    @Override
    public void inserir(Funcionario f) throws FuncionarioException {
        String SQL = """
                INSERT INTO funcionario (nome, email, telefone, senha, setor)
                VALUES (?, ?, ?, ?, ?);
                """;
        try (PreparedStatement stm = con.prepareStatement(SQL)) {
            validarFuncionario(f);
            stm.setString(1, f.getNome());
            stm.setString(2, f.getEmail());
            stm.setString(3, f.getTelefone());
            stm.setString(4, f.getSenha());
            stm.setString(5, f.getSetor());
            stm.executeUpdate();
        } catch (SQLException er) {
            throw new FuncionarioException("Erro ao inserir o funcionário:" +  er);
        }
    }

    @Override
    public void atualizar(Funcionario f) throws FuncionarioException {
        String SQL = """
                UPDATE funcionario SET nome=?, email=?, telefone=?, senha=?, setor=?
                WHERE registro=?;
                """;
        try (PreparedStatement stm = con.prepareStatement(SQL)) {
            validarFuncionario(f);
            stm.setString(1, f.getNome());
            stm.setString(2, f.getEmail());
            stm.setString(3, f.getTelefone());
            stm.setString(4, f.getSenha());
            stm.setString(5, f.getSetor());
            stm.setInt(6, f.getId());
            stm.executeUpdate();
        } catch (SQLException er) {
            throw new FuncionarioException("Erro ao atualizar o funcionário: " + er);
        }
    }

    @Override
    public void remover(Funcionario f) throws FuncionarioException {
        String SQL = "DELETE FROM funcionario WHERE registro=?";
        try (PreparedStatement stm = con.prepareStatement(SQL)) {
            stm.setInt(1, f.getId());
            stm.executeUpdate();
        } catch (SQLException er) {
            throw new FuncionarioException("Erro ao remover o funcionário:" + er);
        }
    }

    @Override
    public List<Funcionario> pesquisarPorNome(String nome) throws FuncionarioException {
        List<Funcionario> lista = new ArrayList<>();
        String SQL = """
                SELECT * FROM funcionario
                WHERE LOWER(nome) LIKE LOWER(?);
                """;
        try (PreparedStatement stm = con.prepareStatement(SQL)) {
            stm.setString(1, "%" + nome + "%");
            try (ResultSet rs = stm.executeQuery()) {
                while (rs.next()) {
                    lista.add(extrairFuncionario(rs));
                }
            }
        } catch (SQLException er) {
            throw new FuncionarioException("Erro ao pesquisar funcionários por nome:" + er); 
        }
        return lista;
    }

    @Override
    public List<Funcionario> pesquisarTodos() throws FuncionarioException {
        List<Funcionario> lista = new ArrayList<>();
        String SQL = "SELECT * FROM funcionario;";
        try (PreparedStatement stm = con.prepareStatement(SQL);
             ResultSet rs = stm.executeQuery()) {
            while (rs.next()) {
                lista.add(extrairFuncionario(rs));
            }
        } catch (SQLException er) {
            throw new FuncionarioException("Erro ao pesquisar todos os funcionários:" +  er);
        }
        return lista;
    }

    private Funcionario extrairFuncionario(ResultSet rs) throws SQLException {
        Funcionario f = new Funcionario();
        f.setId(rs.getInt("registro"));
        f.setNome(rs.getString("nome"));
        f.setEmail(rs.getString("email"));
        f.setSenha(rs.getString("senha"));
        f.setTelefone(rs.getString("telefone"));
        f.setSetor(rs.getString("setor"));
        return f;
    }

    private void validarFuncionario(Funcionario f) {
        if (f.getNome() == null || f.getNome().isBlank()) {
            throw new IllegalArgumentException("Nome do funcionário não pode ser vazio.");
        }
        if (f.getEmail() == null || f.getEmail().isBlank()) {
            throw new IllegalArgumentException("Email do funcionário não pode ser vazio.");
        }
    }

    public void fecharConexao() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println("Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
            }
        }
    }
}
