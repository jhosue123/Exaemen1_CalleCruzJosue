package com.idat.evc1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.idat.evc1.Dto.MallaCurricularDTORQ;
import com.idat.evc1.Dto.MallacurricularDTORP;

import com.idat.evc1.model.Mallacurricular;
import com.idat.evc1.repository.MallacurricularRepository;

@Service
public class MallaServiceImpl  implements MallaService{

	
	@Autowired
	public MallacurricularRepository repository;
	
	
	@Override
	public void guardarMalla(MallaCurricularDTORQ malla) {
		
		Mallacurricular m=new Mallacurricular();
		
		m.setAño(malla.getAñoDTO());
		
		repository.save(m);
		
	}

	@Override
	public void editarMalla(MallaCurricularDTORQ malla) {
		
	Mallacurricular m=new Mallacurricular();
	  
	m.setAño(malla.getAñoDTO());
		
		repository.saveAndFlush(m);
		
	}

	@Override
	public void eliminarMalla(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<MallacurricularDTORP> listarMallas() {
		
		List<MallacurricularDTORP> lista = new ArrayList<MallacurricularDTORP>();
		
		MallacurricularDTORP m= null; 
		

		for (Mallacurricular malla :repository.findAll()) {
			m = new MallacurricularDTORP();
			
			m.setAñoDTO(malla.getAño());
	
			
			lista.add(m);
			
		}
		

		return lista;
		
		
	}

	@Override
	public MallacurricularDTORP obtenerMallaId(Integer id) {
	
		Mallacurricular malla = repository.findById(id).orElse(null);
		
		MallacurricularDTORP m = new MallacurricularDTORP();
		m.setAñoDTO(malla.getAño());

		return m;
	}

}
