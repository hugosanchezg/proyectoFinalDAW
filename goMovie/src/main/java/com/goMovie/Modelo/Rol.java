package com.goMovie.Modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name = "roles")
	public class Rol {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id_usuario;
		private String nombre;

		public int getId() {
			return id_usuario;
		}

		public void setId(int id_usuario) {
			this.id_usuario = id_usuario;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Rol(int id_usuario, String nombre) {
			super();
			this.id_usuario = id_usuario;
			this.nombre = nombre;
		}

		public Rol() {
			super();
		}

		public Rol(String nombre) {
			super();
			this.nombre = nombre;
		}

		
	}
 
