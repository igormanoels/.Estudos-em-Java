package desafios;

import java.util.Scanner;

//modelo de primeira entrada: movel
//Segunda entrada: Igor,fixa,movel,tv
public class Exercicio001_VerificarServico
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String servico = scanner.nextLine().trim(); // trim remove espaços e quebra de linha na entrada

        String entradaCliente = scanner.nextLine().trim();

        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;

        for (String serv: partes) if (serv.equalsIgnoreCase(servico)) contratado = true;
        if (contratado == true) System.out.println("Sim");
        else System.out.println("Nao");

        scanner.close();
    }
}
