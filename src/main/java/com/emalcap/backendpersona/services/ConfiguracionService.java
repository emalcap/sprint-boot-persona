package com.emalcap.backendpersona.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emalcap.backendpersona.models.Configuracion;

import com.emalcap.backendpersona.repository.ConfiguracionRepository;

@Service
public class ConfiguracionService {

	@Autowired
	private ConfiguracionRepository configuracionRepository;

	public List<Configuracion> findAll() {
		return configuracionRepository.findAll();
	}
	
	public Optional<Configuracion> findById(Long id) {
		return configuracionRepository.findById(id);
	}

}
