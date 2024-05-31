package com.emalcap.backendpersona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emalcap.backendpersona.models.UsuarioGrupoBE;
@Repository
public interface UsuarioGrupoRepository extends JpaRepository <UsuarioGrupoBE, Long>{

}