package com.cursojava;


@SuppressWarnings("unused")
public class Literais {

	public static void main(String[] args) {
		
		// Hexadecimais
		int decimal= 26;
		
		int hexa = 0x1a;
		
		int octal = 032;
				
		// apenas funciona do Java 7 em diante
		int binario = 0b11010;
		
		
		// Os números podem ser separados por underline sem prejuízo
		long cpf = 120_423_124_90L;
				
		
		
		// Uma curiosidade são os número 31 em octal e 25 em decimal
		int oct31 = 031;
		int dec25 = 25;
		
		System.out.println(oct31 == dec25); // saída true
		
	}
	
}
