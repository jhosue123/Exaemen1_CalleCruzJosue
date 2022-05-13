package com.idat.evc1.service;

import java.util.List;

import com.idat.evc1.Dto.UniversidadDTORP;
import com.idat.evc1.Dto.UniversidadDTORQ;

public interface UniversidadService {
	

	public void guardarUniversidad(UniversidadDTORQ universidad);
	public void editarUniversidad(UniversidadDTORQ universidad);
	public void eliminarUniversidad(Integer id);
	
	
	public List<UniversidadDTORP> listarUniversidad();
	public UniversidadDTORP obtenerUniversidadId(Integer id);

}
