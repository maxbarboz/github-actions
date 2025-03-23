package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/teste")
public class TesteController {

    @GetMapping
    public ResponseEntity<String> buscaCategorias() {
        return ResponseEntity.ok("TAKESHY É VIADO DIMAIS");
    }
}
