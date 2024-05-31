package com.emalcap.backendpersona.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.emalcap.backendpersona.models.UsuarioGrupoBE;
import com.emalcap.backendpersona.repository.UsuarioGrupoRepository;

@Service
public class UsuarioGrupoService {

	@Autowired
	private UsuarioGrupoRepository usuarioGrupoRepository;
	
	public List<UsuarioGrupoBE> findAll() {
		return usuarioGrupoRepository.findAll();
	}
}
