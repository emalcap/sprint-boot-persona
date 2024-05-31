package com.emalcap.backendpersona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emalcap.backendpersona.models.Rol;
@Repository
public interface RolRepository extends JpaRepository<Rol, Long>{

}
