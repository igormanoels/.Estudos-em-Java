package view;

import controller.DistroController;

public class Main {

	public static void main(String[] args) {
		DistroController DistroController = new DistroController();
		
		System.out.println("Seja bem vindo ao exercício 3.");
		
		String os = DistroController.qualOs();
		System.out.println("Sistema Operacional:  " + os);

		if (os.toLowerCase().contains("linux")) 
		{
			DistroController.exibirDistro();
        } 
		else 
		{
            System.out.println("Este programa é exclusivo para Linux.");
        }
		
	}

}
