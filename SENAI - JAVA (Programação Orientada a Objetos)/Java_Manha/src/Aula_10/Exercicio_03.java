package Aula_10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_03 {
	static int tcomb, tpgmt, lts;
	static double preco, desc, acrec, pgmt;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("###,###,###.00");
		
		System.out.println("Informe o tipo de combustivel");
		System.out.println("Digite 1 para Gasolina Comum");
		System.out.println("Digite 2 para Álcool");
		System.out.println("Digite 3 para Diesel");
		System.out.println("Digite 4 para Gasolina Aditivada");
			tcomb = ler.nextInt();
		
		switch (tcomb) {
		case 1:
			preco = 2.992;
			break;
		case 2:
			preco = 2.1095;
			break;
		case 3:
			preco = 2.283;
			break;
		case 4:
			preco = 3.054;
			break;
		default:
		}

		System.out.println("Informe a quantidade de Litros de Combustivel");
	 	lts = ler.nextInt();

		System.out.println("Informe agora a condição de pagamento");
		System.out.println("Digite 1 para Pagamento a Vista");
		System.out.println("Digite 2 para Pagamento com Cheque pré-datado");
			tpgmt = ler.nextInt();
			
		if (tpgmt == 1) {
			desc = 5.3;
			pgmt = (lts * preco);
			pgmt = (pgmt - ((pgmt * desc)/100));
		} else if (tpgmt == 2){
			acrec = 8.9;
			pgmt = (lts * preco);
			pgmt = (pgmt + ((pgmt * desc)/100));
		}
		
		String pgmtFormatado = formatar.format(pgmt);
			System.out.println("Valor para Pagamento: R$ " + pgmtFormatado);
		ler.close();
	}

}
