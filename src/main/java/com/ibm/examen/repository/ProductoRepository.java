package com.ibm.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.examen.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
