package com.mounstros_de_la_computacion.sistemaTI.model.service;

import org.springframework.stereotype.Service;
import com.mounstros_de_la_computacion.sistemaTI.dto.ClienteDto;
import com.mounstros_de_la_computacion.sistemaTI.model.entity.Cliente;
import com.mounstros_de_la_computacion.sistemaTI.model.repository.ClienteRepository;

import java.util.Date;
import java.util.List;

@Service

public class ClienteService {

    private final ClienteRepository clienteRepository;
    private ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente create(ClienteDto clienteDto){
        Cliente cliente = Cliente.builder()
                .dni(clienteDto.getDni())
                .nombres(clienteDto.getNombres())
                .apellidoPaterno(clienteDto.getApellidoPaterno())
                .apellidoMaterno(clienteDto.getApellidoMaterno())
                .fechaRegistro(new Date())
                .build();
        return clienteRepository.create(cliente);
    }

    public List<Cliente> list(){
        return clienteRepository.list();
    }
}
