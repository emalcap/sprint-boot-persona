package com.emalcap.backendpersona.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emalcap.backendpersona.models.Configuracion;

import com.emalcap.backendpersona.services.ConfiguracionService;

@RestController
@RequestMapping ("/configuracion/")
public class ConfiguracionREST {

	@Autowired
	private ConfiguracionService configuracionService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	private ResponseEntity<List<Configuracion>> getAllConfiguracion(){
		return ResponseEntity.ok(configuracionService.findAll());
	}
	
	@GetMapping ("{id}")
	private ResponseEntity<Optional<Configuracion>> getFindById (@PathVariable("id") Long idConfiguracion){
		return ResponseEntity.ok(configuracionService.findById(idConfiguracion));
	}
}
