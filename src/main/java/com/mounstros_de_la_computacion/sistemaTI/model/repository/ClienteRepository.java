package com.mounstros_de_la_computacion.sistemaTI.model.repository;

import com.mounstros_de_la_computacion.sistemaTI.model.entity.Cliente;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class ClienteRepository {
    private final Map<Integer, Cliente> clientes = new HashMap<>();
    private final AtomicInteger secuenciaCliente = new AtomicInteger();

    public Cliente create(Cliente cliente) {
        if (cliente.getId() == null) {
            cliente.setId(secuenciaCliente.getAndIncrement());
        }
        clientes.put(cliente.getId(), cliente);
        return cliente;
    }

    public List<Cliente> list() {
        return new ArrayList<>(clientes.values());
    }

    public Optional<Cliente> searchById(Integer id) {
        return Optional.ofNullable(clientes.get(id));
    }
}
