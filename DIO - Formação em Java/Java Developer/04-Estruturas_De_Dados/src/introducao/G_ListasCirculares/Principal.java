package introducao.G_ListasCirculares;

public class Principal 
{
	public static void main(String[] args) 
	{
		ListaCircular<String> lista = new ListaCircular<>();
		
		lista.add("primeiro");
		lista.add("segundo");
		lista.add("terceiro");
		lista.add("quarto");
		lista.add("quinto");
		
		System.out.println(lista);
		
		lista.remove(2);
		System.out.println(lista);
		
		for (int i = 0; i <= 20; i++) 
		{
			System.out.println(lista.get(i));
		}
	}
}
