package com.example.demo.daos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entidades.Alumno;

public interface AlumnoDao extends CrudRepository<Alumno,Integer>{

}
