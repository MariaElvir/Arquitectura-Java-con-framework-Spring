package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.daos.AfiliacionDaoImpl;
import com.example.demo.entidades.Conductor;
/*"Julio","Guzman","Lizama","Av. Lima 123",986456123,"Julio@gmail.com",75623491*/
@SpringBootApplication
public class S4ActividadAsincronaApplication {

	
	public static void main(String[] args) {
		Conductor conductor= new Conductor(new AfiliacionDaoImpl());
		Conductor conductor2= new Conductor(new AfiliacionDaoImpl());
		
		conductor.registroC();
		conductor2.bajaC();
	}

}
