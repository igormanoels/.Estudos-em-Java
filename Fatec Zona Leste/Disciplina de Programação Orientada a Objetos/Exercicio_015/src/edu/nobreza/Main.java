package edu.nobreza;

import java.util.LinkedList;
import java.util.List;

/* 
 * No reino Fedora, há um Principe e um Conde que disputam pelo poder, ambos são do tipo Nobre e dessa forma herdam o comportamento governar(), porém o Principe além de Nobre ele também se comporta como um Cavaleiro. Todo o Cavaleiro sabe duelar(). A Rainha também é Nobre porém além disso ela sabe fazerDiplomacia() que é a arte do Diplomata. 
 * Todo o Nobre possui um Conselheiro, e um conjunto de Soldado, o Conselheiro possui vários Bispo a sua disposição e por sua vez o Bispo herda de Padre e implementa Fiel, onde todo o Fiel sabe rezar().
 * P.S. Para a sua sanidade, assuma que apenas as classes podem agregar outras classes ou interfaces.
 * Crie:
 * Uma lista com os tipos existentes no texto, informando se são classes ou interfaces.
 * Diagrama de classe UML mostrando as relações entre os tipos detectados. Assuma que todas as relações de associação serão representadas por agregações. Não precisa implementar os métodos get e set dessas agregações, basta torná-las package ou públicas.
 * Código Java de todos os tipos em um mesmo pacote chamado edu.nobreza
 * 
 */
public class Main {
	
	public static void main(String[] args) {
		
		Rainha rainha = new Rainha();
		Principe principe = new Principe();
		Conde conde = new Conde();
		Bispo bispo = new Bispo("Josué");
		Padre padre = new Padre("Anânias");
		
		rainha.governar();
		principe.governar();
		conde.governar();
				
		conde.soldado.add(new Soldado("João"));
		conde.soldado.add(new Soldado("Pedro"));
		conde.soldado.add(new Soldado("Augustus"));
		
		conde.conselheiro.add(new Conselheiro("Julius", bispo));
		
		System.out.println("Soldados: " + conde.soldado + "\nConselheiro: " + conde.conselheiro );

		System.out.print("Bispo: " + bispo + " ");
		bispo.rezar();
		System.out.print("Padre: " + padre + " ");
		padre.rezar();
	}

}


class Rainha implements Diplomata, Nobre {

	List<Soldado> soldado = new LinkedList<>();
	List<Conselheiro> conselheiro = new LinkedList<>();
	
	@Override
	public void governar() {
		
		fazerDiplomacia();
		
		System.out.println("A rainha está governando em parceria com os reinos aliados");
	}
	
}

class Principe implements Nobre {

	List<Soldado> soldado = new LinkedList<>();
	List<Conselheiro> conselheiro = new LinkedList<>();
	
	@Override
	public void governar() {
		System.out.println("O Principe está governando com mão de ferro!");
	}

}

class Conde implements Nobre {
	
	List<Soldado> soldado = new LinkedList<>();
	List<Conselheiro> conselheiro = new LinkedList<>();
	
	@Override
	public void governar() {
		System.out.println("O Conde está governando em conjunto com os conselheiros.");
	}
	
}

