package com.goMovie.Servicio;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goMovie.Modelo.Pelicula;
import com.goMovie.Modelo.Tag;
import com.goMovie.Repositorio.PeliculaRepositorio;
import com.goMovie.Repositorio.TagRepositorio;

@Service
public class TagServicioImpl implements TagServicio {
	
	@Autowired(required = false)
	private TagRepositorio tagRepositorio;
	
    public int findIdByNombre(String nombre) {
        Tag tag = tagRepositorio.findByNombre(nombre);
        if (tag != null) {
            return tag.getId_tag();
        }
        throw new IllegalArgumentException("El tag con el nombre proporcionado no existe.");
    }
}
