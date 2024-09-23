package exercicios;
/*
 * Ex04-Declaração e inicialização de variáveis
 * 
 * Instruções
 * 	Crie e inicie variáveis para guardar as informações abaixo usando os tipos de variáveis de acordo com a forma que achar correto. 
 * 	Nome da empresa com no máximo 25 caracteres. 
 * 	Total de salários pagos no mês, em uma grande empresa 
 *	Quantidade de dias de faturamento, normalmente esta informação será fixa e nunca mais alterada 
 *	Todas as notas de um aluno de uma disciplina 
 *	Todos os dados de um carro (placa, chassi, modelo, ano, cor, nome do dono) que foi multado. 
 *	O número de ouro da matemática valor 1.61803... 
 *	Os nomes dos alunos de uma turma com 10 alunos 
 *	Quantidade de pares de tênis de um armário 
 */
public class Exercicio004 
{
	public static void main(String[] args) 
	{
		Empresa empresa = new Empresa();
		empresa.nomeEmpresa = "Golpe Sujo ltda";
		empresa.totalSalariosMensal = 12425.89f;
		
		System.out.println("Nome da empresa: " + empresa.nomeEmpresa + ", total de gastos com salário: " + empresa.totalSalariosMensal);
		
		Escola escola = new Escola();
		escola.aluno[0] = 7.4f;
		escola.aluno[1] = 1.2f;
		escola.aluno[2]	= 4.9f;
		escola.aluno[3] = 9.1f;
		
		for (float notas : escola.aluno) System.out.println("Nota: " + notas);
		
		
	}
}

class Empresa
{
	String nomeEmpresa;
	float totalSalariosMensal;
	final int diasUteis = 28;
	
}

class Escola
{
	float[] aluno = new float[4];
	String[] turma = new String[10];
	int tenisGuardados;
	
}

class Multa
{
	String dono;
	String placa;
	int chassi;
	String modelo;
	int ano;
	String cor;
	
}
