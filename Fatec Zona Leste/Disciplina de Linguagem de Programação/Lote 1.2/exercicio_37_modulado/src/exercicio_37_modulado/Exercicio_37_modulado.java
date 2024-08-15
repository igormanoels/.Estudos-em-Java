package exercicio_37_modulado;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  37. Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
 */

public class Exercicio_37_modulado {

    public static void main(String[] args) 
    {
        int termo;
			
        termo = Integer.parseInt(JOptionPane.showInputDialog("Informe até qual termo você gostaria de saber"));
	int[] vetFb = new int[termo]; 
		
	if (termo <= 2) 
	{
            JOptionPane.showMessageDialog(null,"Os dois primeiros termos são: 1 , 1" );
	} 
	else 
	{
            vetFb = CalcFibon(termo);
        }		
	for (int i = 0; i < vetFb.length; i++) 
	{
            System.out.println(i+1 + "º termo = " + vetFb[i]);
	}
    }
    
    
    /*******************************************************
     * Função para cálcular a série de Fibonacci
     */
    static int[] CalcFibon(int n) 
    {
        int[] vet = new int[n];
	vet[0] = 1;
	vet[1] = 1;
		
	for (int i = 2; i < n; i++) 
        {
            vet[i] = vet[i-1] + vet[i-2]; 
	}
		
	return vet;
    }
    
}
