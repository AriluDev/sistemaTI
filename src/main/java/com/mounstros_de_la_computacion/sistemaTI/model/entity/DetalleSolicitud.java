package com.mounstros_de_la_computacion.sistemaTI.model.entity;

import jakarta.persistence.*;
import lombok.*;
import com.mounstros_de_la_computacion.sistemaTI.model.entity.Solicitud;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class DetalleSolicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "solicitud_id")
    private Solicitud solicitud;

    @Column(nullable = false)
    private boolean estado;
}
