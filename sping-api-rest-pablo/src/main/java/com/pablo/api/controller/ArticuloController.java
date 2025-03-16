package com.pablo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pablo.api.entity.Articulo;
import com.pablo.api.service.ArticuloService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/articulos")
public class ArticuloController {

	@Autowired
	private ArticuloService articuloService;
	
	 @GetMapping
	    public List<Articulo> getAllArticulos() {
	        return articuloService.allArticulos();
	    }

	    @GetMapping("/{id}")
	    public Articulo getArticuloById(@PathVariable Long id) {
	        return articuloService.getArticulo(id);
	    }

	    @PostMapping
	    public Articulo createArticulo(@RequestBody Articulo articulo) {
	        return articuloService.saveArticulo(articulo);
	    }

	    @PutMapping("/{id}")
	    public Articulo updateArticulo(@PathVariable Long id, @RequestBody Articulo articulo) {
	        articulo.setId(id);
	        return articuloService.saveArticulo(articulo);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteArticulo(@PathVariable Long id) {
	        articuloService.deleteArticulo(id);
	    }
}
