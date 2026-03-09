package com.mounstros_de_la_computacion.sistemaTI.model.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;
import com.mounstros_de_la_computacion.sistemaTI.model.entity.Cliente;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Solicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "solicitud", cascade = CascadeType.ALL)
    private List<DetalleSolicitud> detalles;

    @Column(nullable = false)
    private LocalDateTime fechaCreacion = LocalDateTime.now();

    public void addDetalle(DetalleSolicitud detalle) {
        if (detalles == null) {
            detalles = new ArrayList<>();
        }
        detalles.add(detalle);
        detalle.setSolicitud(this);
    }
}