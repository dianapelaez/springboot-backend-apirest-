package com.ibm.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ibm.examen.model.ClienteTarjeta;
import com.ibm.examen.repository.ClienteTarjetaRepository;

public class ClienteTarjetaServiceImpl implements ClienteTarjetaService{
	
    @Autowired
    private ClienteTarjetaRepository clienteTarjetaRepository;
	
	public List<ClienteTarjeta> ListarClienteTarjetas(Integer id){
		return clienteTarjetaRepository.findAllByCliente(id);
	}
	
}
