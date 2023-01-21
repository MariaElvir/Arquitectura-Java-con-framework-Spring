package com.example.demo.daos;

import java.util.List;

import com.example.demo.entidades.Conductor;

public interface ConductorDao {
	public List<Conductor> findAll();
}