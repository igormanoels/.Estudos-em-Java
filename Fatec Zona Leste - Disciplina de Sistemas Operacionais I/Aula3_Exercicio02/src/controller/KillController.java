package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KillController {

	public KillController () 
	{
		super();
	}
	
	/******************************
	 * Função para verifiacar o SO.
	 */ 
	private String coletaSO() 
	{
		String qSO = System.getProperty("os.name");
		return qSO;
	}
	
	public String infoSO() 
	{
				
		return this.coletaSO();
	}
	
	
	/*****************************************************************
	 * Função para Listar as tarefas que estão sendo executadas no SO.
	 */ 
	public void listaProcessos(String SO)
	{
        String command = "";

        if (SO.contains("Windows")) 
        {
            command = "TASKLIST /FO TABLE";
        } 
        else if (SO.contains("Linux")) 
        {
            command = "ps -ef";
        } 
        else 
        {
            System.err.println("Sistema operacional não suportado.");
            return;
        }

        try {
            Process processo = Runtime.getRuntime().exec(command);
            BufferedReader leitura = new BufferedReader(new InputStreamReader(processo.getInputStream()));
            String linha;

            while ((linha = leitura.readLine()) != null) 
            {
                System.out.println(linha);
            }

            leitura.close();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
	}
	

	/******************************************************************************
	 * Função para finalizar uma tarefas que está sendo executadas no SO pelo PID.
	 */ 
	public void mataPid(String pid, String SO)
	{
		String command = "";

        if (SO.contains("Windows")) 
        {
            command = "TASKKILL /PID " + pid;
        } 
        else if (SO.contains("Linux")) 
        {
            command = "kill -9 " + pid;
        } 
        else 
        {
            System.err.println("Sistema operacional não suportado.");
            return;
        }

        try 
        {
            Process processo = Runtime.getRuntime().exec(command);
            BufferedReader leitura = new BufferedReader(new InputStreamReader(processo.getInputStream()));
            String linha;

            while ((linha = leitura.readLine()) != null) 
            {
                System.out.println(linha);
            }

            leitura.close();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
	}
	
	
	/********************************************************************************
	 * Função para finalizar uma tarefas que está sendo executadas no SO pelo Nome.
	 */  
	public void mataNome(String nome, String SO) {
        String comando = "";

        if (SO.contains("Windows")) 
        {
            comando = "TASKKILL /F /IM " + nome;
        } 
        else if (SO.contains("Linux")) 
        {
            comando = "pkill -f " + nome;
        } 
        else 
        {
            System.err.println("Sistema operacional não suportado.");
            return;
        }

        try {
            Process processo = Runtime.getRuntime().exec(comando);
            BufferedReader leitura = new BufferedReader(new InputStreamReader(processo.getInputStream()));
            String linha;

            while ((linha = leitura.readLine()) != null) 
            {
                System.out.println(linha);
            }

            leitura.close();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
	
}
