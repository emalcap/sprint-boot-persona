package com.emalcap.backendpersona.models;

import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.List;

@Entity

@Table(name="usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private Long activo;
	  @ManyToMany
	    @JoinTable(name = "roles_usuarios",	    	
	        joinColumns = @JoinColumn(name = "id_usuario"),
	        inverseJoinColumns = @JoinColumn(name = "id_rol")	       
	        )	 
	   private List<Rol> rol;
	
	  
	    @OneToOne(cascade=CascadeType.ALL)
	    @JoinColumn(name = "id_configuracion",unique=true)
		private Configuracion configuracion;
	    
	    
	    @OneToOne(cascade=CascadeType.ALL)
	    @JoinColumn(name = "id_grupo",unique=true)
		private GrupoBE grupoBE;
	    
	   
	 //Constructor por defecto
		public Usuario() {
			
		}

	@Override
		public int hashCode() {
			return Objects.hash(id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Usuario other = (Usuario) obj;
			return Objects.equals(id, other.id);
		}



	public Usuario(Long id, String nombre, Long activo, List<Rol> rol, Configuracion configuracion) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.activo = activo;
			this.rol = rol;
			this.configuracion = configuracion;
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

	public Long getActivo() {
		return activo;
	}

	public void setActivo(Long activo) {
		this.activo = activo;
	}




	public List<Rol> getRol() {
		return rol;
	}

	public void setRol(List<Rol> rol) {
		this.rol = rol;
	}

	public Configuracion getConfiguracion() {
		return configuracion;
	}

	public void setConfiguracion(Configuracion configuracion) {
		this.configuracion = configuracion;
	}
	
		
}
