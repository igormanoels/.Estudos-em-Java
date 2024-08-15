package exercicio002;

public class Funcoes {
	
	/***************************************************************
	 * 
	 * @param m matriz 
	 * @return
	 */
	public int[][] gerarMatriz(int[][] m)
	{
		
		for (int i = 0; i < m.length; i++) 
		{
			for (int j = 0; j < m[i].length; j++) 
			{
				m[i][j] = (int) (Math.round(Math.random() * 90) + 9);

			}
		}
		
		return m;	
	}
	
	
	
	public int[][] classificaMatriz(int [][] m)
	{
		int vet[] = new int[100];
		int cont = 0, aux;
		
		// Cópia matriz no vetor
		for (int i = 0; i < m.length; i++) 
		{
			for (int j = 0; j < m[i].length; j++) 
			{
				vet[cont] = m[i][j];
				cont++;	
			}
		}
		
		// Classifica o vetor
		for (int i = 0; i < vet.length-1; i++) 
		{
			for (int j = i+1; j < vet.length; j++) 
			{
				if (vet[i] > vet[j]) 
				{
					aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;
					//System.out.println(vet[i] + vet[j]);
				} 			
			}
		}
		
		// copia o vetor de volta na matriz
		cont= 0;
		for (int i = 0; i < m.length; i++) 
		{
			for (int j = 0; j < m[i].length; j++) 
			{
				m[i][j] = vet[cont];
				cont++;
			}
		}
		
		
		return m;
	}
	
		
	public void exibeMatriz(int[][] m)
	{
		for (int i = 0; i < m.length; i++) 
		{
			for (int j = 0; j < m[i].length; j++) 
			{
				System.out.print(m[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
