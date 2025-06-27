package com.cursojava;

public class SequenciaEscape {
	
	public static void main(String[] args) {
		
		// "Hello, World!" --> \" texto \"
		System.out.println("\"Hello, World!\"");

		// Quebra de linha --> \n
		System.out.print("\n\nHello, World!\n\n");

		// Tabulação --> \t
		System.out.println("Hello,\t World!");
		
		// Para digitar a barra no termianl --> \\
		System.out.print("1\\4");
		
		
		
	}

}
