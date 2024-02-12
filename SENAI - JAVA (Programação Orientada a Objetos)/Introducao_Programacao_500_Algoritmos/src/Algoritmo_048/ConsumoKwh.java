package Algoritmo_048;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConsumoKwh {

	public static void main(String[] args) {
		double salmin, quantkw, kwUni, valorp, desc;
		 Scanner ler = new Scanner(System.in);
		 DecimalFormat formatar = new DecimalFormat("###,###,###.00");
		 
		 System.out.println("Algoritmo: Recebe o salário Mínimo e KW/h e imprime o valor a pagar com desconto.");
		 
		 System.out.print("Informe o valor do salário mínimo ");
		 	salmin = ler.nextDouble();
		 System.out.print("Informe a quantidade de Kw/h ");
		 	quantkw = ler.nextDouble();
		 
		 kwUni = (salmin / 700);
		 valorp = (quantkw * kwUni);
		 desc = (valorp * 0.9);
		 
		 String kwUniFormatado = formatar.format(kwUni);
		 	System.out.println("\nO valor do kw/h é de R$ " + kwUniFormatado);
		 String descFormatado = formatar.format(desc);
		 	System.out.println("Com o desconto de 10%, o valor a pagar é de R$ " + descFormatado);
		 
		 ler.close();
	}

}
