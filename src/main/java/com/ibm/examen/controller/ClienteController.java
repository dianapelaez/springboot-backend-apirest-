package com.ibm.examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.ibm.examen.model.Cliente;
import com.ibm.examen.model.ClienteTarjeta;
import com.ibm.examen.service.ClienteService;
import com.ibm.examen.service.ClienteTarjetaService;
import com.ibm.examen.util.RestResponse;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    protected ClienteService clienteService;
    
    @Autowired
    protected ClienteTarjetaService clienteTarjetaService;
    
    @GetMapping("/clientes")
    public List<Cliente> findAll() {
	      return clienteService.findAll();
	}
    
    @GetMapping("/clientes/{id}")
    public Optional<Cliente> findById(@PathVariable Integer id) {
	      return clienteService.findById(id);
	}
    
    @PostMapping( "/clientes")
    public RestResponse save(@RequestBody Cliente cliente) {

        if(!validate(cliente)){
            return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),
                    "Los campos no están diligenciados");
        }

        clienteService.save(cliente);

        return new RestResponse(HttpStatus.OK.value(), "Operación exitosa");
    }
    
    @PutMapping("/clientes/{id}")
    public RestResponse update(@RequestBody Cliente cliente, @PathVariable Integer id) {
    	Optional<Cliente> clienteActualOpt = clienteService.findById(id);
    	if(!clienteActualOpt.isPresent()){
    	   return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),
                   "No se encontro el registro");
    	}
    	Cliente clienteActual = clienteActualOpt.get();
    	clienteActual.setNombre(cliente.getNombre());
    	clienteActual.setApellido(cliente.getApellido());
    	clienteActual.setDireccion(cliente.getDireccion());
    	clienteActual.setTelefono(cliente.getTelefono());
    	clienteActual.setEmail(cliente.getEmail());
    	
    	clienteService.save(clienteActual);
    	
    	return new RestResponse(HttpStatus.OK.value(), "Actualización exitosa");
    }
    
    @DeleteMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id) {
    	clienteService.delete(id);
    }	
    	
    private boolean validate(Cliente cliente) {
        if (Objects.isNull(cliente.getNombre()) ||
        		Objects.isNull(cliente.getApellido()) ||
                Objects.isNull(cliente.getDireccion()) ||
                Objects.isNull(cliente.getTelefono()) ||
                Objects.isNull(cliente.getEmail())) {
            return false;
        }

        return true;
    }
}

