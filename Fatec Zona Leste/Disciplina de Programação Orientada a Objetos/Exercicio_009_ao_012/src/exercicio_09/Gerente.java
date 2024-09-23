package exercicios.exercicio_09;

public class Gerente extends Funcionario{

	private int quantidadeFuncionarios;
	
	// Construido da maneira menos prática
	public Gerente(String nome, String cargo, float salario, int quantFunc) {
		this.quantidadeFuncionarios = quantFunc;
		super.setNome(nome);
		super.setCargo(cargo);
		super.setSalario(salario);		
	}
	
	// Construido a partir da explicação da aula anterior
	public Gerente(String...vet) {
		super.setNome(vet[0]);
		super.setCargo(vet[1]);
		super.setSalario(Float.parseFloat(vet[2]));
		this.quantidadeFuncionarios = 0;
	}
	
	public Gerente(String nome) {
		this.quantidadeFuncionarios = 0;
		super.setNome(nome);
	}
	
	public Gerente() {
		this.quantidadeFuncionarios = 0;
	}
	
	public void liderarEquipe() {
		System.out.println("Liderando equipe.");
	}
	
	public int getQuantFunc() {
		return this.quantidadeFuncionarios;
	}
	
	public void setQuantFunc(int qf) {
		this.quantidadeFuncionarios = qf;
	}
	
	public String toString() {
		return super.toString() + ", quantidade de funcionários: " + this.quantidadeFuncionarios;
	}
}
