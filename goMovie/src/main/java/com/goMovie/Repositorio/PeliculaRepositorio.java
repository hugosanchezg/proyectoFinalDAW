package com.goMovie.Repositorio;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goMovie.Modelo.Pelicula;


@Repository
public interface PeliculaRepositorio extends JpaRepository<Pelicula, Integer> {

}
