package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/* 	ATRAVÉS DESSA CLASSE, VOCÊ ELIMINA A NECESSIDADE DA CRIAÇÃO DE VÁRIAS INSTANCIAS DE OBJETOS
	FAZENDO COM QUE AS OUTRAS CLASSES A SEREM CHAMADAS, SEJAM COMPONENTES, ONDE HÁ INICIO E FIM. 
	DEIXANDO DE OCUPAR MEMÓRIA DESNECESSÁRIAMENTE
*/
// 2º CRIA UM COMPONENTE QUE MANIPULA CLASSES, SEM INSTANCIA DE OBJETOS
@Component
public class MyApp implements CommandLineRunner
{
	// 3º CRIA UM MÉTODO DE ACESSO VIA SPRING
	@Autowired
	private Calculadora calculadora;

	@Override
	public void run(String... args) throws Exception 
	{
		// 4º INICIALIZA O MÉTODO
		System.out.println("Resultado = " + calculadora.somar(1, 8));

		
	}
	
}
