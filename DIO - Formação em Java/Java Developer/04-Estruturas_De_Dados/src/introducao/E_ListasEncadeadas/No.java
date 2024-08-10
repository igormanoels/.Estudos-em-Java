package introducao.E_ListasEncadeadas;

public class No <T>
{
	private T conteudo;
	private No refNo;
	
	public No() 
	{ 
		this.refNo = null; 
	}
	
	public No(T conteudo)
	{
		this.refNo = null;
		this.conteudo = conteudo;
	}
	
	public No(T conteudo, No refNo)
	{
		this.refNo = refNo;
		this.conteudo = conteudo;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No getRefNo() {
		return refNo;
	}

	public void setRefNo(No refNo) {
		this.refNo = refNo;
	}
	
	@Override
	public String toString() 
	{
		return " "+conteudo;
	}
	
	public String toStringEncadeado() 
	{
		String str = "" + conteudo;
		
		if (refNo != null) 
		{
			str += " --> " + refNo.getConteudo();
		}
		else
		{
			str += " --> null"; 
		}
		return str;
	}
	

}
