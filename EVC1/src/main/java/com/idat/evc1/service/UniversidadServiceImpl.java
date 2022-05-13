package com.idat.evc1.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.evc1.Dto.UniversidadDTORP;
import com.idat.evc1.Dto.UniversidadDTORQ;
import com.idat.evc1.model.Universidad;
import com.idat.evc1.repository.UniversidadRepository;

@Service
public class UniversidadServiceImpl implements UniversidadService{
	
	@Autowired
	public UniversidadRepository repository;

	@Override
	public void guardarUniversidad(UniversidadDTORQ universidad) {
		Universidad u=new Universidad();
		
		u.setUniversidad(universidad.getUniversidadDTO());

		
		repository.save(u);
		
	}

	@Override
	public void editarUniversidad(UniversidadDTORQ universidad) {
      
		Universidad u=new Universidad();
		
		u.setUniversidad(universidad.getUniversidadDTO());

		
		repository.saveAndFlush(u);
		
	}

	@Override
	public void eliminarUniversidad(Integer id) {
	repository.deleteById(id);
		
	}

	@Override
	public List<UniversidadDTORP> listarUniversidad() {
		
		List<UniversidadDTORP> lista = new ArrayList<UniversidadDTORP>();
		UniversidadDTORP u= null; 
		

		for (Universidad universidad :repository.findAll()) {
			u = new UniversidadDTORP();
			
			u.setUniversidadDTO(universidad.getUniversidad());
			
			
			lista.add(u);
			
		}
		

		return lista;
		
	}

	@Override
	public UniversidadDTORP obtenerUniversidadId(Integer id) {
		
	Universidad universidad= repository.findById(id).orElse(null);
		
	UniversidadDTORP u = new UniversidadDTORP();
	
	u.setUniversidadDTO(universidad.getUniversidad());

		return u;
	}

}
