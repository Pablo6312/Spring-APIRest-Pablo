package com.pablo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pablo.api.entity.Compra;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long>{
	//Aqui se podrian crear mas metodos personalizados utilizando la clase JpaRepository
}
