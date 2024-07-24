package edu.dio.aula09Polimorfismo;

import java.util.Scanner;

public abstract class Quadrilatero 
{
	/*
	 * 	o polimorfismo permite que referências de tipos de classes mais abstratas 
	 * 	representem o comportamento das classes concretas que referenciam. Assim, 
	 * 	é possível tratar vários tipos de maneira homogênea.
	 */
	public abstract void calcularPerimetro(Scanner ler);
}
