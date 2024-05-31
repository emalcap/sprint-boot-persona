package com.emalcap.backendpersona.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emalcap.backendpersona.models.Pais;
import com.emalcap.backendpersona.repository.PaisRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PaisService {

	@Autowired
	private PaisRepository paisRepository;


	public List<Pais> findAll() {
		return paisRepository.findAll();
	}
	
	public Optional<Pais> findById(Long id) {
		return paisRepository.findById(id);
	}

}
