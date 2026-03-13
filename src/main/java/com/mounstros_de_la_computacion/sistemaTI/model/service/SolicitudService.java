package com.mounstros_de_la_computacion.sistemaTI.model.service;

import com.mounstros_de_la_computacion.sistemaTI.dto.SolicitudDto;
import com.mounstros_de_la_computacion.sistemaTI.model.entity.Solicitud;
import com.mounstros_de_la_computacion.sistemaTI.model.repository.SolicitudRepository;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
public class SolicitudService {
    private final SolicitudRepository solicitudRepository;

    private SolicitudService(SolicitudRepository solicitudRepository) {
        this.solicitudRepository = solicitudRepository;
    }

    public Solicitud create(SolicitudDto solicitudDto) {
        Solicitud solicitud = Solicitud.builder()
            .fecha(new Date())
            .cliente(solicitudDto.getCliente())
            .dispositivo(solicitudDto.getDispositivo())
            .descripcion(solicitudDto.getDescripcion())
            .build();
        return solicitudRepository.create(solicitud);
    }

    public List<Solicitud> list() {
        return solicitudRepository.list();
    }

    public List<Solicitud> searchByCliente(Integer clienteId) {
        return solicitudRepository.searchByCliente(clienteId);
    }
}
