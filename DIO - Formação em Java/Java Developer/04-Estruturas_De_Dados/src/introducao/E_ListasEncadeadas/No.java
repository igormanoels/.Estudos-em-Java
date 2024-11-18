package introducao.E_ListasEncadeadas;

public class No <T>
{
	private T conteudo;
	private No<T> refNo;
	
	public No() 
	{ 
		this.refNo = null; 
	}
	
	public No(T conteudo)
	{
		this.refNo = null;
		this.conteudo = conteudo;
	}
	
	public No(T conteudo, No<T> refNo)
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

	public No<T> getRefNo() {
		return refNo;
	}

	public void setRefNo(No<T> refNo) {
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
