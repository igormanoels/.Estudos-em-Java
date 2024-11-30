package igor.consulta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import conexaoMariaDB.MariaDB;

public class ConsultaDAOImpl implements ConsultaDAO {
    private MariaDB mdb = new MariaDB();

    @Override
    public String gravar(Consulta c) {
        String sql = "INSERT INTO consulta (agendamentoId, descricao, medicoCrm, especialidadeId) VALUES (?, ?, ?, ?)";
        try (Connection conexao = DriverManager.getConnection(mdb.getURL(), mdb.getUSER(), mdb.getPASS());
             PreparedStatement stm = conexao.prepareStatement(sql)) {

            stm.setInt(1, c.getAgendamentoId());
            stm.setString(2, c.getDescricao());
            stm.setString(3, c.getMedicoCrm());
            stm.setInt(4, c.getEspecialidadeId());

            stm.executeUpdate();
            return "Consulta agendada com sucesso!";
        } catch (Exception e) {
            return "Erro ao agendar consulta: " + e.getMessage();
        }
    }

    @Override
    public Consulta atualizar(Consulta c) {
        String sql = "UPDATE consulta SET descricao = ?, medicoCrm = ?, especialidadeId = ? WHERE agendamentoId = ?";
        try (Connection conexao = DriverManager.getConnection(mdb.getURL(), mdb.getUSER(), mdb.getPASS());
             PreparedStatement stm = conexao.prepareStatement(sql)) {

            stm.setString(1, c.getDescricao());
            stm.setString(2, c.getMedicoCrm());
            stm.setInt(3, c.getEspecialidadeId());
            stm.setInt(4, c.getAgendamentoId());

            int rowsAffected = stm.executeUpdate();
            return rowsAffected > 0 ? c : null;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar consulta: " + e.getMessage());
        }
    }

    @Override
    public String remover(Consulta c) {
        String sql = "DELETE FROM consulta WHERE agendamentoId = ?";
        try (Connection conexao = DriverManager.getConnection(mdb.getURL(), mdb.getUSER(), mdb.getPASS());
             PreparedStatement stm = conexao.prepareStatement(sql)) {

            stm.setInt(1, c.getAgendamentoId());
            int rowsAffected = stm.executeUpdate();
            return rowsAffected > 0 ? "Consulta removida com sucesso!" : "Consulta não encontrada.";
        } catch (Exception e) {
            return "Erro ao remover consulta: " + e.getMessage();
        }
    }

    @Override
    public Consulta procurar(Consulta c) {
        String sql = "SELECT * FROM consulta WHERE agendamentoId = ?";
        try (Connection conexao = DriverManager.getConnection(mdb.getURL(), mdb.getUSER(), mdb.getPASS());
             PreparedStatement stm = conexao.prepareStatement(sql)) {

            stm.setInt(1, c.getAgendamentoId());
            try (ResultSet rs = stm.executeQuery()) {
                if (rs.next()) {
                    Consulta consulta = new Consulta();
                    consulta.setAgendamentoId(rs.getInt("agendamentoId"));
                    consulta.setDescricao(rs.getString("descricao"));
                    consulta.setMedicoCrm(rs.getString("medicoCrm"));
                    consulta.setEspecialidadeId(rs.getInt("especialidadeId"));
                    return consulta;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao procurar consulta: " + e.getMessage());
        }
        return null;
    }
}
