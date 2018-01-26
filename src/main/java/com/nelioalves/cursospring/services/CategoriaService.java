package com.nelioalves.cursospring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursospring.domain.Categoria;
import com.nelioalves.cursospring.repositories.CategoriaRepository;
import com.nelioalves.cursospring.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired()
	CategoriaRepository repo; 
	
	
	
	public Categoria loadById(Integer id) {
		Categoria obj = repo.findOne(id);
		if(obj==null) {
			throw new ObjectNotFoundException("Objeto não encontrado, ID : " + id + ", Tipo : " + Categoria.class.getName());
		}
		return obj;
			
	}
}
