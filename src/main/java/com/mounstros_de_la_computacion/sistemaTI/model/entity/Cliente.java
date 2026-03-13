package com.mounstros_de_la_computacion.sistemaTI.model.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cliente {
    private Integer id;
    private String nombre;
}
