package projetos.F_ListasDuplamenteEncadeadas;

public class Principal 
{
	public static void main(String[] args) 
	{
		ListaDupla<String> lista = new ListaDupla<>();
		
		lista.add("primeiro");
		lista.add("segundo");
		lista.add("terceiro");
		lista.add("quarto");
		lista.add("quinto");
		lista.add("sexto");
		
		System.out.println(lista);
		
		lista.add("Intruso", 3);
		System.out.println(lista);
		
		lista.remove(4);
		System.out.println(lista);
	}
}
