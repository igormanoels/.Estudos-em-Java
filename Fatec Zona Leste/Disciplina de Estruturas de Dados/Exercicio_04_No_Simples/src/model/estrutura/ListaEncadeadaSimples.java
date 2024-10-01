package model.estrutura;

public class ListaEncadeadaSimples <T> {
	private No<T> inicio = null;
	
	// Adciona elemento ao final
	public void append (T elemento) {
		No<T> buffer = new No<T>(elemento);
		if(this.inicio == null) {
			this.inicio = buffer;
		} else {
			this.last().setPriximo(buffer);
		}
	}
	
	//Returna um No apartir de um indice
	public No<T> get(int index) throws IllegalArgumentException {
		int i = 0;
		if (this.inicio == null)
			throw new IllegalArgumentException ("Não existe item na lista.");
		
		No<T> buffer = this.inicio;
		
		for (int j = 0; j < index; j++) {
			if(buffer.getProximo() == null) break;
			buffer = buffer.getProximo();
		}
		
		if(i < index)
			throw new IllegalArgumentException ("O indice informado não existe");
		return buffer;
	}
	
	
}
