package com.certus.demo.servicios.impl;

import com.certus.demo.modelo.daos.CursoDao;
import com.certus.demo.modelo.entidades.Curso;
import com.certus.demo.servicios.CursoService;
import java.util.List;

public class CursoServiceImpl implements CursoService{

    private CursoDao dao;
    
    public CursoServiceImpl() {
    }

    @Override
    public void grabar(Curso curso) {
        dao.create(curso);
    }

    @Override
    public void actualizar(Curso curso) {
        dao.update(curso);
    }

    @Override
    public void eliminar(String id) {
        dao.delete(id);
    }

    @Override
    public Curso buscar(String id) {
        return dao.find(id);
    }

    @Override
    public List<Curso> listar() {
        return dao.findAll();
    }
    
}
