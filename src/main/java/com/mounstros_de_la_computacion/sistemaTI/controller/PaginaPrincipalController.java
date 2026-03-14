package com.mounstros_de_la_computacion.sistemaTI.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/")
@RestController
@RequiredArgsConstructor
public class PaginaPrincipalController {
    @GetMapping(value = "/")
    public String saludar() {
        return "<h1>SISTEMA DE GESTIÓN DE SOLICITUDES TI</h1><p>El mejor sistema del mundo</p>";
    }
}