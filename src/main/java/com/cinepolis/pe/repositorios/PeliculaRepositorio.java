package com.cinepolis.pe.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinepolis.pe.modelo.Pelicula;

public interface PeliculaRepositorio extends JpaRepository<Pelicula, Integer>{
	
}
