package controller;

public class ColetaSO {
	
	/*****************************************
	 * Função Apenas para coletar nome do SO
	 */
	private String os()
	{
		String nomeOs = System.getProperty("os.name");
		// Teste do if: nomeOs = "Linux";
		return nomeOs;
	}
	
	public String getSo()
	{
		return this.os();
	}
	
		
}
