package com.emalcap.backendpersona.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.emalcap.backendpersona.models.Estado;
import com.emalcap.backendpersona.services.EstadoService;

@RestController
@RequestMapping ("/estados/")
public class EstadoREST {
	@Autowired
	private EstadoService estadoService;
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping ("{id}")
	private ResponseEntity<List<Estado>> getAllEstadosByPais (@PathVariable("id") Long idPais){
		return ResponseEntity.ok(estadoService.findAllByCountry(idPais));
		
	}
}
