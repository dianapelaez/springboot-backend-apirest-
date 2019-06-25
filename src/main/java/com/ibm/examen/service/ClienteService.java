package com.ibm.examen.service;

import java.util.List;
import java.util.Optional;

import com.ibm.examen.model.Cliente;
import com.ibm.examen.model.ClienteTarjeta;

public interface ClienteService {
    /**
     * Ingresa un nuevo registro o actualiza uno ya existente
     * @param cliente
     * @return El cliente guardado
     */
    public Cliente save(Cliente cliente);

    /**
     * Recupera la lista de clientes
     *
     * @return La lista de clientes
     */
    public List<Cliente> findAll();
    
    /**
     * Recupera un cliente por Id
     *
     * @return La lista de clientes
     */
    public Optional<Cliente> findById(Integer id);

    /**
     * Borra el cliente enviado
     *
     * @param cliente
     */
    public void delete(Cliente cliente);
    
    /**
     * Borra un cliente por Id
     *
     * @param cliente
     */
    public void delete(Integer id);
    
}

