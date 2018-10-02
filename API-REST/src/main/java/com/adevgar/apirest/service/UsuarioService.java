package com.adevgar.apirest.service;

import java.util.Optional;

import com.adevgar.apirest.model.Usuario;

public interface UsuarioService {

	public Optional<Usuario> findUsuarioByContraseña(String contraseña);

	public Optional<Usuario> findUsuarioByEmail(String email);
	
	public Optional<Usuario> findUsuarioById(int id);
	
	public Optional<Usuario> crearUsuario(Usuario usuario);

	//crea el repositorio de tareas
}
