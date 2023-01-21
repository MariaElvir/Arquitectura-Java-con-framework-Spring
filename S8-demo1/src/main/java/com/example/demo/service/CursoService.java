package com.example.demo.service;

import java.util.List;

import com.example.demo.entidades.Curso;

public interface CursoService {

    public List<Curso> listar();

    public void grabar(Curso curso);

    public Curso buscar(int id);

    public void eliminar(int id);
        
}