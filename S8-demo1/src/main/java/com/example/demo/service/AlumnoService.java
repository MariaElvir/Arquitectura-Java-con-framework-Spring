package com.example.demo.service;

import java.util.List;

import com.example.demo.entidades.Alumno;

public interface AlumnoService {
  
	public List<Alumno> listar();

    public void grabar(Alumno alumno);

    public Alumno buscar(int id);

    public void eliminar(int id);
}
