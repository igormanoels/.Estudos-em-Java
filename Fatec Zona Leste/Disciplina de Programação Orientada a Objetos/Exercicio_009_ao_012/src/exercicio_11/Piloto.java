package exercicios.exercicio_11;

public class Piloto extends Pessoa{
	
	private String breve;
	
	public Piloto() {}
	
	public Piloto(String...vet) {
		super.setNome(vet[0]);
		super.setCpf(vet[1]);
		this.breve = vet[2];
	}

	public String getBreve() {
		return breve;
	}

	public void setBreve(String breve) {
		this.breve = breve;
	}
	
	public void pilotar() {
		System.out.println("Está pilotando.");
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Nº brêve: " + this.breve;
	}
	
}
