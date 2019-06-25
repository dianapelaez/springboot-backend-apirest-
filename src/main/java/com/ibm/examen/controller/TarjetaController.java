package com.ibm.examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.ibm.examen.model.Cliente;
import com.ibm.examen.model.Producto;
import com.ibm.examen.model.Tarjeta;
import com.ibm.examen.service.TarjetaService;
import com.ibm.examen.util.RestResponse;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TarjetaController {

    @Autowired
    protected TarjetaService tarjetaService;

    @GetMapping("/tarjetas")
    public List<Tarjeta> findAll() {
	      return tarjetaService.findAll();
	}
    
    @GetMapping("/tarjetas/{id}")
    public Optional<Tarjeta> findById(@PathVariable Integer id) {
	      return tarjetaService.findById(id);
	}
    
    @PostMapping( "/tarjetas")
    public RestResponse save(@RequestBody Tarjeta tarjeta) {

        if(!validate(tarjeta)){
            return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),
                    "Los campos no están diligenciados");
        }

        tarjetaService.save(tarjeta);

        return new RestResponse(HttpStatus.OK.value(), "Operación exitosa");
    }
    
    @PutMapping("/tarjetas/{id}")
    public RestResponse update(@RequestBody Tarjeta tarjeta, @PathVariable Integer id) {
    	Optional<Tarjeta> tarjetaActualOpt = tarjetaService.findById(id);
    	if(!tarjetaActualOpt.isPresent()){
    	   return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),
                   "No se encontro el registro");
    	}
    	Tarjeta tarjetaActual = tarjetaActualOpt.get();
    	tarjetaActual.setDescripcion(tarjeta.getDescripcion());
    	tarjetaActual.setFranquicia(tarjeta.getFranquicia());
    	tarjetaActual.setCupo(tarjeta.getCupo());
    	
    	tarjetaService.save(tarjetaActual);
    	
    	return new RestResponse(HttpStatus.OK.value(), "Actualización exitosa");
    }

    @DeleteMapping("/tarjetas/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id) {
    	tarjetaService.delete(id);
    }	

    private boolean validate(Tarjeta tarjeta) {
        if (Objects.isNull(tarjeta.getDescripcion()) ||
        		Objects.isNull(tarjeta.getFranquicia()) ||
                Objects.isNull(tarjeta.getCupo())) {
            return false;
        }

        return true;
    }
}


