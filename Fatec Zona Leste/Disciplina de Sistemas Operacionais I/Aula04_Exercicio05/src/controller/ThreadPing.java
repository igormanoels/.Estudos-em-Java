package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreadPing extends Thread {
	
 	private String[] sites = new String[3];
	
	public ThreadPing(String uol, String terra, String google) 
	{
		this.sites[0] = uol;
		this.sites[1] = terra;
		this.sites[2] = google;
	}
	
	public void run() 
	{
		for (String site : sites) 
		{
			for (int i = 0; i < 10; i++) 
			{
				try 
				{
					@SuppressWarnings("deprecation")
					Process process = Runtime.getRuntime().exec("ping -4 -c 1 " + site);
					BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
					String line;
					while ((line = reader.readLine()) != null) 
					{
						if (line.contains("time=")) 
						{ 
							String[] parts = line.trim().split("\\s+");
							System.out.println(site + " - Tempo: " + parts[6].substring(5) + " ms"); // Mudança: Extrai o tempo de ping
						}
					}
					reader.close();
					Thread.sleep(1000); 
					
				} 
				catch (IOException | InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
}
