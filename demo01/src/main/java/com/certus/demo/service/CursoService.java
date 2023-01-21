package com.certus.demo.service;

import java.util.List;

import com.certus.demo.entidades.Curso;

public interface CursoService {
    public List<Curso> listar();

   public void grabar(Curso curso);

   public Curso buscar(Integer id);

   public void eliminar(Integer id);
       
}

