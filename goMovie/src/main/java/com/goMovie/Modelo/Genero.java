package com.goMovie.Modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "genero")
public class Genero {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_pelicula;
	private String nombre;
	
	
	
	public Genero() {
		super();
	}
	
	public Genero(int id_pelicula, String nombre) {
		super();
		this.id_pelicula = id_pelicula;
		this.nombre = nombre;
	}


	public int getId_pelicula() {
		return id_pelicula;
	}
	
	public void setId_pelicula(int id_pelicula) {
		this.id_pelicula = id_pelicula;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	@Override
	public String toString() {
		return "Genero [id_pelicula=" + id_pelicula + ", nombre=" + nombre + "]";
	}

	
	
}
