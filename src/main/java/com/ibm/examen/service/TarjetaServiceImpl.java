package com.ibm.examen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.examen.model.Tarjeta;
import com.ibm.examen.repository.TarjetaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TarjetaServiceImpl implements TarjetaService {

    @Autowired
    private TarjetaRepository tarjetaRepository;

    @Override
    public Tarjeta save(Tarjeta tarjeta) {
        return tarjetaRepository.save(tarjeta);
    }

    @Override
    public List<Tarjeta> findAll() {
        return tarjetaRepository.findAll();
    }

    @Override
    public void delete(Tarjeta tarjeta) {
    	tarjetaRepository.delete(tarjeta);
    }

    @Override
    public void delete(Integer id) {
    	tarjetaRepository.deleteById(id);
    }

	@Override
	public Optional<Tarjeta> findById(Integer id) {
		return tarjetaRepository.findById(id);
	}
}
