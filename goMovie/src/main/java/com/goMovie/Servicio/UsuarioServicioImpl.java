//package com.goMovie.Servicio;
//
//import java.util.Arrays;
//
//import org.springframework.stereotype.Service;
//
//import com.goMovie.UsuariosDTO.UsuarioRegistroDTO;
//import com.goMovie.Modelo.Rol;
//import com.goMovie.Modelo.Usuario;
//import com.goMovie.Repositorio.UsuarioRepositorio;
//
//
//
//@Service
//public class UsuarioServicioImpl implements UsuarioServicio{
//	
//	private UsuarioRepositorio usuarioRepositorio;
//
//	public UsuarioServicioImpl(UsuarioRepositorio usuarioRepositorio) {
//		super();
//		this.setUsuarioRepositorio(usuarioRepositorio);
//	}
//
//	@Override
//	public Usuario guardar(UsuarioRegistroDTO registroDTO) {
//		Usuario usuario = new Usuario(registroDTO.getNombre(),
//				registroDTO.getApellido(),
//				registroDTO.getEmail(),
//				registroDTO.getPassword(),
//				Arrays.asList(new Rol("ROLE_USER"));
//		
//		return usuarioRepositorio.save(usuario);
//	}
//
//	public UsuarioRepositorio getUsuarioRepositorio() {
//		return usuarioRepositorio;
//	}
//
//	public void setUsuarioRepositorio(UsuarioRepositorio usuarioRepositorio) {
//		this.usuarioRepositorio = usuarioRepositorio;
//	}
//	
//	
//}
