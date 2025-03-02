package br.edu.dio.Aula_003.InterfaceFuncional;

import java.util.List;
import java.util.function.Consumer;

public class Main {
	
	public static void main(String[] args) {
		
		// Lista Imutável
		List<User> users = List.of(new User("Igor", 21), new User("Joao", 23), new User("Pedro", 54));
		
		
		// O consumer é uma interface, para usar é preciso criar uma classe e implementar seus métodos
		// Então para seu uso aqui, resolvi implementar uma classe abstrata
		var consumer = new Consumer<User>() {
			@Override
			public void accept(User user) {
				System.out.println(user);
			}		
		};

		users.forEach(consumer);
		
		
		
		System.out.println("\n");
		
		
		
		// OUTRA FORMA É UTILIZANDO A EXPRESSÃO LAMBDA
		users.forEach((User user) -> {
			System.out.println(user.name());
		});
		
		
		
	}

}
