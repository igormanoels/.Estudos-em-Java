package com.primeiroProjeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // é uma notação que diz q se trata de um bean
public class Controller {

	@GetMapping("/")
	public String mensagem() {
		return "Nosso primeiro projeto Spring Boot Web";
	}
	
}
