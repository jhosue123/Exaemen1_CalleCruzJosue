package com.idat.evc1.service;

import java.util.List;

import com.idat.evc1.Dto.ProfesorDTORP;
import com.idat.evc1.Dto.ProfesorDTORQ;



public interface ProfesorService {


	public void guardarProfesor(ProfesorDTORQ profesor);
	public void editarProfesor(ProfesorDTORQ profesor);
	public void eliminarProfesor(Integer id);
	
	
	public List<ProfesorDTORP> listarPorfesores();
	public ProfesorDTORP obtenerProfesorId(Integer id);
}
