package com.certus.demo.modelo.daos;

import com.certus.demo.modelo.entidades.Curso;
import java.util.List;

public interface CursoDao {
    public void create(Curso curso);
    public void update(Curso curso);
    public void delete(String id);
    public Curso find(String id);
    public List<Curso> findAll();
}
