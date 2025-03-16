package com.pablo.api.service;

import java.util.List;

import com.pablo.api.entity.Cliente;

public interface ClienteService {
	
	//metodo todos los clientes
	public List<Cliente> allClientes();
	
	//metodo buscar cliente por id
	public Cliente getCliente(Long id);
	
	//metodo agregar cliente
	public Cliente saveCliente(Cliente cliente);
	
	//metodo actualizar cliente
	public Cliente updateCliente(Cliente cliente);
	
	//metodo borrar cliente por id
	public void deleteCliente(Long id);
	
	
}
