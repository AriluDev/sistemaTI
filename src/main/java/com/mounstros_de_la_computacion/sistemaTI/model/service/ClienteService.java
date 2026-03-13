package com.mounstros_de_la_computacion.sistemaTI.model.service;

import com.mounstros_de_la_computacion.sistemaTI.dto.ClienteDto;
import com.mounstros_de_la_computacion.sistemaTI.model.entity.Cliente;
import com.mounstros_de_la_computacion.sistemaTI.model.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;
    
    private ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente create(ClienteDto clienteDto) {
        Cliente cliente = Cliente.builder()
            .nombre(clienteDto.getNombre())
            .build();
        return clienteRepository.create(cliente);
    }

    public List<Cliente> list() {
        return clienteRepository.list();
    }

}
