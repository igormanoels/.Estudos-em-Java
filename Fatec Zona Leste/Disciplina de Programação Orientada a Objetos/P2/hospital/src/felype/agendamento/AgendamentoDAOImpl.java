package felype.agendamento;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import conexaoMariaDB.MariaDB;

public class AgendamentoDAOImpl implements AgendamentoDAO {
    private static final String DB_CLASS = "org.mariadb.jdbc.Driver";
      private MariaDB mdb = new MariaDB();


    private Connection con = null;

    public AgendamentoDAOImpl() throws AgendamentoException {
        try {
            // Carregar o driver JDBC do MariaDB
            Class.forName(DB_CLASS);
            con = DriverManager.getConnection(mdb.getURL(), mdb.getUSER(), mdb.getPASS());
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new AgendamentoException(e);
        }
    }

    @Override
    public void inserir(Agendamento a) throws AgendamentoException {
        String query = "INSERT INTO agendamento (cpf_cliente, tipo_exame, data_hora_agendamento, data_criacao, status, medico_responsavel, unidade_exame, observacoes, forma_pagamento) "
                     + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, a.getCpfCliente());
            stmt.setString(2, a.getTipoExame());
            stmt.setTimestamp(3, Timestamp.valueOf(a.getDataHoraAgendamento()));
            stmt.setTimestamp(4, Timestamp.valueOf(a.getDataCriacao()));
            stmt.setString(5, a.getStatus());
            stmt.setString(6, a.getMedicoResponsavel());
            stmt.setString(7, a.getUnidadeExame());
            stmt.setString(8, a.getObservacoes());
            stmt.setString(9, a.getFormaPagamento());

            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new AgendamentoException(e);
        }
    }

    @Override
    public void atualizar(Agendamento a) throws AgendamentoException {
        String query = "UPDATE agendamento SET tipo_exame = ?, data_hora_agendamento = ?, status = ?, medico_responsavel = ?, unidade_exame = ?, observacoes = ?, forma_pagamento = ? "
                     + "WHERE id = ?";

        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, a.getTipoExame());
            stmt.setTimestamp(2, Timestamp.valueOf(a.getDataHoraAgendamento()));
            stmt.setString(3, a.getStatus());
            stmt.setString(4, a.getMedicoResponsavel());
            stmt.setString(5, a.getUnidadeExame());
            stmt.setString(6, a.getObservacoes());
            stmt.setString(7, a.getFormaPagamento());
            stmt.setInt(8, a.getId());

            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new AgendamentoException(e);
        }
    }

    @Override
    public void remover(Agendamento a) throws AgendamentoException {
        String query = "DELETE FROM agendamento WHERE id = ?";

        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setInt(1, a.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new AgendamentoException(e);
        }
    }

    @Override
    public List<Agendamento> pesquisarPorCPF(String cpf) throws AgendamentoException {
        String query = "SELECT * FROM agendamento WHERE cpf_cliente = ?";
        List<Agendamento> agendamentos = new ArrayList<>();

        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Agendamento a = new Agendamento();
                a.setId(rs.getInt("id"));
                a.setCpfCliente(rs.getString("cpf_cliente"));
                a.setTipoExame(rs.getString("tipo_exame"));
                a.setDataHoraAgendamento(rs.getTimestamp("data_hora_agendamento").toLocalDateTime());
                a.setDataCriacao(rs.getTimestamp("data_criacao").toLocalDateTime());
                a.setStatus(rs.getString("status"));
                a.setMedicoResponsavel(rs.getString("medico_responsavel"));
                a.setUnidadeExame(rs.getString("unidade_exame"));
                a.setObservacoes(rs.getString("observacoes"));
                a.setFormaPagamento(rs.getString("forma_pagamento"));
                agendamentos.add(a);
            }
        } catch (SQLException e) {
            throw new AgendamentoException(e);
        }
        return agendamentos;
    }

    @Override
    public List<Agendamento> pesquisarTodos() throws AgendamentoException {
        String query = "SELECT * FROM agendamento";
        List<Agendamento> agendamentos = new ArrayList<>();

        try (PreparedStatement stmt = con.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Agendamento a = new Agendamento();
                a.setId(rs.getInt("id"));
                a.setCpfCliente(rs.getString("cpf_cliente"));
                a.setTipoExame(rs.getString("tipo_exame"));
                a.setDataHoraAgendamento(rs.getTimestamp("data_hora_agendamento").toLocalDateTime());
                a.setDataCriacao(rs.getTimestamp("data_criacao").toLocalDateTime());
                a.setStatus(rs.getString("status"));
                a.setMedicoResponsavel(rs.getString("medico_responsavel"));
                a.setUnidadeExame(rs.getString("unidade_exame"));
                a.setObservacoes(rs.getString("observacoes"));
                a.setFormaPagamento(rs.getString("forma_pagamento"));
                agendamentos.add(a);
            }
        } catch (SQLException e) {
            throw new AgendamentoException(e);
        }
        return agendamentos;
    }

    // Fechando a conexão quando o objeto for destruído
    public void fecharConexao() throws SQLException {
        if (con != null && !con.isClosed()) {
            con.close();
        }
    }
}
