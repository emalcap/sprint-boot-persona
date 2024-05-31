package com.emalcap.backendpersona.repository;

// java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.emalcap.backendpersona.models.Estado;

@Repository
public interface EstadoRepository  extends JpaRepository<Estado , Long> {

	/*@Query("select e from Estado  e ")
	List<Estado> ListarEstado();
	*/
}
