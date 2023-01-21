package com.certus.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.certus.demo.daos.CursoDao;
import com.certus.demo.entidades.Curso;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class CursoServiceImpl implements CursoService{
	
	@PersistenceContext
	private EntityManager em;

	@Transactional(readOnly = true)
	@Override
	public List<Curso> listar() {
		return em.createQuery("from Curso").getResultList();
	}
	
	
	@Override
	@Transactional(readOnly = false)
	public void grabar(Curso curso) {
		if (curso.getId() > 0) {
			em.merge(curso);
		} else {
			em.persist(curso);
		}
	}

	@Transactional(readOnly = true)
	@Override
	public Curso buscar(Integer id) {
		return em.find(Curso.class, id);
	}

	@Transactional(readOnly = false)
	@Override
	public void eliminar(Integer id) {
		
	}

}
