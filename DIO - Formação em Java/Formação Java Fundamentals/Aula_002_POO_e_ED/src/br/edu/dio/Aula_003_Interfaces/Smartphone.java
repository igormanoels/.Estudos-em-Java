package br.edu.dio.Aula_003.Interfaces;

public class Smartphone implements PlayerVideo, PlayerMusic{

	@Override
	public void playVideo() {
		System.out.println("Reproduzindo vídeo.");		
	}

	@Override
	public void pauseVideo() {
		System.out.println("Vídeo pausado.");	
	}

	@Override
	public void stopVideo() {
		System.out.println("Reprodução do vídeo encerrada.");
	}

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
