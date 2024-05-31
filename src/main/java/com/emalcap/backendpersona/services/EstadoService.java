package com.emalcap.backendpersona.services;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emalcap.backendpersona.models.Estado;
import com.emalcap.backendpersona.repository.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> findAll() {
        return estadoRepository.findAll();
    }
	
    public List<Estado> findAllByCountry(Long countryId) {
        return estadoRepository.findAll().stream()
				.filter(estado -> Objects.equals(estado.getPais().getId(), countryId))
				.collect(Collectors.toList());
    }
	
}
