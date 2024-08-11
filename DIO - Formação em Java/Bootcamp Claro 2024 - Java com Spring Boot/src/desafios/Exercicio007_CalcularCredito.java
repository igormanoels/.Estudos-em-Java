package desafios;

import java.util.Scanner;

/* modelo de entrada de dados
    3
    10,local,0.10
    5,nacional,0.20
    2,internacional,0.50
 */
public class Exercicio007_CalcularCredito
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNextLine())
        {
            int n = Integer.parseInt(scanner.nextLine().trim());
            double totalCredito = 0.0;

            for (int i = 0; i < n; i++)
            {
                String[] dadosLigacao = scanner.nextLine().trim().split(",");
                int duracao = Integer.parseInt(dadosLigacao[0].trim());
                String tipoLigacao = dadosLigacao[1].trim();
                double valorPorMinuto = Double.parseDouble(dadosLigacao[2].trim());

                totalCredito += duracao * valorPorMinuto;
            }

            System.out.printf("%.2f%n", totalCredito);
        }

        scanner.close();
    }

}
