package com.mounstros_de_la_computacion.sistemaTI.model.repository;

import org.springframework.stereotype.Repository;

import java.util.*;

// El atomicInteger es una clase que proporciona operaciones atómicas para un entero,
// lo que significa que las operaciones de incremento y decremento son seguras en entornos multihilo. 
// En este caso, se utiliza para generar un ID único para cada cliente de manera segura,
// incluso si múltiples hilos están creando clientes al mismo tiempo.
import java.util.concurrent.atomic.AtomicInteger;

import com.mounstros_de_la_computacion.sistemaTI.model.entity.Cliente;

@Repository

public class ClienteRepository {

    private final Map<Integer, Cliente > clientes =  new HashMap<>();
    private final AtomicInteger secuencialClientes = new AtomicInteger();

    public Cliente create(Cliente cliente){
        if(cliente.getIdCliente() == null){
            cliente.setIdCliente(secuencialClientes.getAndIncrement());
        }
        clientes.put(cliente.getIdCliente(), cliente);
        return cliente;
    }

    public List<Cliente> list(){
        return new ArrayList<>(clientes.values());
    }

    public Optional<Cliente> searchById(Integer idCliente){
        return Optional.ofNullable(clientes.get(idCliente));
    }

}
