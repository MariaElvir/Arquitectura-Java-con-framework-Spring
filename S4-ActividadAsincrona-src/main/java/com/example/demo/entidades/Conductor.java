package com.example.demo.entidades;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.daos.AfiliacionDao;

public class Conductor {
	
	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String direccion;
	private int telefono;
	private String email;
	private int dni;
	
	@Autowired
	private AfiliacionDao dao;
	
	public Conductor(AfiliacionDao dao) {
		this.dao = dao;
	}

	public Conductor() {
	}
	
	public void registroC() {
		dao.registro();
	}
	public void bajaC() {
		dao.Baja();
	}
	
	public void setdao(AfiliacionDao dao) {
		this.dao=dao;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

}
