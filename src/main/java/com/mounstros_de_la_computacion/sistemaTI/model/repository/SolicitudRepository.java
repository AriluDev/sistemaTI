package com.mounstros_de_la_computacion.sistemaTI.model.repository;

import com.mounstros_de_la_computacion.sistemaTI.model.entity.Solicitud;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class SolicitudRepository {
    private final Map<Integer, Solicitud> solicitudes = new HashMap<>();
    private final AtomicInteger secuenciaSolicitud = new AtomicInteger();

    public Solicitud create(Solicitud solicitud) {
        if (solicitud.getId() == null) {
            solicitud.setId(secuenciaSolicitud.getAndIncrement());
        }
        solicitudes.put(solicitud.getId(), solicitud);
        return solicitud;
    }

    public List<Solicitud> list() {
        return new ArrayList<>(solicitudes.values());
    }

    public Optional<Solicitud> searchById(Integer id) {
        return Optional.ofNullable(solicitudes.get(id));
    }

    public List<Solicitud> searchByCliente(Integer clienteId) {
        List<Solicitud> resultado = new ArrayList<>();

        for(Solicitud solicitud : solicitudes.values()) {
            if (solicitud.getCliente() != null &&
                solicitud.getCliente().getId().equals(clienteId)) {
                    resultado.add(solicitud);
                }
        }
        return resultado;
    }
}
