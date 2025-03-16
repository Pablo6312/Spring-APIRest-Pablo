package com.pablo.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pablo.api.entity.Articulo;
import com.pablo.api.repository.ArticuloRepository;

@Service
public class ArticuloServiceImpl implements ArticuloService{

	@Autowired
	private ArticuloRepository articuloRepository;
	
	@Override
	@Transactional(readOnly=true)
	public List<Articulo> allArticulos() {
		return (List<Articulo>) articuloRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Articulo getArticulo(Long id) {
		return articuloRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Articulo saveArticulo(Articulo articulo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Articulo updateArticulo(Articulo articulo) {
		return articuloRepository.save(articulo);
	}

	@Override
	@Transactional
	public void deleteArticulo(Long id) {
		articuloRepository.deleteById(id);
	}

}
