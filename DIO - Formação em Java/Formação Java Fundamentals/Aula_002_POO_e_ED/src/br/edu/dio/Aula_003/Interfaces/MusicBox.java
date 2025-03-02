package br.edu.dio.Aula_003.Interfaces;

public record MusicBox(String musica, boolean pausada) implements PlayerMusic {

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

}
