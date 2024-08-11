package desafios;

import java.util.Scanner;

// Modelo de entrada tv,banda larga, movel
public class Exercicio002_VerificarCombo
{

    public static String verificarComboCompleto(String[] servicosContratados) {
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        for (String servico : servicosContratados)
        {
            if (servico.equalsIgnoreCase("movel")) movelContratado = true;
            else if(servico.equalsIgnoreCase("tv")) tvContratada = true;
            else if(servico.equalsIgnoreCase("banda larga")) bandaLargaContratada = true;
        }

        if (movelContratado == true && bandaLargaContratada == true && tvContratada == true) return "Combo Completo";

        return "Combo Incompleto";

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] servicosContratados = input.split(",");

        String resultado = verificarComboCompleto(servicosContratados);
        System.out.println(resultado);

        scanner.close();
    }
}
