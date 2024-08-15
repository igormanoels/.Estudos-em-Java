package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistroController {
	
	/********************************
	 * Função para verifiacar o SO.
	 */ 
	private String os() {
        return System.getProperty("os.name");
    }

    public String qualOs() {
        String osName = os();
        return osName;
    }

    
    /***********************************************************
	 * Função para verifiacar as propriedades da distribuição.
	 */ 
    public static void exibirDistro() {
        try {
            Process processo = Runtime.getRuntime().exec("cat /etc/os-release");
            BufferedReader leitura = new BufferedReader(new InputStreamReader(processo.getInputStream()));
            String linhas;
            String distroName = null;
            String distroVersion = null;

            while ((linhas = leitura.readLine()) != null) 
            {
                if (linhas.startsWith("PRETTY_NAME=")) 
                {
                    distroName = linhas.substring(13).replaceAll("\"", "");
                } 
                else if (linhas.startsWith("VERSION_ID=")) 
                {
                    distroVersion = linhas.substring(11).replaceAll("\"", "");
                }
            }

            leitura.close();

            if (distroName != null && distroVersion != null) 
            {
                System.out.println("Distribuição: " + distroName);
                System.out.println("Versão: " + distroVersion);
            } 
            else 
            {
                System.out.println("Não foi possível obter informações sobre a distribuição.");
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
