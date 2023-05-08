package com.goMovie.Controlador;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class goMovieControlador {
	
	
	@GetMapping("/")
	public String index() {

		return "index";
	}

	@GetMapping("/inicio")
	public String listar() {

		/*

		List<Producto> productos;

		if (busqueda != null) {
			productos = service.buscador(busqueda);
		} else {
			productos = service.listar();
		}

		int start = page * pageSize;
		int end = Math.min((start + pageSize), productos.size());
		List<Producto> productosPaginados = productos.subList(start, end);

		model.addAttribute("productos", productosPaginados);
		model.addAttribute("currentPage", page);
		model.addAttribute("totalPages", (int) Math.ceil((double) productos.size() / pageSize));
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("busqueda", busqueda);

		long totalProductos = productos.size();
		model.addAttribute("totalProductos", totalProductos);

		 */

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

	/*
	@GetMapping("/detalles/{id_producto}")
	public String view(@PathVariable("id_producto") int id_producto, Model model, Model model1, Model model2,
					   Model model3, Model model4, Model model5, Model model6, HttpServletRequest request) {

		return buscarProductosPorId(id_producto, 1, "puntuacion", "desc", model, model1, model2, model3, model4, model5, model6, request);

	}

	@GetMapping("/detalles/{id_producto}/page/{pageNo}") // /{estrellas}
	public String buscarProductosPorId(@PathVariable("id_producto") int id_producto, @PathVariable (value = "pageNo") int pageNo,
									   @RequestParam("sortField") String sortField,
									   @RequestParam("sortDir") String sortDir, Model model,  Model model1, Model model2,
									   Model model3, Model model4, Model model5, Model model6, HttpServletRequest request) {

		//-1. Productos
		Producto p = service.getById(id_producto);
		model.addAttribute("producto", p);

		//-2. Paginacion Valoraciones
		int pageSize = 3;

		Page<Valoracion> page;

		List<Valoracion> listValoraciones;

		String estrellas = request.getParameter("estrellas");

		if (estrellas == null) {
			page = valoracionService.findPaginatedByProductId(id_producto, pageNo, pageSize, sortField, sortDir);
		} else {
			int numEstrellas = Integer.parseInt(estrellas);
			page = valoracionService.findPaginatedByProductIdAndPuntuacion(id_producto, numEstrellas, pageNo, pageSize, sortField, sortDir);
			model6.addAttribute("estrellas", estrellas);
		}

		listValoraciones = page.getContent();

		model2.addAttribute("currentPage", pageNo);
		model2.addAttribute("totalPages", page.getTotalPages());
		model2.addAttribute("totalItems", page.getTotalElements());

		model2.addAttribute("sortField", sortField);
		model2.addAttribute("sortDir", sortDir);
		model2.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");

		model2.addAttribute("valoraciones", listValoraciones);

		//-3. Encontrar perfil
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		UserDetails userDetail = (UserDetails) auth.getPrincipal();

		String emailLogueado = userDetail.getUsername();

		model4.addAttribute("usuarios", servicio.mostrarPerfiles(emailLogueado));

		int id_cliente = servicio.cogerPerfilId(emailLogueado);

		//-4. Añadir Valoración
		if (comentarioServicio.comprobar(id_cliente, id_producto).isEmpty()) {
			Valoracion valoracion = new Valoracion();
			model3.addAttribute("valoracion", valoracion);
		} else {
			int id_valoracion = comentarioServicio.cogerValoracionId(id_cliente, id_producto);

			Optional<Valoracion> valoracion = comentarioServicio.findById(id_valoracion);
			model3.addAttribute("valoracion", valoracion);
		}

		//-5. Nota media

		Float media = comentarioServicio.mediaValoraciones(id_producto);
		String mediaRedondeo;

		if (media != null) {
		    if (Math.floor(media) == media) {
		        int mediaInt = (int) media.floatValue();
		        mediaRedondeo = Integer.toString(mediaInt);
		    } else {
		        mediaRedondeo = String.format("%.1f", media);
		    }
		    model5.addAttribute("media", mediaRedondeo);
		} else {
		    model5.addAttribute("media", 0);
		}

		MDC.put("id_cliente", Integer.toString(id_cliente));
		MDC.put("usuario", emailLogueado);
		log.info("Visitado el producto " + p.getNombre() + " [" + id_producto + "]");
		MDC.remove("id_cliente");
		MDC.remove("usuario");

		return "detalles";
	}
	 */

	@GetMapping("/perfil")
	public String entrarPerfil(Model model, String perfiles) {

		/*

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		UserDetails userDetail = (UserDetails) auth.getPrincipal();

		String emailLogueado = userDetail.getUsername();

		model.addAttribute("clientes", servicio.mostrarPerfiles(emailLogueado));

		Usuario usuario = usuarioService.findByEmail(emailLogueado);

		List<Orden> ordenes = ordenService.findByUsuario(usuario);

		model.addAttribute("ordenes", ordenes);

		 */

		return "perfil";

	}

	/*

	@GetMapping("/modificarPerfil/{id}")
	public String modificarPerfil(@PathVariable Long id, Model model) {
		Optional<Usuario> usuario = servicio.findById(id);
		model.addAttribute("usuario", usuario);
		return "modificarPerfil";
	}

	@PostMapping("/saves")
	public String save(String nombre, String apellido, String direccion, String dni, Long id, boolean enabled) {
		servicio.actualizarPerfil(id, nombre, apellido, direccion, dni, enabled);
		return "redirect:/perfil";
	}

	@PostMapping("/comentario")
	public String enviarComment(int producto, int usuario, @Validated String comentario, int puntuacion, HttpServletRequest request) {
		if (comentarioServicio.comprobar(usuario, producto).isEmpty()) {
			comentarioServicio.guardarComentarios(producto, usuario, comentario, puntuacion);
		} else {
			int id_valoracion = comentarioServicio.cogerValoracionId(usuario, producto);

			comentarioServicio.actualizarComentarios(id_valoracion, comentario, puntuacion);
		}

		String referer = request.getHeader("Referer");
		return "redirect:" + referer;
	}
	*/

}
