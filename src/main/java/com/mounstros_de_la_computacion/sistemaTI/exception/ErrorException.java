package com.mounstros_de_la_computacion.sistemaTI.exception;


import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ErrorException {

    private LocalDateTime fechaHora;
    private int satus;
    private String error;
    private String mensaje;
    private String ruta;


}
