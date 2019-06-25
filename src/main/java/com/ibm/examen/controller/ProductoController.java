package com.ibm.examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.ibm.examen.model.Cliente;
import com.ibm.examen.model.Producto;
import com.ibm.examen.service.ProductoService;
import com.ibm.examen.util.RestResponse;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductoController {

    @Autowired
    protected ProductoService productoService;

    @GetMapping("/productos")
    public List<Producto> getAll() {
        return productoService.findAll();
    }
    
    @GetMapping("/productos/{id}")
    public Optional<Producto> findById(@PathVariable Integer id) {
	      return productoService.findById(id);
	}
    
    @PostMapping( "/productos")
    public RestResponse save(@RequestBody Producto producto) {

        if(!validate(producto)){
            return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),
                    "Los campos no están diligenciados");
        }

        productoService.save(producto);

        return new RestResponse(HttpStatus.OK.value(), "Operación exitosa");
    }
    
    @PutMapping("/productos/{id}")
    public RestResponse update(@RequestBody Producto producto, @PathVariable Integer id) {
    	Optional<Producto> productoActualOpt = productoService.findById(id);
    	if(!productoActualOpt.isPresent()){
    	   return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),
                   "No se encontro el registro");
    	}
    	Producto productoActual = productoActualOpt.get();
    	productoActual.setDescripcion(producto.getDescripcion());
    	productoActual.setPrecio(producto.getPrecio());
    	productoActual.setNumeroExistencias(producto.getNumeroExistencias());
    	
    	productoService.save(productoActual);
    	
    	return new RestResponse(HttpStatus.OK.value(), "Actualización exitosa");
    }

    @DeleteMapping("/productos/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id) {
    	productoService.delete(id);
    }	

    private boolean validate(Producto producto) {
        if (Objects.isNull(producto.getDescripcion())||
        	Objects.isNull(producto.getPrecio())||
        	Objects.isNull(producto.getNumeroExistencias())) {
            return false;
        }

        return true;
    }
}


