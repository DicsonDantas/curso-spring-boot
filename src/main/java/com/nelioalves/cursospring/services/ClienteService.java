package com.nelioalves.cursospring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursospring.domain.Cliente;
import com.nelioalves.cursospring.repositories.ClienteRepository;
import com.nelioalves.cursospring.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired()
	ClienteRepository repo; 
	
	
	
	public Cliente loadById(Integer id) {
		Cliente obj = repo.findOne(id);
		if(obj==null) {
			throw new ObjectNotFoundException("Objeto não encontrado, ID : " + id + ", Tipo : " + Cliente.class.getName());
		}
		return obj;
			
	}
}
