package com.goMovie.Controlador;


import java.util.*;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.goMovie.Modelo.Pelicula;
import com.goMovie.Servicio.PeliculaServicio;
import com.goMovie.Servicio.TagServicio;

@Controller
@RequestMapping("/")
public class goMovieControlador {
	

	@Autowired
	private PeliculaServicio peliculaServicio;
	
	@Autowired
	private TagServicio tagServicio;


			/* PAGINAS PRINCIPALES */
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/inicio")
	public String listar(String busqueda, Model model, @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "6") int pageSize) {

		List<Pelicula> peliculas;
		
		if (busqueda != null && !busqueda.isEmpty()) {
			peliculas = peliculaServicio.buscador(busqueda);
		} else {
			peliculas = peliculaServicio.findAll();
		}

		int start = page * pageSize;
		int end = Math.min((start + pageSize), peliculas.size());
		long totalProductos = peliculas.size();
		List<Pelicula> peliculasPaginadas = peliculas.subList(start, end);

		model.addAttribute("peliculas", peliculasPaginadas);
		model.addAttribute("currentPage", page);
		model.addAttribute("totalPages", (int) Math.ceil((double) peliculas.size() / pageSize));
		model.addAttribute("pageSize", pageSize);

		model.addAttribute("totalProductos", totalProductos);

		if (busqueda != null && !busqueda.isEmpty()) {
			model.addAttribute("busqueda", busqueda);
			return "busqueda";

		}else {
			return "inicio";
		}


	}
			/* PAGINAS PRINCIPALES */
	

			/* CATEGORIAS */
	@GetMapping("/fantasia")
	public String fantasia(Model model) {
	    List<Pelicula> peliculas = peliculaServicio.generos(1);
	    model.addAttribute("peliculas", peliculas);
	    
	    return "inicio";
	}

	
	@GetMapping("/drama")
	public String drama(Model model) {
		List<Pelicula> peliculas = peliculaServicio.generos(2);
		model.addAttribute("peliculas", peliculas);

		return "inicio";
	}
	
	@GetMapping("/romantico")
	public String romantico(Model model) {
		List<Pelicula> peliculas = peliculaServicio.generos(3);
		model.addAttribute("peliculas", peliculas);
		
		return "inicio";
	}
	
	@GetMapping("/comedia")
	public String comedia(Model model) {
		List<Pelicula> peliculas = peliculaServicio.generos(4);
		model.addAttribute("peliculas", peliculas);
		
		return "inicio";
	}
	
	@GetMapping("/infantil")
	public String infantil(Model model) {
		List<Pelicula> peliculas = peliculaServicio.generos(5);
		model.addAttribute("peliculas", peliculas);
		
		return "inicio";
	}
	
	@GetMapping("/accion")
	public String accion(Model model) {
		List<Pelicula> peliculas = peliculaServicio.generos(6);
		model.addAttribute("peliculas", peliculas);
		
		return "inicio";
	}
	
	@GetMapping("/todas")
	public String todas(Model model) {
		List<Pelicula> peliculas = peliculaServicio.findAll();
		model.addAttribute("peliculas", peliculas);
		
		return "inicio";
	}
			/* CATEGORIAS */
	
	
	
			/* TAGS */
	@GetMapping("/{tagName}")
	public String categoriaTags(@PathVariable String tagName, Model model) {
		int tagId = tagServicio.findIdByNombre(tagName);
		List<Pelicula> peliculas = peliculaServicio.findByTagId(tagId);
		model.addAttribute("peliculas", peliculas);   
		
	    return "categoria";
	}
			/* TAGS */
	
	
	
			/* OFERTAS */
	@GetMapping("/ofertas")
	public String ofertas(Model model) {
	    List<Pelicula> peliculas = peliculaServicio.ofertas();
	    Map<Pelicula, String> preciosFinales = new HashMap<>();
	    
	    for (Pelicula pelicula : peliculas) {
	        int rebajaPelicula = pelicula.getRebaja();
	        float precioPelicula = pelicula.getPrecio();
	        float descuento = (precioPelicula * rebajaPelicula) / 100;
	        float precioFinal = precioPelicula - descuento;
	        
	        String precioFormateado = String.format("%.2f", precioFinal);
	        preciosFinales.put(pelicula, precioFormateado);
	    }
	    
	    peliculas.sort(Comparator.comparingInt(Pelicula::getRebaja).reversed());
	    List<Pelicula> peliculasDestacadas = peliculas.stream().limit(3).collect(Collectors.toList());
	    model.addAttribute("peliculasDestacadas", peliculasDestacadas);
	    
	    List<Pelicula> peliculasRestantes = peliculas.stream().skip(3).collect(Collectors.toList());

	    model.addAttribute("peliculasDestacadas", peliculasDestacadas);
	    model.addAttribute("peliculasRestantes", peliculasRestantes);
	    model.addAttribute("preciosFinales", preciosFinales);
	    
	    return "ofertas";

	}
			/* OFERTAS */



			/* DETALLES */
	@GetMapping("/detalles/{id_pelicula}")
	public String detalles(@PathVariable("id_pelicula") int id_pelicula, Model model) {
		Pelicula pelicula = peliculaServicio.findByID(id_pelicula);
		model.addAttribute("pelicula", pelicula);
		
		return "detalles";

	}
			/* DETALLES */
	
	
	
			/* TU LISTA */
	@GetMapping("/lista")
	public String tulista() {
		return "lista";
	}
			/* TU LISTA */


	
			/* PROXIMAMENTE */
	@GetMapping("/proximamente")
	public String proximamente() {
		return "proximamente";
	}
			/* PROXIMAMENTE */
	
	
	
	
			/* LOGIN Y USUARIO */
	@GetMapping("/login")
	public String iniciarSesion(Model model, String error) {
		return "login";
	}


	@GetMapping("/perfil")
	public String entrarPerfil(Model model, String perfiles) {
		return "perfil";
	}

	@GetMapping("/modificarPerfil")
	public String modificarPerfil(Model model, String perfiles) {
		return "modificarPerfil";
	}
			/* LOGIN Y USUARIO */
	
	
		
			/* ADMINISTRACION */
			/* ADMINISTRACION */
	

	



}
