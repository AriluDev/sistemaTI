package com.mounstros_de_la_computacion.sistemaTI.controller;

import com.mounstros_de_la_computacion.sistemaTI.dto.TecnicoDto;
import com.mounstros_de_la_computacion.sistemaTI.model.entity.Tecnico;
import com.mounstros_de_la_computacion.sistemaTI.model.service.TecnicoService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("/tecnicos")
@RestController
@RequiredArgsConstructor
public class TecnicoController {
    private TecnicoService tecnicoService;

    @PostMapping
    @Operation(summary = "Crear un técnico", description = "Permite registrar técnicos desde un entorno externo")
    public ResponseEntity<Tecnico> create(@Valid @RequestBody TecnicoDto tecnicoDto) {
        Tecnico tecnico = tecnicoService.create(tecnicoDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(tecnico);
    }

    @GetMapping
    public ResponseEntity<List<Tecnico>> list() {
        return ResponseEntity.ok(tecnicoService.list());
    }
}
