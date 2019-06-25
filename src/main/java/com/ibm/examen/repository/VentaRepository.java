package com.ibm.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.examen.model.Venta;

import java.util.List;

public interface VentaRepository extends JpaRepository<Venta, Long> {

}
