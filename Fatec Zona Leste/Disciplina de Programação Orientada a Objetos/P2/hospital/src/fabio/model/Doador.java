package fabio.model;

import java.time.LocalDate;

public class Doador {

	private int cpf;
	private String nome;
	private LocalDate nascimento;
	private String email;
	private int telefone;
	private String tipoSanguinio;

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getTipoSanguinio() {
		return tipoSanguinio;
	}

	public void setTipoSanguinio(String tipoSanguinio) {
		this.tipoSanguinio = tipoSanguinio;
	}

}
