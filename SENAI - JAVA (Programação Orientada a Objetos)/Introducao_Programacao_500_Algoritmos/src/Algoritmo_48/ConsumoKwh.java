package Algoritmo_48;

import java.util.Scanner;

public class ConsumoKwh {

	public static void main(String[] args) {
		double salmin, quantkw, kwUni, valorp, desc;
		 Scanner ler = new Scanner(System.in);
		 
		 System.out.println("Informe o valor do salário mínimo");
		 salmin = ler.nextDouble();
		 
		 System.out.println("Informe a quantidade de Kw/h");
		 quantkw = ler.nextDouble();
		 
		 kwUni = (salmin / 700);
		 valorp = (quantkw * kwUni);
		 desc = (valorp * 0.9);
		 
		 System.out.println("O valor do kw/h é de R$" + kwUni);
		 System.out.println("Com o desconto de 10%, o valor a pagar é de R$" + desc);
		 
	}

}
