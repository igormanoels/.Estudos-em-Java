package exercicios.exercicio_09;

public class Funcionario extends Pessoa {
	
	private String cargo;
	private float salario;
	
	public Funcionario() {}
	
	public Funcionario(String cargo) {
		this.cargo = cargo;
		this.salario = 0f;
	}
	
	public Funcionario(String cargo, float salario) {
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public void trabalhar() {
		System.out.println("Está trabalhando!");
	}
	
	public String getCargo() {
		return this.cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public float getSalario() {
		return this.salario;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return super.toString() + ", cargo: " + this.cargo + ", salário: R$ " + this.salario;
	}
	
}
