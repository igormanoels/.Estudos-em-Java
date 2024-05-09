package view;

import controller.IArquivosController;
import controller.ArquivosController;

public class Principal {

	public static void main(String[] args) 
	{
		IArquivosController arqOpen = new ArquivosController();
		
		String file = "C:\\TEMP";
		String arch = "generic_food.csv";
		
		try 
		{
			arqOpen.readFile(file, arch);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
