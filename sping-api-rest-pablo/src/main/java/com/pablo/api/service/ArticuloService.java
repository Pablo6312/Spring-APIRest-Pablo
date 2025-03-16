package com.pablo.api.service;

import java.util.List;

import com.pablo.api.entity.Articulo;

public interface ArticuloService {
	
		//metodo todos los articulos
		public List<Articulo> allArticulos();
		
		//metodo buscar articulo por id
		public Articulo getArticulo(Long id);
		
		//metodo agregar articulo
		public Articulo saveArticulo(Articulo articulo);
		
		//metodo actualizar articulo
		public Articulo updateArticulo(Articulo articulo);
		
		//metodo borrar articulo por id
		public void deleteArticulo(Long id);
}
