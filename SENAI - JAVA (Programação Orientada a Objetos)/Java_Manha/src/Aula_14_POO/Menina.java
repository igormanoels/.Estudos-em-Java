package Aula_14_POO;

public class Menina {

	public static void main(String[] args) {
		
		Pessoa menina = new Pessoa();
		
		menina.nome="Alice";
		menina.idade=5;
		menina.sexo="F";
		menina.peso = 25;
		menina.altura = 0.60;
		menina.dormindo=false;
		menina.acordado=true;
		
		menina.falar(menina.acordado);	}
// chama o método falar, dentro da classe pessoa
	
		
}
