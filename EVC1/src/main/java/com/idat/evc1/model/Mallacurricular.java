package com.idat.evc1.model;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;





@Table(name="Mallacurriculares")
@Entity
public class Mallacurricular {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMalla;
	private Integer año;
	
	

	@OneToMany(mappedBy = "mallacurricular")
	private List<Curso> curso =new ArrayList<Curso>();
	
	
	
	
	
	

	
	public Integer getIdMalla() {
		return idMalla;
	}
	public void setIdMalla(Integer idMalla) {
		this.idMalla = idMalla;
	}
	public Integer getAño() {
		return año;
	}
	public void setAño(Integer año) {
		this.año = año;
	}
	
	
	

}
