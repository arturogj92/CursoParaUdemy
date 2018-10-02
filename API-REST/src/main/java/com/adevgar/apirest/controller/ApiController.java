package com.adevgar.apirest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adevgar.apirest.model.Tareas;
import com.adevgar.apirest.model.Usuario;
import com.adevgar.apirest.service.TareasService;
import com.adevgar.apirest.service.UsuarioService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class ApiController {

	private UsuarioService usuarioService;
	private TareasService tareasService;
	
	@GetMapping("/user")
	public String helloWorld() {
		return "Hello world";
	}

	@PostMapping("/user")
	public ResponseEntity<Void> crearUsuario(@RequestBody Usuario usuario) {

		Optional<Usuario> user = usuarioService.crearUsuario(usuario);
		if (user.isPresent()) {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<>(HttpStatus.OK);

	}

	@GetMapping("/user/{id}")
	public ResponseEntity<Optional<Usuario>> getUsuarioById(@PathVariable int id) {

		Optional<Usuario> findUsuarioById = usuarioService.findUsuarioById(id);

		if (findUsuarioById.isPresent()) {
			return new ResponseEntity<>(findUsuarioById, HttpStatus.OK);
		}

		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/tareas/{userid}")
	public ResponseEntity<Optional<List<Tareas>>> getTareasByUserId(@PathVariable int userid){
		
		Optional<List<Tareas>> findByUserid = tareasService.findByUserid(userid);
		
		if(findByUserid.isPresent()) {
			return new ResponseEntity<>(findByUserid, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	

	// todo implementar un get.
	// implementar las tareas
	// validacidones
	// excepciones

}
