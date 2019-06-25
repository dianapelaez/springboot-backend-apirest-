package com.ibm.examen.service;

import java.util.List;
import java.util.Optional;

import com.ibm.examen.model.Cliente;
import com.ibm.examen.model.Tarjeta;

public interface TarjetaService {
    /**
     * Ingresa un nuevo registro o actualiza uno ya existente
     * @param tarjeta
     * @return La tarjeta guardado
     */
    public Tarjeta save(Tarjeta tarjeta);

    /**
     * Recupera la lista de tarjetas
     *
     * @return La lista de tarjetas
     */
    public List<Tarjeta> findAll();

    /**
     * Recupera una tarjeta por Id
     *
     * @return La lista de tarjetas
     */
    public Optional<Tarjeta> findById(Integer id);

    /**
     * Borra la tarjeta enviado
     *
     * @param tarjeta
     */
    public void delete(Tarjeta tarjeta);
    
    /**
     * Borra un tarjeta por Id
     *
     * @param tarjeta
     */
    public void delete(Integer id);
}