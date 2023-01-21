package com.certus.demo.servicios;

import com.certus.demo.modelo.entidades.Curso;
import java.util.List;

public interface CursoService {
    public void grabar(Curso curso);
    public void actualizar(Curso curso);
    public void eliminar(String id);
    public Curso buscar(String id);
    public List<Curso> listar();
    
}