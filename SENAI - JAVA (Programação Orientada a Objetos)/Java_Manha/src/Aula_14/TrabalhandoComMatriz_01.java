package Aula_14;

public class TrabalhandoComMatriz_01 {

	public static void main(String[] args) {
//primeira forma de desenhar uma matriz
		int matriz_01[][] = new int [3][3];

// segunda forma de desenhar uma matriz 
		int matriz_02[][] = {
								{1,2,3},
								{4,5,6},
								{7,8,9}
							};
		mostrarMatriz(matriz_01);
		mostrarMatriz(matriz_02);

	}

	public static void mostrarMatriz(int m[][]){
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
					System.out.print(" " + m[i][j]);
					
			}
		}
		System.out.println("");	
	}

}
