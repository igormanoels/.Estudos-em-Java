package exercicio_11;

	import java.util.ArrayList;
import java.util.List;
	
public class Aeronave {
	
	private List<Piloto> pilotos;
	private List<Passageiro> passageiros;
	private String modelo;
	private String codigo;
	private int capacidade;
	
	public Aeronave() {
		this.pilotos = new ArrayList<>();
		this.passageiros = new ArrayList<>();
	}
	
	public Aeronave(String...vet) {
		this.modelo = vet[0];
		this.codigo = vet[1];
		this.capacidade = Integer.parseInt(vet[2]);
		this.pilotos = new ArrayList<>();
		this.passageiros = new ArrayList<>();
	}
	
	public void adcionarPiloto(String...vet) {
		pilotos.add(new Piloto(vet[0], vet[1], vet[2]));
	}
	
	public void adcionarPassageiro(String...vet) {
		passageiros.add(new Passageiro(vet[0], vet[1], vet[2]));
	}
	
	public void listarPassageiros() {
		if (!(passageiros.isEmpty())) {
			for (Passageiro p : passageiros) System.out.println(p.toString());
		} else {
			System.out.println("A lista de passageiros está vazia.");
		}
	}
	
	public void listarPilotos() {
		if (!(pilotos.isEmpty())) {
			for (Piloto p : pilotos) System.out.println(p.toString());
		} else {
			System.out.println("A lista de piloto está vazia.");
		}
	}
	
	public void voar() {
		System.out.println("Decolando!");
	}
	
	public void pousar() {
		System.out.println("Pousando!");
	}

	public List<Piloto> getPilotos() {
		return pilotos;
	}

	public void setPilotos(List<Piloto> pilotos) {
		this.pilotos = pilotos;
	}

	public List<Passageiro> getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(List<Passageiro> passageiros) {
		this.passageiros = passageiros;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	@Override
	public String toString() {
		return "Aeronave: " + this.modelo + ", capacidade: " + this.capacidade;
	}

}
