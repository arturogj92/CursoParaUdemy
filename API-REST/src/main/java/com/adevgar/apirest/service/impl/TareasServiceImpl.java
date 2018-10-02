package com.adevgar.apirest.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adevgar.apirest.model.Tareas;
import com.adevgar.apirest.repository.jpa.TareasJpaRepository;
import com.adevgar.apirest.repository.jpa.UsuarioJpaRepository;
import com.adevgar.apirest.service.TareasService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class TareasServiceImpl implements TareasService{

	TareasJpaRepository tareasJpaRepository;

	@Override
	public Optional<List<Tareas>> findByUserid(int id) {
		Optional<List<Tareas>> findByUserid = tareasJpaRepository.findByUserid(id);
		return findByUserid;
	}
	
	
}
