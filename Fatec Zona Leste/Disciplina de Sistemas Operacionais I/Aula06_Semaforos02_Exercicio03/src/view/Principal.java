package view;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 	3) Um banco deve controlar Saques e Depósitos. O sistema pode permitir 
 * 	um Saque e um Depósito Simultâneos, mas nunca 2 Saques ou 2 Depósitos
 * 	Simultâneos. Para calcular a transação (Saque ou Depósito), o método 
 * 	deve receber o código da conta, o saldo da conta e o valor a ser 
 * 	transacionado. Deve-se montar um sistema que considera 20 transações
 * 	simultâneas enviadas ao sistema (aleatoriamente, essas transações podem
 *  ser qualquer uma das opções) e tratar todas as transações.
 */

import controller.ThreadTransacao;
import java.util.concurrent.Semaphore;

public class Principal {

	public static void main(String[] args) 
    {
        Semaphore permissao = new Semaphore(1);
        
        for (int i = 0; i < 20; i++) 
        {
            String acao = (i % 2 == 0) ? "Depositar" : "Sacar";
            ThreadTransacao trans = new ThreadTransacao(i, permissao, acao);
            trans.start();
        }
    }
}
