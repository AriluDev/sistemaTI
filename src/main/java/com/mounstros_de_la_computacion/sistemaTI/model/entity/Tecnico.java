package com.mounstros_de_la_computacion.sistemaTI.model.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Tecnico {
    private Integer id;
    private String nombre;
    private String especialidad;
}
