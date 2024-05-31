package com.emalcap.backendpersona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emalcap.backendpersona.models.Usuario;
@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {

}
