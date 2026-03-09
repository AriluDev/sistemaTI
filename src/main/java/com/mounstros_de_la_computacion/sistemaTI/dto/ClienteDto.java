package com.mounstros_de_la_computacion.sistemaTI.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ClienteDto {

    @Valid
    @NotBlank(message = "El DNI no puede estar en blanco")
    private String dni;
    @NotBlank(message = "Los nombres no pueden estar en blanco")    
    private String nombres;
    @NotBlank(message = "El apellido paterno no puede estar en blanco")
    private String apellidoPaterno;
    @NotBlank(message = "El apellido materno no puede estar en blanco")
    private String apellidoMaterno;
    @NotBlank(message = "La fecha de registro no puede estar en blanco")
    private String fechaRegistro;

}
