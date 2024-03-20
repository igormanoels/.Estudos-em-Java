package pkg01_recursividade;

public class Main {


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
