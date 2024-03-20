package exercicio_01_recursividade;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  Recursividade Ex_01. Serie1 = (1+2+3+...+100)
 */

public class Exercicio_01_recursividade {

    public static void main(String[] args) 
    {
        int num = 0, res;
        res = funRec01(num);
        System.out.println("Resposta da função: " + res);
    }
    
    
    /*********************************************************
     * Função que calcula a média dos valores entre 10 a 200.
     */
    static int funRec01(int n)
    {
        if (n < 100) 
        {
            n+=1;
            funRec01(n);
        }
        return n;
    }
    
}
