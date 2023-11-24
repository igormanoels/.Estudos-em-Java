package Aula_14;

public class TrabalhandoComMatriz_01 {

	public static void main(String[] args) {
		int matriz_01[][] = new int [3][3];
//primeira forma de desenhar uma matriz
		int matriz_02[][] = {
								{1,2,3},
								{4,5,6},
								{7,8,9}
							};
// segunda forma de desenhar uma matriz 
		
		for (int i = 0; i < matriz_02.length; i++) {
			for (int j = 0; j < matriz_02.length; j++) {
					System.out.println("\n"+matriz_02[i][j]);
					
			}
		}		
		
	}

}
