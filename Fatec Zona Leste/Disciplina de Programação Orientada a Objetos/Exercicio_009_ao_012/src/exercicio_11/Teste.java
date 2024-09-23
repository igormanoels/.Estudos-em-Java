package exercicio_11;

public class Teste {
	
	public static void main(String[] args) {
		Aeroporto gru = new Aeroporto("Guarulhos", "São Paulo", "6");
		
		gru.adcionarAeronave("Boing 737", "737A", "248");
		
		Aeronave b737 = new Aeronave();
		b737.adcionarPassageiro("Alef", "1212111548", "A85D45478DC98");
		b737.adcionarPassageiro("Bruno", "1312111548", "B85D45478DC98");
		b737.adcionarPassageiro("Carla", "1412111548", "C85D45478DC98");
		b737.adcionarPiloto("Rongo", "121221115554", "12125444448798998");
		b737.adcionarPiloto("Tongo", "221221115554", "22225444448798998");
		
		System.out.println("Passageiros");
		b737.listarPassageiros();
		System.out.println("\nPilotos");
		b737.listarPilotos();
		
		System.out.println();
		
		gru.autorizarDecolagem();
		b737.voar();
		gru.autorizarPouso();
		b737.pousar();
	
	}
	
}
