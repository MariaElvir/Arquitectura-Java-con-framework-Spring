package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.daos.ConductorDao;

@Controller
public class ConductorController {
	
	@Autowired
	private ConductorDao dao;

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de Conductor");
		model.addAttribute("Conductor", dao.findAll());
		return "listarView";
	}

}