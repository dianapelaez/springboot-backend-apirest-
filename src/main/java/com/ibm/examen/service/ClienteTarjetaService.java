package com.ibm.examen.service;

import java.util.List;

import com.ibm.examen.model.ClienteTarjeta;

public interface ClienteTarjetaService {
	
	/**
	 * Lista cliente con sus respectivas tarjetas
	 *
	 * @param cliente
	 */
	public List<ClienteTarjeta> ListarClienteTarjetas(Integer id);

}
