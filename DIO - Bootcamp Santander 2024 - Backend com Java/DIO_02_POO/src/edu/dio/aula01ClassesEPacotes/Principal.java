package edu.dio.aula01;

	/* 	Classes (class) - Estrutura direcionada da criação de um objeto
	 * 	Identificador (identity) - Próposito dos objetos
	 *	Caracteristicas (states) - Atributos e objetos que existiram dentro da classe
	 *	Comportamento (behavior) - Ações e métodos
	 *	Instanciar (new) - Criar um novo objeto, apartir de uma estrutura definida
	 *	
	 */

public class Principal 
{

	public static void main(String[] args) 
	{
		Estudante estudante = new Estudante(); // Cria um Objeto para acessar outras classes
		
		estudante.nome = "Igor";
		estudante.idade = 29;
		estudante.sexo = "masculino";
		estudante.cor = "Branco";
		
	}

}
