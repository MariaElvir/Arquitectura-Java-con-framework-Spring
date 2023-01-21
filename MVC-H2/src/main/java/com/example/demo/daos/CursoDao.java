package com.example.demo.daos;

import java.util.List;

import com.example.demo.entidades.Curso;

public interface CursoDao {
	public List<Curso> findAll();

	public void save(Curso curso);

	public Curso findOne(Integer id);

	public void delete(Integer id);
}