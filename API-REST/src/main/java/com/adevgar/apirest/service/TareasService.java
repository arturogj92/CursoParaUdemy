package com.adevgar.apirest.service;

import java.util.List;
import java.util.Optional;

import com.adevgar.apirest.model.Tareas;

public interface TareasService {

	public Optional<List<Tareas>> findByUserid (int id);
	
}
