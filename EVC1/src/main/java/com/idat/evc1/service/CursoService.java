package com.idat.evc1.service;

import java.util.List;

import com.idat.evc1.Dto.CursoDTORP;
import com.idat.evc1.Dto.CursoDTORQ;




public interface CursoService {
	

	public void guardarCurso(CursoDTORQ curso);
	public void editarCurso(CursoDTORQ curso);
	public void eliminarCurso(Integer id);
	
	
	public List<CursoDTORP> listarCursos();
	public CursoDTORP obtenerCursoId(Integer id);

}
