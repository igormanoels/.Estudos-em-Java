package vitoria.medicos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexaoMariaDB.MariaDB;

public class MedicoDAOImpl implements MedicoDAO {

    private static final String DB_CLASS = "org.mariadb.jdbc.Driver";
    private MariaDB mdb = new MariaDB();
    private Connection con = null;

    public MedicoDAOImpl() throws MedicoException {
        try {
            Class.forName(DB_CLASS);
            con = DriverManager.getConnection(mdb.getURL(), mdb.getUSER(), mdb.getPASS());
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new MedicoException(e);
        }
    }

    @Override
    public void inserir(Medico m) throws MedicoException {
        try {
            String SQL = """
                    INSERT INTO medico (crm, nome, email, telefone, especialidade)
                    VALUES (?, ?, ?, ?, ?)
                    """;
            PreparedStatement stm = con.prepareStatement(SQL);
            stm.setString(1, m.getCrm());
            stm.setString(2, m.getNome());
            stm.setString(3, m.getEmail());
            stm.setString(4, m.getTelefone());
            stm.setString(5, m.getEspecialidade());
            int i = stm.executeUpdate();
            System.out.println(i);
        } catch (SQLException er) {
            er.printStackTrace();
            throw new MedicoException(er);
        }
    }

    @Override
    public void atualizar(Medico m) throws MedicoException {
        try {

            String SQL = """
                    UPDATE medico SET nome=?, email=?, telefone=?, especialidade=?
                    WHERE id=?
                    """;
            PreparedStatement stm = con.prepareStatement(SQL);
            stm.setString(1, m.getNome());
            stm.setString(2, m.getEmail());
            stm.setString(3, m.getTelefone());
            stm.setString(4, m.getEspecialidade());
            stm.setString(5, m.getCrm());
            stm.setInt(6,m.getId());
            stm.executeUpdate();
        } catch (SQLException er) {
            er.printStackTrace();
            throw new MedicoException(er);
        }
    }

    @Override
    public void remover(Medico m) throws MedicoException {
        try {
            String SQL = """
                        DELETE FROM medico WHERE id=?
                    """;
            PreparedStatement stm = con.prepareStatement(SQL);
            stm.setInt(1, m.getId());
            stm.executeUpdate();

        } catch (SQLException er) {
            er.printStackTrace();
            throw new MedicoException(er);
        }
    }

    @Override
    public List<Medico> pesquisarPorNome(String nome) throws MedicoException {
        List<Medico> lista = new ArrayList<>();
        try {

            String SQL = """
                      SELECT * FROM medico
                      WHERE nome LIKE ?
                    """;
            PreparedStatement stm = con.prepareStatement(SQL);
            stm.setString(1, "%" + nome + "%");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Medico m = new Medico();
                m.setId(rs.getInt("id"));
                m.setCrm(rs.getString("crm"));
                m.setNome(rs.getString("nome"));
                m.setTelefone(rs.getString("telefone"));
                m.setEmail(rs.getString("email"));
                m.setEspecialidade(rs.getString("especialidade"));
                lista.add(m);
            }
        } catch (SQLException er) {
            er.printStackTrace();
            throw new MedicoException(er);
        }
        return lista;
    }

    @Override
    public List<Medico> pesquisarTodos() throws MedicoException {
        List<Medico> lista = new ArrayList<>();
        try {
            String SQL = """
                        SELECT * FROM medico
                    """;
            PreparedStatement stm = con.prepareStatement(SQL);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Medico m = new Medico();
                m.setId(rs.getInt("id"));
                m.setCrm(rs.getString("crm"));
                m.setNome(rs.getString("nome"));
                m.setTelefone(rs.getString("telefone"));
                m.setEmail(rs.getString("email"));
                m.setEspecialidade(rs.getString("especialidade"));
                lista.add(m);
            }
        } catch (SQLException er) {
            er.printStackTrace();
            throw new MedicoException(er);
        }
        return lista;
    }

}