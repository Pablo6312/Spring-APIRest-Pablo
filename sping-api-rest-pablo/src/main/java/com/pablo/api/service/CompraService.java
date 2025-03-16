package com.pablo.api.service;

import java.util.List;

import com.pablo.api.entity.Compra;

public interface CompraService {
	
		//metodo todos los compra
		public List<Compra> allCompras();
		
		//metodo buscar compra por id
		public Compra getCompra(Long id);
		
		//metodo agregar cliente
		public Compra saveCompra(Compra compra);
		
		//metodo actualizar compra
		public Compra updateCompra(Compra compra);
		
		//metodo borrar compra por id
		public void deleteCompra(Long id);
}
