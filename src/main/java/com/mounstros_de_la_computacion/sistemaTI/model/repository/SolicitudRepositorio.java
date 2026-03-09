package com.mounstros_de_la_computacion.sistemaTI.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mounstros_de_la_computacion.sistemaTI.model.entity.Solicitud;

public interface SolicitudRepositorio extends JpaRepository<Solicitud, Long> {

}