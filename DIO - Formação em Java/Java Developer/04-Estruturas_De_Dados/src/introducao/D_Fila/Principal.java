package projetos.D_Fila;

public class Principal 
{
	 public static void main(String[] args) 
	 {
		 Fila fila = new Fila();
		 
		 fila.enqueue(new No("Primeiro"));
		 fila.enqueue(new No("Segundo"));
		 fila.enqueue(new No("Terceiro"));
		 fila.enqueue(new No("Quarto"));
		 
		 System.out.println(fila);
		 
		 System.out.println(fila.dequeue());
		 
		 System.out.println(fila.first());
		 System.out.println(fila);
		 
		 fila.enqueue(new No("Quinto"));
		 fila.enqueue(new No("Sexto"));
		 System.out.println(fila);
		 
	 }
}
