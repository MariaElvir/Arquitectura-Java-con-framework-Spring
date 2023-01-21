package com.example.demo.controllers;

import java.util.Map;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.example.demo.entidades.Alumno;
import com.example.demo.service.AlumnoService;

@Controller
//@RequestMapping(value = "/api/cursos", method = RequestMethod.GET)
//@SessionAttributes("alumno")
public class AlumnoController {
	
	@Autowired
	private AlumnoService servicio;

	@RequestMapping(value = "/listarAlumos", method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de alumnos");
		model.addAttribute("alumnos", servicio.listar());
		return "AlumnosListarView";
	}

	@RequestMapping(value = "/buscarAlumnos/{id}", method = RequestMethod.GET)
	public String buscar(@PathVariable int id, Model model) {
		model.addAttribute("titulo", "Listado de alumnos");
		model.addAttribute("alumnos", servicio.buscar(id));
		return "AlumnosBuscarView";
	}

	@RequestMapping(value = "/formAlumnos")
	public String crear(Map<String, Object> model) {

		Alumno alumno = new Alumno();
		model.put("alumnos", alumno);
		model.put("titulo", "Formulario de alumnos");
		return "AlumnosFormView";
	}

	@RequestMapping(value = "/formAlumnos/{id}")
	public String editar(@PathVariable(value = "id") Integer id, Map<String, Object> model) {

		Alumno alumno = null;

		if (id > 0) {
			alumno = servicio.buscar(id);
		} else {
			return "redirect:/listar";
		}
		model.put("alumnos", alumno);
		model.put("titulo", "Editar alumno");
		return "AlumnosFormView";
	}

	@RequestMapping(value = "/formAlumnos", method = RequestMethod.POST)
	public String guardar(@Valid Alumno alumno, BindingResult result, Model model, SessionStatus status) {
		if (result.hasErrors()) {
			model.addAttribute("titulo", "Formulario de alumno");
			return "AlumnosFormView";
		}
		//System.out.println(alumno);
		servicio.grabar(alumno);
		status.setComplete();
		return "redirect:listar";
	}

	@RequestMapping(value = "/eliminarAlumnos/{id}")
	public String eliminar(@PathVariable(value = "id") Integer id) {
		if (id > 0) {
			servicio.eliminar(id);
		}
		return "redirect:/listar";
	}


}