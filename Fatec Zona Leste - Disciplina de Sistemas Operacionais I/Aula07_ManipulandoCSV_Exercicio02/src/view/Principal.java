package view;

import java.util.Scanner;
import controller.ISteamController;
import controller.SteamController;

public class Principal {

    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        ISteamController arqOpen = new SteamController();

        String file = "C:\\TEMP";
        String arch = "SteamCharts.csv";

        System.out.print("Informe o mês desejado: ");
        String mes = ler.nextLine();

        System.out.print("Informe o ano desejado: ");
        String ano = ler.nextLine();
        
        System.out.print("Informe a partir de qual média deseja ver: ");
        int media = ler.nextInt();

        System.out.println("\n");

        try 
        {
            arqOpen.readFile(file, arch, mes, ano, media);
            arqOpen.creatFile(file, "MeuArquivo.csv", mes, ano, media);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
        ler.close();
    }
}

