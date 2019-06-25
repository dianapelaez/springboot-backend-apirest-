package com.ibm.examen.service;

import java.util.List;
import java.util.Optional;

import com.ibm.examen.model.Producto;

public interface ProductoService {
    /**
     * Ingresa un nuevo registro o actualiza uno ya existente
     * @param producto
     * @return El producto guardado
     */
    public Producto save(Producto producto);

    /**
     * Recupera la lista de productos
     *
     * @return La lista de productos
     */
    public List<Producto> findAll();

    /**
     * Recupera un producto por Id
     *
     * @return La lista de productos
     */
    public Optional<Producto> findById(Integer id);

    /**
     * Borra el producto enviado
     *
     * @param producto
     */
    public void delete(Producto producto);
    
    /**
     * Borra un producto por Id
     *
     * @param producto
     */
    public void delete(Integer id);
}
