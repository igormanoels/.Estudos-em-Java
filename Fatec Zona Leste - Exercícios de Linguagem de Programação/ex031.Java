package quadradodosnumeros;
 /**
 * @author GitHub @igormanoels
 */

public class QuadradoDosNumeros{
    public static void main (String[]args){
        Integer quadrado;

            System.out.println("Algoritmo: Cálcula o quadrado de 10 a 150");
            System.out.print("O quadrado é: ");

        for (int i = 10; i <= 150; i++)
            {
                quadrado = (i * i);
                    System.out.print(quadrado + ", ");
            }
    }
}