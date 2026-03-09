package com.mounstros_de_la_computacion.sistemaTI.model.entity;

import lombok.*;

@data
public class Tecnico {
    private String nombre;
    private String especialidad;

    public Tecnico(String nombre, String especialidad) {
    }
}
