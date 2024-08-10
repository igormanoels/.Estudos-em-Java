package projetos.D_Fila_UsandoGenerics;

public class Principal 
{
	 public static void main(String[] args) 
	 {
		 
		 Fila<String> fila = new Fila<>();
		 
		 fila.enqueue("Primeiro");
		 fila.enqueue("Segundo");
		 fila.enqueue("Terceiro");
		 fila.enqueue("Quarto");
		 
		 System.out.println(fila);
		 
		 System.out.println(fila.dequeue());
		 
		 System.out.println(fila);
		 
		 fila.enqueue("Quinto");
		 fila.enqueue("Sexto");
		 System.out.println(fila);
		 
		 System.out.println(fila.first());
		 
	 }
}
