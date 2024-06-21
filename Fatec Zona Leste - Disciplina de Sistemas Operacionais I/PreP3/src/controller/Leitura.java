package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leitura {
    public void VerificarData(String caminho, String feriado) throws IOException 
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(caminho))) 
        {
            String linha;
            boolean encontrado = false;

            while ((linha = reader.readLine()) != null) 
            {
                if (linha.contains(feriado)) 
                {
                    String[] partes = linha.split("\"date\":");
                    if (partes.length > 1) 
                    {
                        String data = partes[1].split(",")[0].replace("\"", "").trim();
                        System.out.printf("Feriado: %s, Data: %s\n", feriado, data );
                        System.out.println("");
                        encontrado = true;
                        break;
                    }
                }
            }

            if (!encontrado) 
            {
                throw new IOException("Feriado não encontrado. Reinicie a aplicação e informe o dado novamente.");
            }
        } 
        catch (IOException e) 
        {
            System.err.println("Erro: " + e.getMessage());
            throw e;
        }
    }
}