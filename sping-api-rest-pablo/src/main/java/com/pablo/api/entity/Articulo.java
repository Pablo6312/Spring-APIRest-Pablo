package com.pablo.api.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="articulo")
public class Articulo implements Serializable{
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable=false)
	private String nombre;
	
	private String descripcion;
	
	@Column(name="unidad_precio")
	private Double unidadPrecio;
	
	@Column(name="unidad_stock")
	private int unidadStock;
	
	private String tipo;
	private String proveedor;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	@PrePersist
	public void prePersist() {
		if(fecha == null) {
			fecha= new Date();
		}
	}
	
	//GETTERS y SETTERS
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getUnidadPrecio() {
		return unidadPrecio;
	}

	public void setUnidadPrecio(double unidadPrecio) {
		this.unidadPrecio = unidadPrecio;
	}

	public int getUnidadStock() {
		return unidadStock;
	}

	public void setUnidadStock(int unidadStock) {
		this.unidadStock = unidadStock;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
}
