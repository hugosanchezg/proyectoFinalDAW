package com.goMovie.Servicio;

import java.util.List;
import java.util.Optional;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.goMovie.Modelo.Usuario;
import com.goMovie.UsuariosDTO.UsuarioRegistroDTO;

public interface UsuarioServicio extends UserDetailsService{
	
	public Usuario guardar(UsuarioRegistroDTO registroDTO) throws ConstraintViolationException;
	
	Optional<Usuario> findById(int id_usuario);
	
}
