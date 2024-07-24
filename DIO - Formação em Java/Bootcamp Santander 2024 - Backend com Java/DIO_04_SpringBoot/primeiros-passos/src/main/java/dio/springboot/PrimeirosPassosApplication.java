package dio.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeirosPassosApplication 
{

	public static void main(String[] args) 
	{
		// 1º INICIALIZA O SPRING
		SpringApplication.run(PrimeirosPassosApplication.class, args);
		
		//Calculadora calc = new Calculadora(); // ESSE TIPO DE OBJETO NÃO FAZ PARTE DO CONTROLE VIA SPRING.
		
		
	}

}
