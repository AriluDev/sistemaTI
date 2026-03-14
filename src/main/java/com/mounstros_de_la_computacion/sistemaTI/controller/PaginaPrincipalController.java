package com.mounstros_de_la_computacion.sistemaTI.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/")
@RestController
@RequiredArgsConstructor
public class PaginaPrincipalController {
    @GetMapping(value = "/")
    public String saludar() {
        return """
            <html>
            <head>
                <title>Sistema TI</title>
                <style>
                    body {
                        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                        background: linear-gradient(to right, #4facfe, #00f2fe);
                        color: #fff;
                        text-align: center;
                        padding: 50px;
                        margin: 0;
                    }
                    h1 {
                        font-size: 3em;
                        margin-bottom: 0.2em;
                        text-shadow: 2px 2px 4px rgba(0,0,0,0.3);
                    }
                    p {
                        font-size: 1.5em;
                        margin-bottom: 2em;
                    }
                    .btn {
                        display: inline-block;
                        padding: 15px 30px;
                        font-size: 1.2em;
                        color: #4facfe;
                        background-color: #fff;
                        border: none;
                        border-radius: 8px;
                        cursor: pointer;
                        text-decoration: none;
                        transition: transform 0.2s, background-color 0.3s;
                    }
                    .btn:hover {
                        transform: scale(1.05);
                        background-color: #e0e0e0;
                    }
                </style>
            </head>
            <body>
                <h1>SISTEMA DE GESTIÓN DE SOLICITUDES TI</h1>
                <p>El mejor sistema del mundo</p>
                <a href="/solicitudes" class="btn">Solicitudes</a>
                <a href="/clientes" class="btn">Clientes</a>
                <a href="/tecnicos" class="btn">Técnicos</a>
            </body>
            </html>
            """;
    }
}