package model.estrutura;

public class No <T> {
	
	private T valor;
	private No<T> proximo;
	
	public No(T valor) {
		this.proximo = null;
		this.valor = valor;
	}
	
	public No(T valor, No<T> proximo) {
		this.valor = valor;
		this.proximo = proximo;
	}
	
	public void setValor(T valor) {
		this.valor = valor;
	}
	
	public T getValor() {
		return this.valor;
	}
	
	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}
	
	public No<T> getProximo() {
		return this.proximo;
	}
	
	@Override
	public String toString() {
		return valor.toString();
	}
}
