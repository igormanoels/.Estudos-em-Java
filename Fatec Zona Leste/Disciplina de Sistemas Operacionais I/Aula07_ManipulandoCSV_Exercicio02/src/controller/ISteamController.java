package controller;

import java.io.IOException;

public interface ISteamController {
	
	public void creatFile(String path, String nome, String mes, String ano, int media) throws IOException;
	public void readFile(String path, String nome, String mes, String ano, int media) throws IOException;
	
	
}
