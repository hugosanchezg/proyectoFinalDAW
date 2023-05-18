package com.goMovie.Servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goMovie.Modelo.Pelicula;
import com.goMovie.Repositorio.PeliculaRepositorio;

@Service
public class PeliculaServicioImpl implements PeliculaServicio {

	@Autowired(required = false)
	private PeliculaRepositorio peliculaRepositorio;
	
	@Override
	public List<Pelicula> findAll() {
		return peliculaRepositorio.findAll();
	}
	
	@Override
	public Pelicula findByID(int id_pelicula) {
		Optional<Pelicula> peliculaOptional = peliculaRepositorio.findById(id_pelicula);
	    return peliculaOptional.orElse(null); 
	}

	@Override
	public List<Pelicula> generos(int genero) {
		return peliculaRepositorio.generos(genero);
	}

	@Override
	public List<Pelicula> ofertas() {
		return peliculaRepositorio.ofertas();
	}

	@Override
	public List<Pelicula> buscador(String busqueda) {
		return peliculaRepositorio.buscador(busqueda);
	}


	
	

}
