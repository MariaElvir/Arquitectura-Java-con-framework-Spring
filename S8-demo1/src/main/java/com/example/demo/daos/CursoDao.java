package com.example.demo.daos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entidades.Curso;

public interface CursoDao extends CrudRepository<Curso,Integer> {
}