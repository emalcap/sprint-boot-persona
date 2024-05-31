package com.emalcap.backendpersona.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emalcap.backendpersona.models.Pais;
import com.emalcap.backendpersona.services.PaisService;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/pais/")
public class PaisREST {

	@Autowired
	private PaisService paisService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	private ResponseEntity<List<Pais>> getAllPaises (){
		return ResponseEntity.ok(paisService.findAll());
	}
	
	@GetMapping ("{id}")
	private ResponseEntity<Optional<Pais>> getFindById (@PathVariable("id") Long idPais){
		return ResponseEntity.ok(paisService.findById(idPais));
	}
}
