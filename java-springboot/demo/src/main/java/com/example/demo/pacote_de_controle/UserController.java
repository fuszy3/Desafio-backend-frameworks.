package com.example.demo.pacote_de_controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String home() {
        return "Servidor rodando! Esse é o meu backend em Spring Boot.";
    }
}