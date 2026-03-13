package com.mounstros_de_la_computacion.sistemaTI.dto;

import com.mounstros_de_la_computacion.model.entity.Cliente;
import java.util.Date;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class SolicitudDto {
    @Valid
    @NotNull(message = "El cliente es obligatorio")
    private Cliente cliente;
    @NotBlank(message = "El nombre del dispositivo es obligatorio")
    private String dispositivo;
    @NotBlank(message = "La descripción de la solicitud es obligatoria")
    private String descripcion;
}

// Corregir