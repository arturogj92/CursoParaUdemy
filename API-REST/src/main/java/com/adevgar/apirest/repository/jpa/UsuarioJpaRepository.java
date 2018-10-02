package com.adevgar.apirest.repository.jpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adevgar.apirest.model.Usuario;


@Repository
public interface UsuarioJpaRepository extends JpaRepository<Usuario, Integer> {

			public Optional<Usuario> findById(int id);
			public Optional<Usuario> findByEmail(String email);
			public Optional<Usuario> findByContraseña(String contraseña);
			public Optional<Usuario> findByNombre(String nombre);
			public Optional<Usuario> findByRol(String rol);
//			public List<Tareas> findByListaTareas(String id);
	
}
