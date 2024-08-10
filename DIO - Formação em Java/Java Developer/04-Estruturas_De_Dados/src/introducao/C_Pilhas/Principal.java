package projetos.C_Pilhas;

public class Principal 
{
	public static void main(String[] args) 
	{
		Pilha p = new Pilha();
		
		p.push(new No(1));
		p.push(new No(2));
		p.push(new No(3));
		p.push(new No(4));
		p.push(new No(5));
		p.push(new No(6));
		
		System.out.println(p);
		
		System.out.println("Removendo o conteúdo do topo: " + p.pop() + "\n");
		
		System.out.println(p);
		
		p.push(new No(999));
		
		System.out.println(p);
		
		System.out.println("Exibindo o conteúdo do topo: " + p.top() + "\n");
		
		System.out.println(p);

	}
}
