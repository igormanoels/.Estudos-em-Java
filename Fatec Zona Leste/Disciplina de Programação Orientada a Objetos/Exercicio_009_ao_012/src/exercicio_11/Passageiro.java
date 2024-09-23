package exercicio_11;

public class Passageiro extends Pessoa{
	
	private String numeroPassagem;
	
	public Passageiro() {}

	public Passageiro(String...vet) {
		super.setNome(vet[0]);
		super.setCpf(vet[1]);
		this.numeroPassagem = vet[2];
	}

	public String getNumeroPassagem() {
		return numeroPassagem;
	}

	public void setNumeroPassagem(String numeroPassagem) {
		this.numeroPassagem = numeroPassagem;
	}
	
	public void mostrarPassaporte()	{
		System.out.println("Mostrou passaporte.");
	}
	
	@Override
	public String toString() {
		return super.toString() + "nº passagem: " + this.numeroPassagem;
	}
	
}
