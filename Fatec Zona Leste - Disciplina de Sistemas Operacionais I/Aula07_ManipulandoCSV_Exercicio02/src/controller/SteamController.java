package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SteamController implements ISteamController {

    public SteamController() {
        super();
    }

    @Override
    public void readFile(String path, String nome, String mes, String ano, int media) throws IOException 
    {
        String arquivo = path + "\\" + nome;

        try (BufferedReader bufferRead = new BufferedReader(new FileReader(arquivo))) 
        {
            String linha;
            bufferRead.readLine();
            
            System.out.printf("%-30s %-20s %-10s %-30s\n", "Nome do Jogo", "Ano", "Mês", "Média de Jogadores Ativos");
            
            while ((linha = bufferRead.readLine()) != null) 
            {
                String[] partes = linha.split(",");
                if (partes.length >= 7) 
                { 
                    String nomeJogo = partes[0];
                    String anoJogo = partes[1];
                    String mesJogo = partes[2];
                    
                    double mediaJogadores = 0.0;
                    try 
                    {
                        mediaJogadores = Double.parseDouble(partes[3]);
                    } 
                    catch (NumberFormatException e) 
                    {
                        System.out.println("Erro ao converter média de jogadores ativos para número na linha: " + linha);
                        continue;
                    }

                    if (anoJogo.equals(ano) && mesJogo.equalsIgnoreCase(mes) && mediaJogadores >= media) 
                    {
                        System.out.printf("%-30s %-20s %-10s %-30s\n", nomeJogo, anoJogo, mesJogo, mediaJogadores);
                    }
                }
            }
        }
    }

    @Override
    public void creatFile(String path, String nome, String mes, String ano, int media) throws IOException 
    {
        String arquivo = path + "\\" + "SteamCharts.csv";
        String novoArquivo = path + "\\" + nome;

        try (BufferedReader bufferRead = new BufferedReader(new FileReader(arquivo));
             FileWriter fileWrite = new FileWriter(novoArquivo);
             BufferedWriter bufferWrite = new BufferedWriter(fileWrite)) {

            String linha;
            bufferWrite.write("Nome do Jogo ; Média de Jogadores Ativos\n");
            bufferRead.readLine();
            
            while ((linha = bufferRead.readLine()) != null) 
            {
                String[] partes = linha.split(",");
                if (partes.length >= 7) 
                {
                    String nomeJogo = partes[0];
                    String anoJogo = partes[1];
                    String mesJogo = partes[2];
                    
                    double mediaJogadores = 0.0;
                    
                    try 
                    {
                        mediaJogadores = Double.parseDouble(partes[3]);
                    } 
                    catch (NumberFormatException e) 
                    {
                        System.out.println("Erro ao converter média de jogadores ativos para número na linha: " + linha);
                        continue;
                    }

                    if (anoJogo.equals(ano) && mesJogo.equalsIgnoreCase(mes) && mediaJogadores >= media) 
                    {
                    	bufferWrite.write(nomeJogo + " ; " + mediaJogadores + "\n");
                    }
                }
            }
        }
    }
}
