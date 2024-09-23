package exercicio_09;

public class Principal {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("Igor");
		System.out.println(gerente + "\n");
		
		
		Diretor diretor = new Diretor();
		diretor.setNome("Igor");
		diretor.setSalario(12000);
		diretor.comer();
		diretor.trabalhar();
		diretor.liderarEquipe();
		diretor.liderarDepartamento();
		diretor.dormir();
		System.out.println(diretor);
		
	}
	
	
}
