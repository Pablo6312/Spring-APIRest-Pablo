package com.pablo.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pablo.api.entity.Compra;
import com.pablo.api.repository.CompraRepository;

@Service
public class CompraServiceImpl implements CompraService{

	@Autowired
	private CompraRepository compraRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Compra> allCompras() {
		return (List<Compra>) compraRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Compra getCompra(Long id) {
		return compraRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Compra saveCompra(Compra compra) {
		return compraRepository.save(compra);
	}

	@Override
	public Compra updateCompra(Compra compra) {
		return compraRepository.save(compra);
	}

	@Override
	@Transactional
	public void deleteCompra(Long id) {
		compraRepository.deleteById(id);
	}

}
