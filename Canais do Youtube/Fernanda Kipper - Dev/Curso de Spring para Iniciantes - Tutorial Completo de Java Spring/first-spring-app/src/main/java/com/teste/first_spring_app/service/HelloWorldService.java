package com.teste.first_spring_app.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
	
	public String helloWorld(String nome) {
		return "Hello World 2" + nome;
	}
	
}
