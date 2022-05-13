package com.idat.evc1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.idat.evc1.Dto.CursoDTORP;
import com.idat.evc1.Dto.CursoDTORQ;
import com.idat.evc1.model.Curso;
import com.idat.evc1.repository.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService
{
	@Autowired
	public CursoRepository repository;
	

	

	
	@Override
	public void guardarCurso(CursoDTORQ curso) {
		
	Curso c=new Curso();
	
	c.setCurso(curso.getCursoDTO());
	c.setDescripcion(curso.getDescripcionDTO());
	
	repository.save(c);
		
	}

	@Override
	public void editarCurso(CursoDTORQ curso) {
		
		Curso c=new Curso();
		
		c.setCurso(curso.getCursoDTO());
		c.setDescripcion(curso.getDescripcionDTO());
		
		repository.saveAndFlush(c);
	}

	@Override
	public void eliminarCurso(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public List<CursoDTORP> listarCursos() {
		
		
		List<CursoDTORP> lista = new ArrayList<CursoDTORP>();
		CursoDTORP c= null; 
		

		for (Curso curso :repository.findAll()) {
			c = new CursoDTORP();
			
			c.setCursoDTO(curso.getCurso());
			c.setDescripcionDTO(curso.getDescripcion());
			
			lista.add(c);
			
		}
		

		return lista;
		
		
	}

	@Override
	public CursoDTORP obtenerCursoId(Integer id) {
		
		Curso curso = repository.findById(id).orElse(null);
		
		CursoDTORP c = new CursoDTORP();
		c.setCursoDTO(curso.getCurso());
		c.setDescripcionDTO(curso.getDescripcion());

		return c;
	}

}
