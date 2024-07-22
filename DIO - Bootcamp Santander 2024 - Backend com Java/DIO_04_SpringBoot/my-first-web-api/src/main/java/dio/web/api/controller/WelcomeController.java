package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController
{
    @GetMapping
    public String welcome()
    {
        return "Seja Bem vindo ao meu Spring Boot Web API";
    }
}
