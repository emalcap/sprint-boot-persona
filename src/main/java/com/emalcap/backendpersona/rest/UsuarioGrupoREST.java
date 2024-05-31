package com.emalcap.backendpersona.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.emalcap.backendpersona.models.UsuarioGrupoBE;

import com.emalcap.backendpersona.services.UsuarioGrupoService;

@RestController
@RequestMapping("/usuarioGrupo/")
public class UsuarioGrupoREST {

	@Autowired
	private UsuarioGrupoService usuarioGrupoService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	private ResponseEntity<List<UsuarioGrupoBE>> getAllUsuarioGrupo(){
		return ResponseEntity.ok(usuarioGrupoService.findAll());
	}
}
