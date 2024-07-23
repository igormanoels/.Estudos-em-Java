package dio.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
 * Projeto Spring Boot gerado via Spring initializr
 * Módulos:
 * 	- Spring Data JPA
 * 	- Spring Web
 *  - HD2 DataBase
 *  - OpenFeigh
 */


@EnableFeignClients
@SpringBootApplication
public class Application 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(Application.class, args);
	}

}
