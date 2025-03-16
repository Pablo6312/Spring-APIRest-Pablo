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

import com.pablo.api.entity.Compra;
import com.pablo.api.service.CompraService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/compras")
public class CompraController {
	
	@Autowired
	private CompraService compraService;
	
	@GetMapping
    public List<Compra> getAllCompras() {
        return compraService.allCompras();
    }

    @GetMapping("/{id}")
    public Compra getCompraById(@PathVariable Long id) {
        return compraService.getCompra(id);
    }

    @PostMapping
    public Compra createCompra(@RequestBody Compra compra) {
        return compraService.saveCompra(compra);
    }

    @PutMapping("/{id}")
    public Compra updateCompra(@PathVariable Long id, @RequestBody Compra compra) {
        compra.setId(id);
        return compraService.saveCompra(compra);
    }

    @DeleteMapping("/{id}")
    public void deleteCompra(@PathVariable Long id) {
        compraService.deleteCompra(id);
    }

}
