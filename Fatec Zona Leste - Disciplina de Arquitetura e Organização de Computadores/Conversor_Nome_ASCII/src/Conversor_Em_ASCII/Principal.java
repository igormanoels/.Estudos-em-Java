package Conversor_Em_ASCII;

import java.util.Scanner;

public class Principal {
	static String nome;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um nome para ser convertido em ASCII");
		nome = ler.nextLine();
		
        char[] letrasDoNome = nome.toCharArray();
        String[] valoresBinarios = new String[letrasDoNome.length];

        for (int i = 0; i < letrasDoNome.length; i++) {
            int valorASCII = (int) letrasDoNome[i]; 
            String valorBinario = Integer.toBinaryString(valorASCII); 

            while (valorBinario.length() < 8) {
                valorBinario = "0" + valorBinario;
            }
// adciona 0 caso o número não tenha os 8 digitos assim como na tabela apresentada no material
// fiz assim porque o espaço sai com 6 digitos e as letras com 7 digitos
            
            valoresBinarios[i] = valorBinario;
        }

        System.out.println("\nO nome " + nome + " em binario fica: ");
        for (int i = 0; i < valoresBinarios.length; i++) {
            System.out.print(valoresBinarios[i] + " ");
        }

	     ler.close();
	}
}