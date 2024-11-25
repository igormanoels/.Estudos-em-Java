package control;

import model.No;

public class ListaEncadeadaControl<T> {
    
    private No<T> inicio;
    
    public ListaEncadeadaControl() {
        this.inicio = null;
    }
    
    public boolean isEmpty() {
    	return this.inicio == null ? true: false;
    }
    
    public int tamanhoLista() {
        int tamanho = 0;
        No<T> refAuxiliar = inicio;
        
        while (refAuxiliar != null) {
            tamanho++;
            refAuxiliar = refAuxiliar.getProximoNo();
        }
        
        return tamanho;
    }
    
    public void adicionar(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()) {
            inicio = novoNo;
            return;
        }
        
        No<T> noAuxiliar = inicio;
        while (noAuxiliar.getProximoNo() != null) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximo(novoNo);
    }
    
    private No<T> procurarNo(int indice) {
        validarIndice(indice);
        No<T> noAuxiliar = inicio;
        
        for (int i = 0; i < indice; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        
        return noAuxiliar;
    }
    
    private void validarIndice(int indice) {
        if (indice < 0 || indice >= tamanhoLista()) {
            throw new IndexOutOfBoundsException("O índice solicitado não existe. A lista vai até " + (tamanhoLista() - 1));
        }
    }
    
    public T procurarConteudo(int indice) {
        return procurarNo(indice).getConteudo();
    }
    
    public T remover(int indice) {
        validarIndice(indice);
        No<T> noRemover = procurarNo(indice);
        
        if (indice == 0) {
            inicio = noRemover.getProximoNo();
            noRemover.setProximo(null);
            return noRemover.getConteudo();
        }
        
        No<T> noAnterior = procurarNo(indice - 1);
        noAnterior.setProximo(noRemover.getProximoNo());
        noRemover.setProximo(null);
        return noRemover.getConteudo();
    }
    
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        No<T> noAuxiliar = inicio;
        
        while (noAuxiliar != null) {
            str.append("No = ").append(noAuxiliar.getConteudo()).append(" -> ");
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        str.append("null");
        
        return str.toString();
    }
    

	public String toString(int indice) {
		return "No = " + procurarConteudo(indice);
	}

    
    
}
