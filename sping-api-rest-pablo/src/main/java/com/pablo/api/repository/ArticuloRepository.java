package com.pablo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pablo.api.entity.Articulo;

@Repository
public interface ArticuloRepository extends JpaRepository<Articulo, Long>{

}
