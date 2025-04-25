package com.teste.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.first_spring_app.service.HelloWorldService;


@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	private HelloWorldService hws;
	
	public HelloWorldController(HelloWorldService hws) {
		this.hws = hws;
	}
	
	
//	@GetMapping
	@GetMapping("/get")				// Outra forma de fazer, incrementando o endereço
	public String helloWorld() {
		return hws.helloWorld(", Olá Igor Manoel");
	}
	
	
}
