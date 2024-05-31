package com.emalcap.backendpersona.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pais")
public class Pais {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nombre ;
	
	//Constructor por defecto
	public Pais() {
		
	}
	
	
	
	public Pais(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
	public long getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	


}
