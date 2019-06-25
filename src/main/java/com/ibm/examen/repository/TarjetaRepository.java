package com.ibm.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.examen.model.Tarjeta;

public interface TarjetaRepository extends JpaRepository<Tarjeta, Integer> {
}
