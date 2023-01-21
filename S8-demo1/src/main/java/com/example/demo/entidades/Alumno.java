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
	@Table(name = "alumno")
	public class Alumno {
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
	    @Max(20)		
		private int nota;
		
		public Alumno() {
		}

		public Alumno(int id, String nombre, int nota) {
			this.id = id;
			this.nombre = nombre;
			this.nota = nota;
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
		public int getNota() {
			return nota;
		}
		public void setNota(int nota) {
			this.nota = nota;
		}

		@Override
		public String toString() {
			return "Alumno [id=" + id + ", nombre=" + nombre + ", nota=" + nota + "]";
		}
	
}
