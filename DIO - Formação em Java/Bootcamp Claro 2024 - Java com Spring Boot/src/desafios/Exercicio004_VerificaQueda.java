package desafios;

import java.util.Collection;
import java.util.Scanner;

// Modelo de entrada de dados: 130,50,0,90,130,136
public class Exercicio004_VerificaQueda
{
    public static String verificarQuedaConexao(String[] velocidades)
    {
        for (String velo: velocidades) if (Integer.parseInt(velo) == 0) return "Queda de Conexao";
        return "Sem Quedas";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] velocidades = input.split(",");

        String resultado = verificarQuedaConexao(velocidades);
        System.out.println(resultado);

        scanner.close();
    }

}
