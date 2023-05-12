package com.goMovie.Modelo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "peliculas")
public class Pelicula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_pelicula;
	private String foto;
	private String nombre;
	private String descripción;
	private String duracion;
	private float precio;
	private int stock;
	private int rebaja;
	private int descatalogado;
	/*
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_genero")
	private Genero genero;*/

	private int id_genero;
	
	public Pelicula() {
		super();
	}

	public Pelicula(int id_pelicula, String foto, String nombre, String descripción, String duracion, float precio,
			int stock, int rebaja, int descatalogado, int id_genero) {
		super();
		this.id_pelicula = id_pelicula;
		this.foto = foto;
		this.nombre = nombre;
		this.descripción = descripción;
		this.duracion = duracion;
		this.precio = precio;
		this.stock = stock;
		this.rebaja = rebaja;
		this.descatalogado = descatalogado;
		this.id_genero = id_genero;
	}
	
	
	public int getId_pelicula() {
		return id_pelicula;
	}

	public void setId_pelicula(int id_pelicula) {
		this.id_pelicula = id_pelicula;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripción() {
		return descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getRebaja() {
		return rebaja;
	}

	public void setRebaja(int rebaja) {
		this.rebaja = rebaja;
	}

	public int getDescatalogado() {
		return descatalogado;
	}

	public void setDescatalogado(int descatalogado) {
		this.descatalogado = descatalogado;
	}

	public int getGenero() {
		return id_genero;
	}

	public void setGenero(int genero) {
		this.id_genero = id_genero;
	}


	@Override
	public String toString() {
		return "Pelicula [id_pelicula=" + id_pelicula + ", foto=" + foto + ", nombre=" + nombre + ", descripción="
				+ descripción + ", duracion=" + duracion + ", precio=" + precio + ", stock=" + stock + ", rebaja="
				+ rebaja + ", descatalogado=" + descatalogado + ", id_genero=" + id_genero + "]";
	}
	
	
}
