package com.emalcap.backendpersona.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emalcap.backendpersona.models.Usuario;
import com.emalcap.backendpersona.services.UsuarioService;

@RestController
@RequestMapping ("/usuarios/")
public class UsuarioREST {

	@Autowired
	private UsuarioService usuarioService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	private ResponseEntity<List<Usuario>> getAllRol(){
		return ResponseEntity.ok(usuarioService.findAll());
	}
}
