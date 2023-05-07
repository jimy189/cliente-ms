package com.api.clientecontrol.services;

import com.api.clientecontrol.models.ClienteModel;
import com.api.clientecontrol.repositories.ClienteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class ClienteService {
    final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public ClienteModel save(ClienteModel clienteModel) {
        return clienteRepository.save(clienteModel);
    }
    public Page<ClienteModel> findAll(Pageable pageable) {
        return clienteRepository.findAll(pageable);
    }


    public Optional<ClienteModel> findById(Integer id) {
        return clienteRepository.findById(id);
    }

    @Transactional
    public void delete(ClienteModel parkingSpotModel) {
        clienteRepository.delete(parkingSpotModel);
    }
}
