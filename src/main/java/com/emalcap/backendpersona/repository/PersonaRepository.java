package com.emalcap.backendpersona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emalcap.backendpersona.models.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
