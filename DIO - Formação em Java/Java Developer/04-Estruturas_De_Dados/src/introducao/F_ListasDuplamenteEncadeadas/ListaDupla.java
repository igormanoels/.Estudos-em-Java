package introducao.F_ListasDuplamenteEncadeadas;

public class ListaDupla <T>
{
	private NoDuplo<T> primeiroNo;
	private NoDuplo<T> ultimoNo;
	
	private int tamanhoLista;
	
	public ListaDupla() {
		this.primeiroNo = null;
		this.ultimoNo = null;
		this.tamanhoLista = 0;
	}
	
	public int size()
	{	
		return this.tamanhoLista;
	}
	
	public T get(int indice)
	{
		return getNo(indice).getConteudo();
	}
	
	private NoDuplo<T> getNo(int indice)
	{
		NoDuplo<T> noAuxiliar = primeiroNo;
		
		for (int i = 0; (i < indice) && (noAuxiliar != null)  ; i++) 
		{
			noAuxiliar = noAuxiliar.getNoProximo();
		}
		
		return noAuxiliar;
	}
	
	public void add(T conteudo)
	{
		NoDuplo<T> novoNo = new NoDuplo<>(conteudo);
		novoNo.setNoProximo(null);
		novoNo.setNoPrevio(ultimoNo);
		if (primeiroNo == null) 
		{
			primeiroNo = novoNo;
		} 
		
		if (ultimoNo != null)
		{
			ultimoNo.setNoProximo(novoNo);
		}
		
		ultimoNo = novoNo;
		tamanhoLista++;		
	}
	
	public void add (T conteudo, int indice)
	{
		NoDuplo<T> noAuxiliar = getNo(indice);
		NoDuplo<T> novoNo = new NoDuplo<>(conteudo);
		novoNo.setNoProximo(noAuxiliar);
		
		if(novoNo.getNoProximo() != null)
		{
			novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
			novoNo.getNoProximo().setNoPrevio(novoNo);
		}
		else
		{
			novoNo.setNoPrevio(ultimoNo);
			ultimoNo = novoNo;
		}
		
		if (indice == 0) 
		{
			primeiroNo = novoNo;
		}
		else
		{
			novoNo.getNoPrevio().setNoProximo(novoNo);
		}
		
		tamanhoLista++;
	}
	
	public void remove(int indice)
	{
		if (indice == 0) 
		{
			primeiroNo = primeiroNo.getNoProximo();
			if (primeiroNo != null) 
			{
				primeiroNo.setNoPrevio(null);
			}
		}
		else
		{
			NoDuplo<T> noAuxiliar = getNo(indice);
			noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
			
			if (noAuxiliar != ultimoNo) 
			{
				noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoProximo());
			}
			else
			{
				ultimoNo = noAuxiliar;
			}
			
		}
		this.tamanhoLista--;
		
	}
	
	@Override
	public String toString() 
	{
		String retorno = "";
		
		NoDuplo<T> auxiliar = primeiroNo;
		
		for (int i = 0; i < size(); i++) 
		{
			retorno += auxiliar.getConteudo() + " --> ";
			auxiliar = auxiliar.getNoProximo();
		}
		
		retorno += "null";
		
		return retorno;
	}
	
}
