package model;

public class No<T> {
	
	private T conteudo;
	private No<T> proximoNo;

	public No() {
		this.proximoNo = null;
	}
	
	public No(T conteudo) {
		this.conteudo = conteudo;
		this.proximoNo = null;
	}
	
	public No(T conteudo, No<T> no) {
		this.conteudo = conteudo;
		this.proximoNo = no;
	}
	
	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}
	
	public T getConteudo() {
		return this.conteudo;
	}
	
	public void setProximo(No<T> proximo) {
		this.proximoNo = proximo;
	}
	
	public No<T> getProximoNo () {
		return this.proximoNo;
	}


}
