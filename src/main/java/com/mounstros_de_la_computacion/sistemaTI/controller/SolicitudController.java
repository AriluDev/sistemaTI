package com.mounstros_de_la_computacion.sistemaTI.controller;


import com.mounstros_de_la_computacion.sistemaTI.dto.SolicitudDto;
import com.mounstros_de_la_computacion.sistemaTI.model.entity.Solicitud;
import com.mounstros_de_la_computacion.sistemaTI.model.service.SolicitudService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("/solicitudes")
@RestController
@RequiredArgsConstructor
public class SolicitudController {
    private final SolicitudService solicitudService;

    @PostMapping
    @Operation(summary = "Crear solicitud", description = "Permite registrar solicitudes desde un entorno externo")
    public ResponseEntity<Solicitud> create(@Valid @RequestBody SolicitudDto solicitudDto) {
        Solicitud solicitud = solicitudService.create(solicitudDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(solicitud);
    }

    @GetMapping
    public ResponseEntity<List<Solicitud>> list() {
        return ResponseEntity.ok(solicitudService.list());
    }
}
