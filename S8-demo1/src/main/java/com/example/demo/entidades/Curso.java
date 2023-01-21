package com.example.demo.entidades;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name = "cursos")
	public class Curso {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@NotNull
		private int id;
		@Column
		@NotNull
		@Size(min=2, max=30)
		private String nombre;
		@Column
		@Min(0)
	    @Max(5)
		private int creditos;

		public Curso() {
		}

		public Curso(int id, String nombre, int creditos) {
			this.id = id;
			this.nombre = nombre;
			this.creditos = creditos;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getCreditos() {
			return creditos;
		}

		public void setCreditos(int creditos) {
			this.creditos = creditos;
		}

		@Override
		public String toString() {
			return "Curso{" + "id=" + id + ", nombre='" + nombre + '\'' + ", creditos=" + creditos + '}';
		}
	}


