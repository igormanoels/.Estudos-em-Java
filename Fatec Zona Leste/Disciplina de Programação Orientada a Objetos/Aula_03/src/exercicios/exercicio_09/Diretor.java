package exercicios.exercicio_09;

public class Diretor extends Gerente{
	
	private double verba;
	
	public Diretor(String...vet) {
		super.setNome(vet[0]);
		super.setCargo(vet[1]);
		super.setSalario(Float.parseFloat(vet[2]));
		super.setQuantFunc(Integer.parseInt(vet[3]));
		this.verba = Double.parseDouble(vet[4]);
	}
	
	public Diretor(String cargo, float salario, int qf) {
		super.setCargo(cargo);
		super.setSalario(salario);
		super.setQuantFunc(qf);
		this.verba = 10000d;
	}
	public Diretor(String cargo, float salario) {
		super.setCargo(cargo);
		super.setSalario(salario);
		this.verba = 10000d;
	}
	
	public Diretor(String cargo) {
		super.setCargo(cargo);
		this.verba = 10000d;
	}
	public Diretor() {}
	
	public void liderarDepartamento() {
		System.out.println("Liderando departamento.");
	}
	
	public double getVerba() {
		return this.verba;
	}
	
	public void setVerba(double verba) {
		this.verba = verba;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", verba: R$ " + verba;
	}
}
