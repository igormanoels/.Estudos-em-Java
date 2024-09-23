package exercicios.exercicio_11;

import java.util.ArrayList;
import java.util.List;

public class Aeroporto {
	private String nome;
	private String cidade;
	private int quantidadePortoes;
	private List<Aeronave> aeronaves;
	
	public Aeroporto() {
		this.aeronaves = new ArrayList<>();
	}
	
	public Aeroporto(String...vet) {
		this.nome = vet[0];
		this.cidade = vet[1];
		this.quantidadePortoes = Integer.parseInt(vet[2]);
		this.aeronaves = new ArrayList<>();
	}
	
	public void adcionarAeronave(String...vet) {
		aeronaves.add(new Aeronave(vet));
	}
	
	public void autorizarPouso() {
		System.out.println("Pouso autorizado!");
	}

	public void autorizarDecolagem() {
		System.out.println("Decolagem autorizada!");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getQuantidadePortoes() {
		return quantidadePortoes;
	}

	public void setQuantidadePortoes(int quantidadePortoes) {
		this.quantidadePortoes = quantidadePortoes;
	}

	public List<Aeronave> getAeronaves() {
		return aeronaves;
	}

	public void setAeronaves(List<Aeronave> aeronaves) {
		this.aeronaves = aeronaves;
	}

	@Override
	public String toString() {
		return "Aeroporto: " + this.nome + ", cidade: " + this.cidade + ", total portões: " + this.quantidadePortoes;
	}
}
