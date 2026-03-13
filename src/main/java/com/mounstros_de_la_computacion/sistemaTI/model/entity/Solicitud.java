package com.mounstros_de_la_computacion.sistemaTI.model.entity;

import lombok.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Solicitud {
    private Integer id;
    private Date fecha;
    private Cliente cliente;
    private String dispositivo;
    private String descripcion;
}
