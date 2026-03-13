package com.mounstros_de_la_computacion.sistemaTI.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TecnicoDto {
    @Valid
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;
    @NotBlank(message = "La especialidad es obligatoria")
    private String especialidad;
}
