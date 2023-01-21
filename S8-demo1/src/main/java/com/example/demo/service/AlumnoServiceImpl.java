package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.daos.AlumnoDao;
import com.example.demo.entidades.Alumno;
@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    private AlumnoDao dao;
        
    @Override
    @Transactional(readOnly = false)
    public void grabar(Alumno alumno) {
        dao.save(alumno);
    }

    @Override
    @Transactional
    public void eliminar(int id) {
        dao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Alumno buscar(int id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Alumno> listar() {
        return (List<Alumno>)dao.findAll();
    }
}
