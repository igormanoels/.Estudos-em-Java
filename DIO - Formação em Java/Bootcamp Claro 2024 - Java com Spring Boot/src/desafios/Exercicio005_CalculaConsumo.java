package desafios;

import java.util.Scanner;

// Dados para teste: 2064,4000,2000,3200
public class Exercicio005_CalculaConsumo
{

    public static int calcularConsumoTotal(String[] consumoSemanal)
    {
        int total = 0;
        for (String c : consumoSemanal) total +=Integer.parseInt(c);
        return total;
    }

    public static int calcularMediaSemanal(int totalConsumo, int numeroDeSemanas)
    {
        return totalConsumo / numeroDeSemanas;
    }

    public static int identificarSemanaDeMaiorConsumo(String[] consumoSemanal)
    {
        int semanaDeMaiorConsumo = 0;
        int maiorConsumo = 0;

        for (int i = 0; i < consumoSemanal.length; i++)
        {
            int consumo = Integer.parseInt(consumoSemanal[i].trim());
            if (consumo > maiorConsumo) maiorConsumo = consumo;
        }

        for(int i = 0; i < consumoSemanal.length; i++)
        {
            if (consumoSemanal[i].equalsIgnoreCase(String.valueOf(maiorConsumo))) semanaDeMaiorConsumo = i;
        }
        return semanaDeMaiorConsumo + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] consumoSemanal = input.split(",");

        int totalConsumo = calcularConsumoTotal(consumoSemanal);

        int mediaSemanal = calcularMediaSemanal(totalConsumo, consumoSemanal.length);

        int semanaDeMaiorConsumo = identificarSemanaDeMaiorConsumo(consumoSemanal);

        System.out.println("Total mensal: " + totalConsumo + " MB");
        System.out.println("Media semanal: " + mediaSemanal + " MB");
        System.out.println("Maior consumo: Semana " + semanaDeMaiorConsumo);

        scanner.close();
    }
}
