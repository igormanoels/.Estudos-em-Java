package view;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 4 cavaleiros caminham por um corredor, simultaneamente, de 2 a 4 m por 50 ms. 
 * O corredor é escuro, tem 2 km e em 500 m, há uma única tocha. O cavaleiro que 
 * pegar a tocha, aumenta sua velocidade, somando mais 2 m por 50 ms ao valor que 
 * já fazia. Em 1,5 km, existe uma pedra brilhante. O cavaleiro que pegar a pedra, 
 * aumenta sua velocidade, somando mais 2 m por 50 ms ao valor que já fazia. Ao 
 * final dos 2 km, abrem uma porta randômica km, os cavaleiros se separam com 4 
 * portas e, um por vez pega uma porta aleatória (que não pode repetir) e entra 
 * nela. Apenas uma porta leva à saída. As outras 3 tem monstros que os devoram.
 */

import controller.ThreadCavaleiro;

public class Principal {
	
	public static void main(String[] args) {
        ThreadCavaleiro cavaleiro1 = new ThreadCavaleiro("Cavaleiro 1", 2, 4);
        ThreadCavaleiro cavaleiro2 = new ThreadCavaleiro("Cavaleiro 2", 2, 4);
        ThreadCavaleiro cavaleiro3 = new ThreadCavaleiro("Cavaleiro 3", 2, 4);
        ThreadCavaleiro cavaleiro4 = new ThreadCavaleiro("Cavaleiro 4", 2, 4);
        
        cavaleiro1.start();
        cavaleiro2.start();
        cavaleiro3.start();
        cavaleiro4.start();
    }
}
