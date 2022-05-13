package com.idat.evc1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.idat.evc1.model.Mallacurricular;

@Repository
public interface MallacurricularRepository extends JpaRepository<Mallacurricular, Integer>{

}
