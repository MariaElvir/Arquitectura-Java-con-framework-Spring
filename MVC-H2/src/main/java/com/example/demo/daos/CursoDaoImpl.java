package com.example.demo.daos;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.entidades.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class CursoDaoImpl implements CursoDao {

	@PersistenceContext
	private EntityManager em;

	@Transactional(readOnly = true)
	@Override
	public List<Curso> findAll() {
		return em.createQuery("from Curso").getResultList();
	}

	@Transactional(readOnly = false)
	@Override
	public void save(Curso curso) {
		if (curso.getId() > 0) {
			em.merge(curso);
		} else {
			em.persist(curso);
		}
	}

	@Transactional(readOnly = true)
	@Override
	public Curso findOne(Integer id) {
		return em.find(Curso.class, id);
	}

	@Transactional(readOnly = false)
	@Override
	public void delete(Integer id) {
		em.remove(findOne(id));
	}
}