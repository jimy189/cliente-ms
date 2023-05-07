package com.api.clientecontrol.repositories;

import com.api.clientecontrol.models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteRepository extends JpaRepository<ClienteModel, Integer> {

}
