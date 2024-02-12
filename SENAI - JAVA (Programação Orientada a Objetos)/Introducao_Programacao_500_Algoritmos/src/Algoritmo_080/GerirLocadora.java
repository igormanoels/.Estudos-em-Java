package Algoritmo_080;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GerirLocadora {
	static int qFitas;
	static double pFitas, receitaMensal, receitaAtrasos, receitaTotal;
	static String recAnFormatada, recAtFormatada, recTotFormatada;
			
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("###,###,###,###.00");
		System.out.println("Algoritmo: Lê a quantidade de fitas e o seu preço e imprimi o faturamento, perdas e a reposição.");
		
		System.out.print("Informe a quantidade de Fitas: ");
			qFitas = ler.nextInt();
		System.out.print("Informe o preço unitário da locação: R$ ");
			pFitas = ler.nextDouble();
		
		receitaMensal = ((pFitas * (int) (qFitas / 3)));
			recAnFormatada = formatar.format(receitaMensal);
		receitaAtrasos = ((receitaMensal * 0.1) * 1.1);
			recAtFormatada = formatar.format(receitaAtrasos);
		receitaTotal = ((receitaMensal * 12) + (receitaAtrasos * 12));
			recTotFormatada = formatar.format(receitaTotal);
		qFitas = (int) ((qFitas * 1.1)-(qFitas*0.02));
							
		System.out.println("\nReceita Mensal com os Aluguéis: R$ " + recAnFormatada);
		System.out.println("Receita Mensal com os Atrasos: R$ " + recAtFormatada);
		System.out.println("Receita Anual Total: R$" + recTotFormatada);
		System.out.println("Quantidade total de Fitas após reposição: " + qFitas + " uni");
		
		ler.close();
	}

}
