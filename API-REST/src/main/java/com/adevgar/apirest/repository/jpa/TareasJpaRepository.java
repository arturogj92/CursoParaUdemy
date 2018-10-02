package com.adevgar.apirest.repository.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adevgar.apirest.model.Tareas;

@Repository
public interface TareasJpaRepository extends JpaRepository<Tareas,Integer>{

				//Pensar funcionalidades.
	
				/*
				 * getbytipo
				 * getbyprioridad ordenada o reversed o mayor que
				 * getby duracion
				 * get realizadas
				 * get no realizadas
				 * get fecha_realizacion
				 * get categoria (añadir)
				 */
	
				public Optional<Tareas> findByTipo(String tipo);
				public Optional<List<Tareas>> findByUserid(int id);
	
}
