package fabio.controll;

import java.time.LocalDate;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import fabio.model.Agendamento;
import fabio.service.AgendamentoDAOImpl;
import fabio.service.DAO;
import fabio.service.GenericException;

public class AgendamentoControll {
	
	private ObservableList<Agendamento> lista = FXCollections.observableArrayList();
	
	private IntegerProperty id = new SimpleIntegerProperty(0);
	private ObjectProperty<LocalDate> data = new SimpleObjectProperty<>(LocalDate.now());
	private StringProperty horario = new SimpleStringProperty("");
	private IntegerProperty sala = new SimpleIntegerProperty(0);
	private IntegerProperty pessoaCPF = new SimpleIntegerProperty(0);
	private IntegerProperty funcionarioRegistro = new SimpleIntegerProperty(0);
	
	private DAO<Agendamento> agendamentoDAO;
	
	private int contadorID = 0;
	
	public AgendamentoControll() throws GenericException {
		agendamentoDAO = new AgendamentoDAOImpl();
	}
	
	public void entidadeParaTela(Agendamento a) {
		if(a != null) {
			this.id.set(a.getId());
			this.data.set(a.getData());
			this.horario.set(a.getHorario());
			this.sala.set(a.getSala());
			this.pessoaCPF.set(a.getPessoaCPF());
			this.funcionarioRegistro.set(a.getFuncionarioRegistro());
		}
	}
	
	public void excluir(Agendamento a) throws GenericException {
		System.err.println("Agendamento excluido");
		agendamentoDAO.remover(a);
		pesquisarTodos();
	}
	
	public void gravar() throws GenericException {
		Agendamento a = new Agendamento();
		
		// ASSIM COM O ID?
		a.setId(++contadorID);
		a.setData(this.data.get());
		a.setHorario(this.horario.get());
		a.setSala(this.sala.get());
		a.setPessoaCPF(this.pessoaCPF.get());
		a.setFuncionarioRegistro(this.funcionarioRegistro.get());
		
		pesquisarTodos();
		limparCampos();
	}
	
	//PESQUISA PELO Q?
	public void pesquisarPorNome() throws GenericException {
		lista.clear();
		lista.addAll(agendamentoDAO.pesquisar(horario.get()));
	}
	
	public void pesquisarTodos() throws GenericException {
		lista.clear();
		lista.addAll(agendamentoDAO.pesquisarTodos());
	}
	
	public void limparCampos() {
		this.id.set(0);
		this.data.set(LocalDate.now());
		this.horario.set("");
		this.sala.set(0);
		this.pessoaCPF.set(0);
		this.funcionarioRegistro.set(0);
	}

	public ObservableList<Agendamento> getLista() {
		return lista;
	}

	public IntegerProperty getId() {
		return id;
	}

	public ObjectProperty<LocalDate> getData() {
		return data;
	}

	public StringProperty getHorario() {
		return horario;
	}

	public IntegerProperty getSala() {
		return sala;
	}

	public IntegerProperty getPessoaCPF() {
		return pessoaCPF;
	}

	public IntegerProperty getFuncionarioRegistro() {
		return funcionarioRegistro;
	}

	public int getContadorID() {
		return contadorID;
	}

}
