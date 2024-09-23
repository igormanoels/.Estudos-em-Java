package exercicio_10;

public class Teste {
	
	public static void main(String[] args) {
	 Departamento rh = new Departamento("Recursos Humanos", "1211");
	 System.out.println("\n" + rh + ", Quant. Funcionários: " + rh.quantFuncionarios());
	 
	 
	 rh.adcionarFuncionario("Pedro Augusto", "121212555", "Motorista");
	 rh.adcionarFuncionario("Pedro Paixão", "1235468897", "Atendente");
	 rh.adcionarDependente("1235468897", "Maria Paixão", "121255460", "12");
	 rh.adcionarDependente("1235468897", "João Paixão", "12115454", "4");
	 
	 rh.listarFuncionarios();
	 System.out.print("Nº de dependentes de Pedro Augusto ");
	 rh.contarDependente("121212555");
	 System.out.print("Nº de dependentes de Pedro Paixão ");
	 rh.contarDependente("1235468897");
	 rh.mostrarDependente("1235468897");
	 
	 
	 System.out.println("\nDepartamento Atualizado\n" + rh + ", Quant. Funcionários: " + rh.quantFuncionarios());
	  
	}
}
