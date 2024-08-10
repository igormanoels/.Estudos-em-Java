package projetos.B_no_Usando_Generics;

public class No<T>
{
	private T conteudo;
	private No<T> proximoNo;
	
	public No(T conteudo) 
	{
		this.conteudo = conteudo;
		this.proximoNo = null;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No<T> getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(No<T> proximoNo) {
		this.proximoNo = proximoNo;
	}
	
	@Override
	public String toString() 
	{
		return "" + this.conteudo;
	}
}
