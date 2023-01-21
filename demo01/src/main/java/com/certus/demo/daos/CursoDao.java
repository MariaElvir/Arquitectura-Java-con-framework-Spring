package com.certus.demo.daos;

import java.util.List;
import com.certus.demo.entidades.Curso;

public interface CursoDao {

	public List<Curso> findAll();

	public void save(Curso curso);

	public Curso findOne(Integer id);

	public void delete(Integer id);
}