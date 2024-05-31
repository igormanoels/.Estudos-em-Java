package controller;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class GestorArquivos 
{
    public static void start() 
    {
        String diretorio = "C:\\TEMP";
        listFilesBySize(diretorio);
    }

    private static void listFilesBySize(String diretorio) 
    {
        File dir = new File(diretorio);

        if (!dir.isDirectory()) 
        {
            System.out.println("O caminho especificado não é um diretório válido.");
            return;
        }

        File[] files = dir.listFiles();
        
        Arrays.sort(files, Comparator.comparingLong(File::length));

        for (File file : files) 
        {
            double tamanhoMB = (double) file.length() / (1024 * 1024);
            System.out.println(file.getName() + ": " + tamanhoMB + " MB");
        }
    }
}

