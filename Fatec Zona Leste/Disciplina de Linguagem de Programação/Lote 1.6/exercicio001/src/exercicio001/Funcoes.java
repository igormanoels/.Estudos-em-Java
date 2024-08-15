package exercicio001;

public class Funcoes {

	/*************************************************************************
	 * Função que gera valores via random 
	 * @param v --> recebe o tomanho do vetor que vem da classe principal
	 * @return v --> retorna para a classe principal o vetor que foi gerado
	 */
	public int[] gerarVetor(int[] v)
	{
		for (int i = 0; i < v.length; i++) 
		{
			v[i] = (int) (Math.round(Math.random() * 101));
		}
		return v;
	}
	
	
	/*******************************************************************************************
	 * Função que classifica o vetor 
	 * @param v --> recebe o vetor que vem da casse principal
	 * @return v --> retorna para a classe principal o vetor classificado conforme buble-sort
	 */
	public int[] classificaVetor(int[] v)
	{
		int aux;
		
		for (int i = 0; i < v.length-1; i++) 
		{
			for (int j = i+1; j < v.length; j++) 
			{
				if (v[i] > v[j]) 
				{
					aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}
			}
		}
		return v;
	}
	
	
	/*************************************************
	 * Procedimento que exibe o vetor em console
	 * @param v --> vetor que vem da classe principal
	 */
	public void exibeVetor(int[]v)
	{
		for (int i = 0; i < v.length; i++) 
		{
			System.out.print(v[i] + " ");
		}
		System.out.print("\n");
	}
}
