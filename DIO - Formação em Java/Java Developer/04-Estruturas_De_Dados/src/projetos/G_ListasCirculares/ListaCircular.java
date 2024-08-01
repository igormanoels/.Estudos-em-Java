package projetos.G_ListasCirculares;

public class ListaCircular <T>
{
	private No<T> cabeca;
	private No<T> cauda;
	private int tamanhoLista;
	
	public ListaCircular() 
	{
		this.cabeca = null;
		this.cauda = null;
		this.tamanhoLista = 0;
	}
	
	public int size()
	{
		return this.tamanhoLista;
	}
	
	public boolean isEmpty()
	{
		return this.tamanhoLista == 0? true: false;
	}
	
	private No<T> getNo(int indice)
	{
		if (this.isEmpty())
		{
			throw new IndexOutOfBoundsException("A lista está vazia");
		}
		
		if (indice == 0) 
		{
			return this.cauda;
		}
		
		No<T> auxiliar = cauda;
		
		for (int i = 0; i < indice; i++) 
		{
			auxiliar = auxiliar.getPriximoNo();
		}
		
		return auxiliar;
	}
	
	
	public T get(int indice)
	{
		return this.getNo(indice).getConteudo();
	}
	
	
	public void remove(int indice)
	{
		if (indice >= tamanhoLista) 
		{
			throw new IndexOutOfBoundsException("O indíce é maior que o tamanho da lista");
		}
		
		No<T> auxiliar = cauda;
		
		if (indice == 0 ) 
		{
			this.cauda = auxiliar.getPriximoNo();
			this.cabeca.setPriximoNo(cauda);
		}
		else if (indice == 1) 
		{
			this.cauda.setPriximoNo(this.cauda.getPriximoNo().getPriximoNo()); // faz a cauda apontar pulando o nó posterior
		}
		else
		{
			for (int i = 0; i < indice; i++) 
			{
				auxiliar = auxiliar.getPriximoNo();
			}
			auxiliar.setPriximoNo(auxiliar.getPriximoNo().getPriximoNo());
		}
		
		this.tamanhoLista--;
	}
	
	public void add(T conteudo)
	{
		No<T> novoNo = new No<>(conteudo);
		
		if (this.isEmpty()) 
		{
			this.cabeca = novoNo;
			this.cauda = cabeca;
			this.cabeca.setPriximoNo(cauda);
		}
		else
		{
			novoNo.setPriximoNo(this.cauda);
			this.cabeca.setPriximoNo(novoNo);
			this.cauda = novoNo;
		}
		
		this.tamanhoLista++;
	}
	
	@Override
	public String toString() 
	{
		String retorno = "";
		No<T> auxiliar = this.cauda;
		
		for (int i = 0; i < this.size(); i++) 
		{
			retorno += auxiliar.getConteudo() + " --> ";
			auxiliar = auxiliar.getPriximoNo();
		}
		
		retorno += cauda.getConteudo();
		
		return retorno;
	}
}
