package com.heitorpreviero.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heitorpreviero.cursomc.domain.Cliente;
import com.heitorpreviero.cursomc.repositories.ClienteRepository;
import com.heitorpreviero.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {   
	Optional<Cliente> obj = repo.findById(id); 
	return obj.orElseThrow(() -> new ObjectNotFoundException( 
			"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName())); 
	} 

}
