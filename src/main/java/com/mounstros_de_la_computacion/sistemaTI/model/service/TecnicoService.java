package com.mounstros_de_la_computacion.sistemaTI.model.service;

import com.mounstros_de_la_computacion.sistemaTI.dto.TecnicoDto;
import com.mounstros_de_la_computacion.sistemaTI.model.entity.Tecnico;
import com.mounstros_de_la_computacion.sistemaTI.model.repository.TecnicoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TecnicoService {
    private final TecnicoRepository tecnicoRepository;

    private TecnicoService(TecnicoRepository tecnicoRepository) {
        this.tecnicoRepository = tecnicoRepository;
    }

    public Tecnico create(TecnicoDto tecnicoDto) {
        Tecnico tecnico = Tecnico.builder()
        .nombre(tecnicoDto.getNombre())
        .especialidad(tecnicoDto.getEspecialidad())
        .build();
        return tecnicoRepository.create(tecnico);
    }

    public List<Tecnico> list() {
        return tecnicoRepository.list();
    }
}
