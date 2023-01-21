package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.daos.CursoDao;
import com.example.demo.entidades.Curso;

@Service
public class CursoServiceImpl implements CursoService {

	    @Autowired
	    private CursoDao dao;
	        
	    @Override
	    @Transactional(readOnly = false)
	    public void grabar(Curso curso) {
	        dao.save(curso);
	    }

	    @Override
	    @Transactional
	    public void eliminar(int id) {
	        dao.deleteById(id);
	    }

	    @Override
	    @Transactional(readOnly = true)
	    public Curso buscar(int id) {
	        return dao.findById(id).orElse(null);
	    }

	    @Override
	    @Transactional(readOnly = true)
	    public List<Curso> listar() {
	        return (List<Curso>)dao.findAll();
	    }
	}

