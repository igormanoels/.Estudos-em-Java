package desafios;

import java.util.Scanner;

// Modelo de entrada 130,134,132,130,130,136
public class Exercicio003_VereficarVelocidade
{
    public static double calcularVelocidadeMedia(String[] velocidades) {
        int total = 0;
        for (String v: velocidades) total += Integer.parseInt(v);
        return total / velocidades.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] velocidades = input.split(",");

        double velocidadeMedia = calcularVelocidadeMedia(velocidades);

        System.out.println((int)velocidadeMedia + " Mbps");

        scanner.close();
    }
}
