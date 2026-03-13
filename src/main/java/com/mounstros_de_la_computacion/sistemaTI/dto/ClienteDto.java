package com.mounstros_de_la_computacion.sistemaTI.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ClienteDto {
    @Valid
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;
}
