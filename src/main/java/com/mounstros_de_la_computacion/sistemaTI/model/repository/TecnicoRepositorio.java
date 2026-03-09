package com.mounstros_de_la_computacion.sistemaTI.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mounstros_de_la_computacion.sistemaTI.model.entity.Tecnico;

public interface TecnicoRepositorio extends JpaRepository<Tecnico, Long> {

}