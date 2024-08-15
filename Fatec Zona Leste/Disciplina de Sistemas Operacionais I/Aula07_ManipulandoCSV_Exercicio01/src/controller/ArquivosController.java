package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArquivosController implements IArquivosController {
	
	public ArquivosController() {
		super();
	}

	public void readFile(String path, String nome) throws IOException {
		// Caminho e arquivo a ser lido
		File arq = new File(path, nome);
		
		if (arq.exists() && arq.isFile()) 
		{
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			
			String linha = buffer.readLine();
			
			System.out.printf("%-20s %-30s %-20s %-20s\n", 
					"FOOD NAME", "SCIENTIFIC NAME", "GROUP", "SUB GROUP");
	        System.out.println("-------------------------------------------------------------------------------------");

			while ((linha = buffer.readLine()) != null) 
			{
	            String[] partes = linha.split(","); // Cria um vetor de string seperando por virgula conforme csv

	            
	            if (partes[2].equals("Fruits")) // Compara o indice 2 do vetor de string criado
	            {
	            	
	                System.out.printf("%-20s %-30s %-20s %-20s\n", 
	                		partes[0], partes[1], partes[2], partes[3]); // printf separa os conteudos a partir do tamanho do campo para ficar bonitinho
	            }
	        }
			// Não esquece de sempre fechar conforme orientação do video, é o mesmo principio do scanner
			buffer.close();
			leitor.close();
			fluxo.close();
		} 
		else 
		{
			throw new IOException("O arquivo não está presente no diretório especificado");
		}
	}
	
	
	
}
