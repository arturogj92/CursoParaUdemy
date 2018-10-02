package com.adevgar.apirest.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor

@Entity
@Setter
@Getter
@Table(name = "USER")
public class Usuario {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "CONTRASEÑA")
	private String contraseña;

	@Column(name = "ROL")
	private String rol;
	
	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name="USER_ID")
	private List<Tareas> listaTareas;

	

}
