package com.ibm.examen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.examen.model.Cliente;
import com.ibm.examen.model.ClienteTarjeta;
import com.ibm.examen.repository.ClienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }
    
    @Override
    public void delete(Cliente cliente) {
        clienteRepository.delete(cliente);
    }

    @Override
    public void delete(Integer id) {
    	clienteRepository.deleteById(id);
    }

	@Override
	public Optional<Cliente> findById(Integer id) {
		return clienteRepository.findById(id);
	}
}
