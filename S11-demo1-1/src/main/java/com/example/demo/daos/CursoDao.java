package com.example.demo.daos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entidades.Curso;

public interface CursoDao extends MongoRepository<Curso, String> {

}
