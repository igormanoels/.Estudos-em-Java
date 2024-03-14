package view;

import controller.ThreadId;

public class principal {

	public static void main(String[] args) 
	{
		
		for (int i = 0; i < 50; i++) 
		{
			ThreadId id = new ThreadId(i);
			id.start();
		}
		
	}
	
}
