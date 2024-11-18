package introducao.G_ListasCirculares;

public class No <T>
{
	private T conteudo;
	private No<T> priximoNo;
	
	public No(T conteudo) 
	{
		this.conteudo = conteudo;
		this.priximoNo = null;
	}

	public T getConteudo() {
		return this.conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No<T> getPriximoNo() {
		return this.priximoNo;
	}

	public void setPriximoNo(No<T> priximoNo) {
		this.priximoNo = priximoNo;
	}
	
	@Override
	public String toString() 
	{
		return "" + this.conteudo;
	}
}
