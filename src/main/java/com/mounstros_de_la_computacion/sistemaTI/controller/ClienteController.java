package com.mounstros_de_la_computacion.sistemaTI.controller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.mounstros_de_la_computacion.sistemaTI.dto.ClienteDto;
import com.mounstros_de_la_computacion.sistemaTI.model.entity.Cliente;
import com.mounstros_de_la_computacion.sistemaTI.model.service.ClienteService;



import java.util.List;

@RequestMapping("/api/clientes")
@RestController
@RequiredArgsConstructor

public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping
    @Operation(summary = "Crear un nuevo cliente", description = "Crea un nuevo cliente con los datos proporcionados")  
    public ResponseEntity<Cliente> create(@Valid @RequestBody ClienteDto clienteDto){
        Cliente cliente = clienteService.create(clienteDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> list(){
        return ResponseEntity.ok(clienteService.list());
    }
    @GetMapping(value = "/saludo")
        public String saludo(){
            return "Hola mundo";
        
    }
}
