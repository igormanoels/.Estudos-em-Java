package model.estrutura;

import java.lang.Exception;
import model.estrutura.No;

public class CircularDupla<T> {
	private No<T> ultimo_elemento = null;
	
	public void append(T elemento){
		No<T> novo = new No<T>(elemento);
		if(this.ultimo_elemento == null){
			this.ultimo_elemento = novo;
			novo.setProximo(novo);
			novo.setAnterior(novo);
		} else {
			No<T> buffer_ultimo = this.ultimo_elemento;
			No<T> buffer_proximo = this.ultimo_elemento.getProximo();
			novo.setAnterior(buffer_ultimo);
			novo.setProximo(buffer_proximo);
			buffer_proximo.setAnterior(novo);
			buffer_ultimo.setProximo(novo);
			this.ultimo_elemento = novo;
		}
	}
	
	public No<T> getLast() throws IllegalArgumentException {
		if(this.ultimo_elemento == null)
			throw new IllegalArgumentException ("Não existe item na lista.");
		return this.ultimo_elemento;
	}
	
	public void remove(No<T> remover) {
		No<T> anterior = remover.getAnterior();
		No<T> proximo = remover.getProximo();
		if(this.ultimo_elemento == remover && anterior == remover && proximo == remover) {
			this.ultimo_elemento = null;
			return;
		}
		anterior.setProximo(proximo);
		proximo.setAnterior(anterior);
		if(this.ultimo_elemento == remover){
			this.ultimo_elemento = anterior;
		}
		remover.setProximo(null);
		remover.setAnterior(null);
		remover.setValor(null);
	}
	
	public void remove() throws IllegalArgumentException
	{
		remove(getLast());
	}
	
	public int total() {
		if(this.ultimo_elemento == null) return 0;
		No<T> buffer = this.ultimo_elemento;
		int total_elementos = 0;
		do{
			total_elementos++;
			buffer = buffer.getProximo();
		} while (buffer != this.ultimo_elemento);
		return total_elementos;
	}
	
	@Override
	public String toString(){
		if (this.ultimo_elemento == null) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder(":");
		No<T> buffer = this.ultimo_elemento;
		builder.append(buffer.getValor());
		while (buffer.getProximo() != this.ultimo_elemento){
			builder.append(".");
			buffer = buffer.getProximo();
			builder.append(buffer.getValor());
		}
		builder.append(":");
		return builder.toString();
	}
	

}