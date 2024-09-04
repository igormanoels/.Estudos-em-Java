package exercicios.exercicio_10;

public class Teste {
	
	public static void main(String[] args) {
	 Funcionario func = new Funcionario();
	 
	 func.setNome("Pedro Augusto");
	 func.setCpf("121212555");
	 func.setCargo("Motorista");
	 	 
	 System.out.println(func + " - Quantidade de dependentes: " + func.contarDependentes() + "\n");
	 
	 Funcionario func2 = new Funcionario("Pedro Paixão", "1235468897", "Atendente");
	 func2.adcionarDependente("Maria Paixão", "121255460", "12");
	 func2.adcionarDependente("João Paixão", "12115454", "4");
	 
	 System.out.println(func2 + " - Quantidade de dependentes: " + func2.contarDependentes());
	 func2.mostraDependentes();
	}
}
