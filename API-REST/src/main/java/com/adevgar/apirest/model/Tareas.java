package com.adevgar.apirest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter

@Table(name = "TAREAS")
@Entity
public class Tareas {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="USER_ID")
	private int userid;
	
	@Column(name = "TIPO")
	private String tipo;
	
	@Column(name = "PRIORIDAD")
	private int prioridad;
	
	@Column(name = "DURACION")
	private String duracion;
	
	@Column(name = "REALIZADO")
	private boolean realizado;
	
	@Column(name = "FECHA_REALIZACION")
	private String fecharealizacion;
	
	@Column(name = "COMENTARIO")
	private String comentario;
}
