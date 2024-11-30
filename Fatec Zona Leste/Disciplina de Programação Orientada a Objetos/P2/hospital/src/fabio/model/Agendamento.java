package fabio.model;

import java.time.LocalDate;

public class Agendamento {

	private int id;
	private LocalDate data;
	private String horario;
	private int sala;
	private int pessoaCPF;
	private int funcionarioRegistro;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

	public int getPessoaCPF() {
		return pessoaCPF;
	}

	public void setPessoaCPF(int pessoaCPF) {
		this.pessoaCPF = pessoaCPF;
	}

	public int getFuncionarioRegistro() {
		return funcionarioRegistro;
	}

	public void setFuncionarioRegistro(int funcionarioRegistro) {
		this.funcionarioRegistro = funcionarioRegistro;
	}

}