package com.ibm.examen.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.examen.model.ClienteTarjeta;
import com.ibm.examen.service.ClienteTarjetaService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ClienteTarjetaController {

    @Autowired
    protected ClienteTarjetaService clienteTarjetaService;
    
    @GetMapping("/cliente-tarjetas/{id}")
    public List<ClienteTarjeta> ListarClienteTarjetas(@PathVariable Integer id) {
	      return clienteTarjetaService.ListarClienteTarjetas(id);
	}
}
