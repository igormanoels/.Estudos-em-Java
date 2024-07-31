package projetos.E_ListasEncadeadas;

public class ListaEncadeada <T>
{
	No<T> refEntrada;
	
	public ListaEncadeada() 
	{
		this.refEntrada = null;
	}
	
	public boolean isEmpty()
	{
		return refEntrada == null? true: false;
	}
	
	public int size() 
	{
		int tamanho = 0;
		No<T> refAuxiliar = refEntrada;
		
		while(true)
		{
			if(refAuxiliar != null)
			{
				tamanho +=1;
				if (refAuxiliar.getRefNo() != null) 
				{
					refAuxiliar = refAuxiliar.getRefNo();
				}
				else 
				{
					break;
				}
			}
			else
			{
				break;
			}
		}
		
		return tamanho;
	}
	
	public void add(T conteudo)
	{
		No<T> novoNo = new No<>(conteudo);
		
		if(this.isEmpty())
		{
			refEntrada = novoNo;
			return;
		}
		
		No<T> auxiliar = refEntrada;
		for (int i = 0; i < this.size()-1; i++) 
		{
			auxiliar = auxiliar.getRefNo();
		}
		auxiliar.setRefNo(novoNo);
 		
	}
	
	private No<T> getNo(int indice)
	{
		if (indice >= this.size()) {
			throw new IndexOutOfBoundsException ("Esse indice não existe");
		}
		else 
		{
			No<T> auxiliar = refEntrada;
			No<T> retorno = null;
			
			for (int i = 0; i <= indice; i++) 
			{
				retorno = auxiliar;
				auxiliar = auxiliar.getRefNo();
			}
			return retorno;
		}	
	}
	
	public T get(int indice)
	{
		return getNo(indice).getConteudo();
	}
	
	public T remove(int indice)
	{
		No<T> removerNo = this.getNo(indice);
		if (indice == 0) 
		{
			refEntrada = removerNo.getRefNo();
			return removerNo.getConteudo();
		}

		No<T> noAnterior = getNo(indice - 1);
		noAnterior.setRefNo(removerNo.getRefNo());
		return removerNo.getConteudo();
	}
	
	@Override
	public String toString() 
	{
		String retorno = "";
		
		No<T> auxiliar = refEntrada;
		
		for (int i = 0; i < this.size(); i++) 
		{
			retorno += auxiliar.getConteudo() + " --> ";
			auxiliar = auxiliar.getRefNo();
		}
		retorno += " null";
		return retorno;
	}
}
