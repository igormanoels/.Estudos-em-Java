package exercicio_10;

import java.util.LinkedList;
import java.util.List;

public class Funcionario {

	private String nome;
	private String cpf;
	private String cargo;
	// Dependentes compõem a classe funcionário
	List<Dependente> dependentes;
	
	public Funcionario() {
		this.dependentes = new LinkedList<>();
	}
	
	public Funcionario(String nome, String cpf, String cargo) {
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.dependentes = new LinkedList<>();
	}
	
	public void adcionarDependente(String...vet) {
		dependentes.add(new Dependente(vet[0], vet[1], vet[2]));
	}
	
	public void contarDependentes() {
		int quant = 0;
		if(dependentes.isEmpty()) {
			System.out.println(quant);
		} else {
			for (Dependente d : dependentes) {
				if (!(d.getCpf().isEmpty())) {
					++quant;
				}
			}
			System.out.println(quant);
		}
	}
	
	public void mostraDependentes() {
		for (Dependente d : dependentes) System.out.println(d.toString());
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCargo() {
		return this.cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String toString() {
		return "Funcionário: " + nome + ", cpf: " + cpf + ", cargo: " + cargo;
	}
}
