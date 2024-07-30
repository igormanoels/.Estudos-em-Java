package projetos.E_ListasEncadeadas;

public class Principal 
{
	public static void main(String[] args) 
	{
		ListaEncadeada<String> lista = new ListaEncadeada<>();
		
		lista.add("Primeiro");
		lista.add("Segundo");
		lista.add("Terceiro");
		lista.add("Quarto");
		lista.add("Quinto");
		
		System.out.println(lista.get(3)); // Primeiro elemento
		System.out.println(lista.get(1)); // Terceiro elemento
		
		
		System.out.println(lista);
		
		
		
		
	}
}
