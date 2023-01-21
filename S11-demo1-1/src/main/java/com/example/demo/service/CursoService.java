package com.example.demo.service;

import java.util.List;

import com.example.demo.entidades.Curso;

public interface CursoService {
	public List<Curso> listar();

    public void grabar(Curso curso);

    public Curso buscar(String id);

    public void eliminar(String id);
   

}
