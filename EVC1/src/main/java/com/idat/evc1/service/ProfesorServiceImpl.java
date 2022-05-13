package com.idat.evc1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.idat.evc1.Dto.ProfesorDTORP;
import com.idat.evc1.Dto.ProfesorDTORQ;

import com.idat.evc1.model.Profesor;
import com.idat.evc1.repository.ProfesorRepository;

@Service
public class ProfesorServiceImpl implements ProfesorService {

	
	@Autowired
	public ProfesorRepository repository;
	
	
	
	@Override
	public void guardarProfesor(ProfesorDTORQ profesor) {
		
		Profesor p=new Profesor();
		
	p.setProfesor(profesor.getProfesorDTO());
		
		repository.save(p);
			
	}

	@Override
	public void editarProfesor(ProfesorDTORQ profesor) {
		Profesor p=new Profesor();
		
		p.setProfesor(profesor.getProfesorDTO());
			
			repository.saveAndFlush(p);
				
		
	}

	@Override
	public void eliminarProfesor(Integer id) {
	repository.deleteById(id);
	}

	@Override
	public List<ProfesorDTORP> listarPorfesores() {

		List<ProfesorDTORP> lista = new ArrayList<ProfesorDTORP>();
		ProfesorDTORP p= null; 
		

		for (Profesor profesor :repository.findAll()) {
			p = new ProfesorDTORP();
			
			p.setProfesorDTO(profesor.getProfesor());
			
			lista.add(p);
			
		}
		

		return lista;
	}

	@Override
	public ProfesorDTORP obtenerProfesorId(Integer id) {

	Profesor profesor = repository.findById(id).orElse(null);
		
		ProfesorDTORP p=new	ProfesorDTORP();
		
		
		p.setProfesorDTO(profesor.getProfesor());

		return p;
	}

}
