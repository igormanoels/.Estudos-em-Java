package br.edu.dio.Aula_003.Interfaces;

public interface PlayerMusic {
	
	// Interfaces podem aceitar variaveis, desde que elas sejam inicializadas. 
	//Fica subentendido que são do tipo 'final', 'public' e 'static'
	public String musica = "Cantiga de ninar";

	
	// Interfaces trabalhando com métodos abstrados, sem possibilidade de implementação
	void playMusica();
	
	void pauseMusica();
	
	void stopMusica();


}
