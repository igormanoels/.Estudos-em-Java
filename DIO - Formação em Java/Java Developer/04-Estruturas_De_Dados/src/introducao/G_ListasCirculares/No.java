package introducao.G_ListasCirculares;

public class No <T>
{
	private T conteudo;
	private No priximoNo;
	
	public No(T conteudo) 
	{
		this.conteudo = conteudo;
		this.priximoNo = null;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No getPriximoNo() {
		return priximoNo;
	}

	public void setPriximoNo(No priximoNo) {
		this.priximoNo = priximoNo;
	}
	
	@Override
	public String toString() 
	{
		return "" + conteudo;
	}
}
