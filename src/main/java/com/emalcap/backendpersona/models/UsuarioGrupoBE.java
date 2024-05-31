package com.emalcap.backendpersona.models;

import java.sql.Date;

import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "UsuarioGrupo")
public class UsuarioGrupoBE {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_usuario_grupo;		
	private Long registro_activo;
	 @Temporal(TemporalType.DATE)
	private Date registeredDate;
	  
	
	  @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "USER_ID")	     
	    private Usuario usuario;
	  
	  
	    @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "GROUP_ID")	   
	    private GrupoBE groupBE;
	   

	  //Constructor por defecto
	  		public UsuarioGrupoBE() {
	  			
	  		}


			public UsuarioGrupoBE(Long id_usuario_grupo, Long registro_activo, Date registeredDate, Usuario usuario,
					GrupoBE groupBE) {
				super();
				this.id_usuario_grupo = id_usuario_grupo;
				this.registro_activo = registro_activo;
				this.registeredDate = registeredDate;
				this.usuario = usuario;
				this.groupBE = groupBE;
			}


			public Long getId_usuario_grupo() {
				return id_usuario_grupo;
			}


			public void setId_usuario_grupo(Long id_usuario_grupo) {
				this.id_usuario_grupo = id_usuario_grupo;
			}


			public Long getRegistro_activo() {
				return registro_activo;
			}


			public void setRegistro_activo(Long registro_activo) {
				this.registro_activo = registro_activo;
			}


			public Date getRegisteredDate() {
				return registeredDate;
			}


			public void setRegisteredDate(Date registeredDate) {
				this.registeredDate = registeredDate;
			}


			public Usuario getUsuario() {
				return usuario;
			}


			public void setUsuario(Usuario usuario) {
				this.usuario = usuario;
			}


			public GrupoBE getGroupBE() {
				return groupBE;
			}


			public void setGroupBE(GrupoBE groupBE) {
				this.groupBE = groupBE;
			}


			@Override
			public int hashCode() {
				return Objects.hash(groupBE, id_usuario_grupo, registeredDate, registro_activo, usuario);
			}


			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				UsuarioGrupoBE other = (UsuarioGrupoBE) obj;
				return Objects.equals(groupBE, other.groupBE)
						&& Objects.equals(id_usuario_grupo, other.id_usuario_grupo)
						&& Objects.equals(registeredDate, other.registeredDate)
						&& Objects.equals(registro_activo, other.registro_activo)
						&& Objects.equals(usuario, other.usuario);
			}

	
}
