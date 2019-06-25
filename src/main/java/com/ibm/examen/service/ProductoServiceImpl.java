package com.ibm.examen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.examen.model.Producto;
import com.ibm.examen.repository.ProductoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public void delete(Producto producto) {
    	productoRepository.delete(producto);
    }

    @Override
    public void delete(Integer id) {
    	productoRepository.deleteById(id);
    }

	@Override
	public Optional<Producto> findById(Integer id) {
		return productoRepository.findById(id);
	}
}
