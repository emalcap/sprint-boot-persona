package com.emalcap.backendpersona.models;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Grupo")
public class GrupoBE {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private Long registroActivo;
	
	 //Constructor por defecto
	public GrupoBE() {
	}
	
	public GrupoBE(Long id, String nombre, Long registroActivo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.registroActivo = registroActivo;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Long getRegistroActivo() {
		return registroActivo;
	}


	public void setRegistroActivo(Long registroActivo) {
		this.registroActivo = registroActivo;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, nombre, registroActivo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GrupoBE other = (GrupoBE) obj;
		return Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(registroActivo, other.registroActivo);
	}


}
