package introducao.C_Pilhas;

public class Pilha 
{
	private No refNoEntrada;
	
	public Pilha() 
	{
		// PRIMEIRO NÓ DA PILHA
		this.refNoEntrada = null;
	}
	
	public boolean isEmpty() 
	{
		return (refNoEntrada == null)? true: false;
	}
	
	// COLETA O TOPO
	public No top()
	{
		return refNoEntrada;
	}
	
	// EMPILHA
	public void push(No novoNo)
	{
		No refAuxiliar = refNoEntrada; 			// ITEM DO TOPO COPIADO NO AUXILIAR
		refNoEntrada = novoNo;					// ITEM DO TOPO PASSAR A SER O NOVO NÓ	
		refNoEntrada.setRefNo(refAuxiliar);		// A REFERENCIA DO NOVO NÓ PASSA A SER O TOPO ANTERIOR
	}
	
	public No pop()
	{
		// APONTA PRO MÉTODO DA CLASSE
		if (!this.isEmpty()) 
		{
			No noPoped = refNoEntrada;						// GUARDA O NÓ DO TOPO NO AUXILIAR
			refNoEntrada = refNoEntrada.getRefNo();			// O NOVO NÓ DE ENTRADA PASSA A SER O NÓ ATERIOR
			return noPoped;									// RETORNA O NÓ QUE ESTAVA NO TOPO
		}
		return null;
	}
	
	@Override
	public String toString() 
	{
		String retorno = "---------------\n";
		retorno += "     Pilha\n";
		retorno += "---------------\n";
		
		No noAuxiliar = refNoEntrada;
		
		while (true)
		{
			if (noAuxiliar != null)
			{
				retorno += "    Dado: " + noAuxiliar.getDado() + "\n";
				noAuxiliar = noAuxiliar.getRefNo();
			}
			else
			{
				break;
			}
		}
		
		retorno += "===============\n";
		return retorno;
		
	}
}
