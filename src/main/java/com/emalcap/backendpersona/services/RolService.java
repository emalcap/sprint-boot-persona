package com.emalcap.backendpersona.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.emalcap.backendpersona.models.Rol;
import com.emalcap.backendpersona.repository.RolRepository;

@Service
public class RolService {
	@Autowired
	private RolRepository rolRepository;

	public List<Rol> findAll() {
		return rolRepository.findAll();
	}
	
	public Optional<Rol> findById(Long id) {
		return rolRepository.findById(id);
	}
	
	public <S extends Rol> S save(S entity) {
		return rolRepository.save(entity);
	}
	
	public Boolean deleteById(Long id) {
		if (rolRepository.existsById(id)) {
			rolRepository.deleteById(id);
			return !rolRepository.existsById(id);
		}
		return false;
	}

	
}
