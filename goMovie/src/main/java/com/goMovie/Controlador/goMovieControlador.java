package com.goMovie.Controlador;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import com.goMovie.Modelo.Pelicula;
import com.goMovie.Servicio.PeliculaServicio;

@Controller
@RequestMapping("/")
public class goMovieControlador {
	

	@Autowired
	private PeliculaServicio peliculaServicio;

	
	@GetMapping("/")
	public String index() {
		
		return "index";
	}

	@GetMapping("/inicio")
	public String listar(Model model) {


		List<Pelicula> peliculas = peliculaServicio.findAll();

		model.addAttribute("peliculas", peliculas);
		
		System.out.println("peliculas " + peliculaServicio.findAll());
 
		return "inicio";
	}

	@GetMapping("/ofertas")
	public String ofertas() {
		return "ofertas";
	}

	@GetMapping("/lista")
	public String tulista() {
		return "lista";
	}

	@GetMapping("/proximamente")
	public String proximamente() {
		return "proximamente";
	}
	
	@GetMapping("/login")
	public String iniciarSesion(Model model, String error) {

		return "login";
	}

	@GetMapping("/signup")
	public String registrarse() {
		return "signup";
	}

	@GetMapping("/carrusel")
	public String carrusel() {
		return "carrusel";
	}
	
	@GetMapping("/detalles")
	public String detalles() {
		return "detalles";
	}


	@GetMapping("/perfil")
	public String entrarPerfil(Model model, String perfiles) {
		return "perfil";

	}



}
