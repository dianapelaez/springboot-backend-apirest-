package com.ibm.examen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.examen.model.Cliente;
import com.ibm.examen.model.ClienteTarjeta;

public interface ClienteTarjetaRepository extends JpaRepository<Cliente, Integer> {
    
	List<ClienteTarjeta> findAllByCliente(Integer id);
}