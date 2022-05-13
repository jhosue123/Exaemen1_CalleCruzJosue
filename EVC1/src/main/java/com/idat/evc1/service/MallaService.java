package com.idat.evc1.service;

import java.util.List;

import com.idat.evc1.Dto.MallaCurricularDTORQ;
import com.idat.evc1.Dto.MallacurricularDTORP;



public interface MallaService {

	public void guardarMalla(MallaCurricularDTORQ malla);
	public void editarMalla(MallaCurricularDTORQ malla);
	public void eliminarMalla(Integer id);
	
	
	public List<MallacurricularDTORP> listarMallas();
	public MallacurricularDTORP obtenerMallaId(Integer id);

}
