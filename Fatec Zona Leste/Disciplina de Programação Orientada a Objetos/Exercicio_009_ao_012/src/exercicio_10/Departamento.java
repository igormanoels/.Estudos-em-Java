package exercicio_10;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
	private String nome;
	private int codigo;
	private List<Funcionario> funcionarios;
	
	public Departamento() {
		this.funcionarios = new ArrayList<>();
	}
	
	public Departamento(String...vet) {
		this.nome = vet[0];
		this.codigo = Integer.parseInt(vet[1]);
		this.funcionarios = new ArrayList<>();
	}
	
	public void adcionarFuncionario(String...vet) {
		funcionarios.add(new Funcionario(vet[0], vet[1], vet[2]));
	}
	
	public void adcionarDependente(String...vet) {
		if (!(funcionarios.isEmpty())) {
			for (Funcionario f : funcionarios) {
				if (f.getCpf().equalsIgnoreCase(vet[0])) {
					f.adcionarDependente(vet[1], vet[2], vet[3]);
				}
			}
		} else {
			System.out.println("A lista está vazia.");
		}
	}
	
	public void contarDependente(String cpf) {
		if (!(funcionarios.isEmpty())) {
			for (Funcionario f : funcionarios) {
				if (f.getCpf().equalsIgnoreCase(cpf)) f.contarDependentes();
			}
		} else {
			System.out.println("A lista está vazia.");
		}
	}
	
	public void mostrarDependente(String cpf) {
		if (!(funcionarios.isEmpty())) {
			for (Funcionario f : funcionarios) {
				if (f.getCpf().equalsIgnoreCase(cpf)) f.mostraDependentes();
			}
		} else {
			System.out.println("A lista está vazia.");
		}
	}
	
	public int quantFuncionarios() {
		int quantFunc = 0;
		if(funcionarios.isEmpty() == true) return quantFunc;
		
		for (Funcionario f : funcionarios) ++quantFunc;
		return quantFunc;		
	}
	
	public void listarFuncionarios() {
		if (!(funcionarios.isEmpty())) {
			for (Funcionario f : funcionarios) System.out.println(f.toString());
			System.out.println("\n");
		} else {
			System.out.println("A lista de funcionários está vazia.\n");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	@Override
	public String toString() {
		return "Departamento: " + nome + ", código: " + codigo;
	}
}
