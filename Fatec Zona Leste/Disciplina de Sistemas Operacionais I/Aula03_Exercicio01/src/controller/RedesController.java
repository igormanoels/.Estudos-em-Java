package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RedesController {
	
	public RedesController()
	{
		super();
	}
	
	/******************************
	 * Função para verifiacar o SO.
	 */ 
	private String os()
	{
		String nomeOs = System.getProperty("os.name");
		// Teste do if: nomeOs = "Linux";
		return nomeOs;
	}
	
	public String getCadeOS()
	{
		return this.os();
	}
	
	
	/*******************************
	 * Função para verifiacar o IP.    
	 */ 
	public void Cadeip(int op)
	{
        String os = os();
        
        try {
            if (os.toLowerCase().contains("windows")) 
            {
                @SuppressWarnings("deprecation")
                Process process = Runtime.getRuntime().exec("ipconfig");
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                String line;
                while ((line = reader.readLine()) != null) 
                {
                    if (line.contains("IPv4")) 
                    {
                        System.out.println(line.trim());
                    }
                }
                reader.close();
            } 
            else if (os.toLowerCase().contains("linux")) 
            {
                @SuppressWarnings("deprecation")
                Process process = Runtime.getRuntime().exec("ifconfig");
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                String line;
                while ((line = reader.readLine()) != null) 
                {
                    if (line.contains("inet ") && !line.contains("127.0.0.1")) 
                    {
                        String[] parts = line.trim().split("\\s+");
                        System.out.println(parts[1] + " " + parts[2]);
                    }
                }
                reader.close();
            } 
            else 
            {
                System.out.println("Sistema Operacional não suportado.");
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
			
	}
	
	
	/*********************************
	 * Função para verifiacar o ping.    
	 */
	public void qualPing() 
	{
        String os = os();
        try 
        {
            if (os.toLowerCase().contains("windows")) 
            {
                @SuppressWarnings("deprecation")
                Process process = Runtime.getRuntime().exec("ping -4 -n 10 www.google.com.br");
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                String line;
                while ((line = reader.readLine()) != null) 
                {
                    if (line.contains("dia")) 
                    {
                        System.out.println(line);
                    }
                }
                reader.close();
            } 
            else if (os.toLowerCase().contains("linux")) 
            {
                @SuppressWarnings("deprecation")
                Process process = Runtime.getRuntime().exec("ping -4 -c 10 www.google.com.br");
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                String line;
                while ((line = reader.readLine()) != null) 
                {
                    if (line.contains("rtt ")) 
                    {
                        System.out.println(line);
                    }
                }
                reader.close();
            } 
            else 
            {
                System.out.println("Sistema Operacional não suportado.");
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}