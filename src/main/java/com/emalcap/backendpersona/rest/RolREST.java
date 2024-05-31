package com.emalcap.backendpersona.rest;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.emalcap.backendpersona.models.Rol;
import com.emalcap.backendpersona.services.RolService;

@RestController
@RequestMapping ("/rol/")
public class RolREST {

	@Autowired
	private RolService rolService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	private ResponseEntity<List<Rol>> getAllRol(){
		return ResponseEntity.ok(rolService.findAll());
	}
	
	@GetMapping ("{id}")
	private ResponseEntity<Optional<Rol>> getFindById (@PathVariable("id") Long idRol){
		return ResponseEntity.ok(rolService.findById(idRol));
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping
	private ResponseEntity<Rol> savePersona (@RequestBody Rol rol){
				
		try {			
									
			Rol rolGuardada = rolService.save(rol);		
		return ResponseEntity.created(new URI("/rol/"+rolGuardada.getId())).body(rolGuardada);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteRol (@PathVariable ("id") Long id){
		return ResponseEntity.ok(rolService.deleteById(id));
	}
}
