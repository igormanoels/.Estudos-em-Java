package projetos.B_no;

public class No 
{
	private String conteudo;
	private No proximoNo;
	
	public No(String conteudo) 
	{
		this.conteudo = conteudo;
		this.proximoNo = null;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public No getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(No proximoNo) {
		this.proximoNo = proximoNo;
	}
	
	@Override
	public String toString() 
	{
		return this.conteudo;
	}
	
}
