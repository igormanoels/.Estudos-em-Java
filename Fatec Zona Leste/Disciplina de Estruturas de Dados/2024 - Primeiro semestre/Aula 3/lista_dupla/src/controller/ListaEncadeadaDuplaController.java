package controller;

import model.estrutura.ListaEncadeadaDupla;
import model.estrutura.No;

public class ListaEncadeadaDuplaController{
	public ListaEncadeadaDuplaController(){
		super();
	}
	
	public String teste() throws Exception{
		ListaEncadeadaDupla lista = new ListaEncadeadaDupla();
		
		lista.append(1);
		lista.append(2);
		lista.append(3);
		lista.insert(1, 0);
		
		return lista.toString();
	}
	
}

