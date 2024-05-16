package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FifaController implements IFifaController {
    @Override
    public void empilhaBrasileiros(String caminho, String nome) throws IOException 
    {
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) 
        {
            String linha = br.readLine();
            while ((linha = br.readLine()) != null) 
            {
                String[] dados = linha.split(",");
                if (dados[14].equals("Brazil")) 
                {
                    String nomeJogador = dados[2];
                    int overall = Integer.parseInt(dados[3]);
                    if (overall > 80) 
                    {
                        System.out.println(nomeJogador + ", Overall: " + overall);
                    }
                }
            }
        }
    }

    @Override
    public void desempilhaBonsBrasileiros(String caminho, String nome) throws IOException 
    {
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) 
        {
            String linha = br.readLine();
            while ((linha = br.readLine()) != null) 
            {
                String[] dados = linha.split(",");
                int overall = Integer.parseInt(dados[3]);
                if (overall > 80) {
                    String nomeJogador = dados[2];
                    System.out.println(nomeJogador + ", Overall: " + overall);
                }
            }
        }
    }

    @Override
    public void listaRevelacoes(String caminho, String nome) throws IOException 
    {
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) 
        {
            String linha = br.readLine();
            while ((linha = br.readLine()) != null) 
            {
                String[] dados = linha.split(",");
                int idade = Integer.parseInt(dados[6]);
                if (idade <= 20) 
                {
                    String nomeJogador = dados[2];
                    int overall = Integer.parseInt(dados[3]);
                    if (overall > 80) 
                    {
                        System.out.println(nomeJogador + ", Idade: " + idade + ", Overall: " + overall);
                    }
                }
            }
        }
    }

    @Override
    public void buscaListaBonsJovens(String caminho, String nome) throws IOException 
    {
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) 
        {
            String linha = br.readLine();
            while ((linha = br.readLine()) != null) 
            {
                String[] dados = linha.split(",");
                int idade = Integer.parseInt(dados[6]);
                int overall = Integer.parseInt(dados[3]);
                if (overall > 80 && idade <= 20) 
                {
                    String nomeJogador = dados[2];
                    System.out.println(nomeJogador + ", Idade: " + idade + ", Overall: " + overall);
                }
            }
        }
    }
}
