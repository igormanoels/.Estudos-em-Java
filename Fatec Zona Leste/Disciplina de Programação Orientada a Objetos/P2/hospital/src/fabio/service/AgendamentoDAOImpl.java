package fabio.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexaoMariaDB.MariaDB;
import fabio.model.Agendamento;

public class AgendamentoDAOImpl implements DAO<Agendamento> {

	private static final String DB_CLASS = "org.mariadb.jdbc.Driver";
	private MariaDB mdb = new MariaDB();

	private Connection conexao = null;

	public AgendamentoDAOImpl() throws GenericException {
		try {
			Class.forName(DB_CLASS);
			conexao = DriverManager.getConnection(mdb.getURL(), mdb.getUSER(), mdb.getPASS());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new GenericException(e);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new GenericException(e);
		}
		
	}

	@Override
	public void inserir(Agendamento objeto) throws GenericException {
		try {
			String SQL = """
					INSERT INTO agendamento (id, data, horario, sala, pessoaCPF, funcionarioRegistro)
					VALUES (?, ?, ?, ?, ?, ?)
					""";

			PreparedStatement stm = conexao.prepareStatement(SQL);
			stm.setInt(1, 0);
			java.sql.Date data = java.sql.Date.valueOf(objeto.getData());
			stm.setDate(2, data);
			stm.setString(3, objeto.getHorario());
			stm.setInt(4, objeto.getSala());
			stm.setInt(5, objeto.getPessoaCPF());
			stm.setInt(6, objeto.getFuncionarioRegistro());
			stm.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new GenericException(e);
		}

	}

	@Override
	public void atualizar(Agendamento objeto) throws GenericException {
		try {
			String SQL = """
					UPDATE agendamento SET data=?, horario=?, sala=?, pessoaCPF=?, funcionarioRegistro=?
					WHERE id=?
					""";
			PreparedStatement stm = conexao.prepareStatement(SQL);
			java.sql.Date data = java.sql.Date.valueOf(objeto.getData());
			stm.setDate(1, data);
			stm.setString(2, objeto.getHorario());
			stm.setInt(3, objeto.getSala());
			stm.setInt(4, objeto.getPessoaCPF());
			stm.setInt(5, objeto.getFuncionarioRegistro());
			stm.setInt(6, 0);
			stm.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new GenericException(e);
		}

	}

	@Override
	public void remover(Agendamento objeto) throws GenericException {
		try {
			String SQL = """
					DELETE FROM agendamento
					WHERE id = ?
					""";

			PreparedStatement stm = conexao.prepareStatement(SQL);
			stm.setInt(1, 0);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new GenericException(e);
		}

	}

	@Override
	public List<Agendamento> pesquisar(String itemPesquisa) throws GenericException {
		
		List<Agendamento> lista = new ArrayList<>();
		
		try {
			String SQL = """
					SELECT * FROM agendamento
					WHERE horario LIKE ?
					""";
			
			PreparedStatement stm = conexao.prepareStatement(SQL);
			stm.setString(1, "%" + itemPesquisa + "%");

		} catch (SQLException e) {
			e.printStackTrace();
			throw new GenericException(e);
		}
		return lista;
	}

	@Override
	public List<Agendamento> pesquisarTodos() throws GenericException {
		List<Agendamento> lista = new ArrayList<>();
		
		try {
			String SQL = "SELECT * FROM agendamento";
			PreparedStatement stm = conexao.prepareStatement(SQL);
			ResultSet resultados = stm.executeQuery();
			
			while(resultados.next()) {
				Agendamento a = new Agendamento();
				
				a.setId(resultados.getInt("id"));
				a.setData(resultados.getDate("data").toLocalDate());
				a.setHorario(resultados.getString("horario"));
				a.setSala(resultados.getInt("sala"));
				a.setPessoaCPF(resultados.getInt("pessoaCPF"));
				a.setFuncionarioRegistro(resultados.getInt("funcionarioRegistro"));
				
				lista.add(a);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new GenericException(e);
		}
		return lista;
	}

}
