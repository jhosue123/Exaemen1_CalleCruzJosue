package com.idat.evc1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.evc1.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository< Curso, Integer>{

}
