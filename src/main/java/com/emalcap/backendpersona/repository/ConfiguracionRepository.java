package com.emalcap.backendpersona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emalcap.backendpersona.models.Configuracion;
@Repository
public interface ConfiguracionRepository extends JpaRepository<Configuracion, Long>{

}
