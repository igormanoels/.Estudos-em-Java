package br.edu.dio.Aula_003_Interfaces;

public class Main {

	public static void main(String[] args) {
		
		// Classe anônima, onde a implementação da classe está na propria instancia
		PlayerMusic pm = new PlayerMusic() {

			@Override
			public void playMusica() {
				System.out.println("Tocando música.");
			}

			@Override
			public void pauseMusica() {
				System.out.println("Música pausada.");
			}

			@Override
			public void stopMusica() {
				System.out.println("Música encerrada.");
			}
		};
		
		pm.playMusica();
		
		
		Smartphone sm = new Smartphone();
		sm.playVideo();
		sm.pauseVideo();
		sm.playVideo();
		sm.stopVideo();
	}
}
