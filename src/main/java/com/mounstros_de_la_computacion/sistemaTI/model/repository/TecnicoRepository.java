package com.mounstros_de_la_computacion.sistemaTI.model.repository;

import com.mounstros_de_la_computacion.sistemaTI.model.entity.Tecnico;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class TecnicoRepository {
    private final Map<Integer, Tecnico> tecnicos = new HashMap<>();
    private final AtomicInteger secuenciaTecnico = new AtomicInteger();

    public Tecnico create(Tecnico tecnico) {
        if (tecnico.getId() == null) {
            tecnico.setId(secuenciaTecnico.getAndIncrement());
        }
        tecnicos.put(tecnico.getId(), tecnico);
        return tecnico;
    }

    public List<Tecnico> list() {
        return new ArrayList<>(tecnicos.values());
    }

    public Optional<Tecnico> searchById(Integer id) {
        return Optional.ofNullable(tecnicos.get(id));
    }
}
