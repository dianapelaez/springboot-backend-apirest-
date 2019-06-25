package com.ibm.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.examen.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
}
