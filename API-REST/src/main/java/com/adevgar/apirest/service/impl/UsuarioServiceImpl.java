package com.adevgar.apirest.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adevgar.apirest.model.Usuario;
import com.adevgar.apirest.repository.jpa.UsuarioJpaRepository;
import com.adevgar.apirest.service.UsuarioService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UsuarioServiceImpl implements UsuarioService {

	
	private UsuarioJpaRepository usuarioJpaRepository;

	
	@Override
	public Optional<Usuario> crearUsuario(Usuario usuario) {
		Optional<Usuario> usuarioOptional = usuarioJpaRepository.findByEmail(usuario.getEmail());
		if (usuarioOptional.isPresent()) {
			return usuarioOptional;
		}
		usuarioJpaRepository.save(usuario);
		return usuarioOptional;
	}
	
	@Override
	public Optional<Usuario> findUsuarioById(int id) {
		Optional<Usuario> usuarioOptional = usuarioJpaRepository.findById(id);
		return usuarioOptional;
	}

	
	@Override
	public Optional<Usuario> findUsuarioByContraseña(String contraseña) {
		
		return usuarioJpaRepository.findByContraseña(contraseña);
	}

	@Override
	public Optional<Usuario> findUsuarioByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}



	
}
