package view;

import controller.ListaEncadeadaDuplaController;

public class ListaEncadeadaDupla{
	public static void main(String[] args) {
		try{
			ListaEncadeadaDuplaController obj = new
			ListaEncadeadaDuplaController();
			System.out.println(obj.teste());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}