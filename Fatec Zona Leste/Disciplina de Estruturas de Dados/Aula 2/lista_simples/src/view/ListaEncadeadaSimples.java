package view;

import controller.ListaEncadeadaSimplesController;

public class ListaEncadeadaSimples{
	public static void main(String[] ags) {
		try{
			ListaEncadeadaSimplesController obj = new 
			ListaEncadeadaSimplesController();
			System.out.println(obj.teste());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}