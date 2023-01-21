package com.certus.demo.controllers;

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

import com.certus.demo.daos.CursoDao;
import com.certus.demo.entidades.Curso;
import com.certus.demo.service.CursoService;

@Controller
//@RequestMapping(value = "/api/cursos", method = RequestMethod.GET)
@SessionAttributes("curso")
public class CursoController {
      
      @Autowired
      private CursoService servicio;

      @RequestMapping(value = "/listar", method = RequestMethod.GET)
      public String listar(Model model) {
	    model.addAttribute("titulo", "Listado de cursos");
	    model.addAttribute("cursos", servicio.listar());
	    return "listarView";
      }
      
      @RequestMapping(value = "/", method = RequestMethod.GET)
      public String listarFull(Model model) {
	    model.addAttribute("titulo", "Listado de cursos");
	    model.addAttribute("cursos", servicio.listar());
	    return "listarView";
	  }
      
      @RequestMapping(value = "/buscar/{id}", method = RequestMethod.GET)
      public String buscar(@PathVariable int id, Model model) {
	    model.addAttribute("titulo", "Listado de cursos");
	    model.addAttribute("curso", servicio.buscar(id));
	    return "buscarView";
	  }
      
      @RequestMapping(value = "/form")
      public String crear(Map<String, Object> model) {

      Curso curso = new Curso();
              model.put("curso", curso);
              model.put("titulo", "Formulario de Curso");
              return "formView";
      }

      @RequestMapping(value = "/form/{id}")
      public String editar(@PathVariable(value = "id") Integer id, Map<String, Object> model) {

              Curso curso = null;

              if (id > 0) {
                      curso = servicio.buscar(id);
              } else {
                      return "redirect:/listar";
              }
              model.put("curso", curso);
              model.put("titulo", "Editar Curso");
              return "formView";
      }

      @RequestMapping(value = "/form", method = RequestMethod.POST)
      public String guardar(@Valid Curso curso, BindingResult result, Model model, SessionStatus status) {
              if (result.hasErrors()) {
                      model.addAttribute("titulo", "Formulario de Curso");
                      return "formView";
              }
              //System.out.println(curso);
              servicio.grabar(curso);
              status.setComplete();
              return "redirect:listar";
      }

      @RequestMapping(value = "/eliminar/{id}")
      public String eliminar(@PathVariable(value = "id") Integer id) {

              if (id > 0) {
                      servicio.eliminar(id);
              }
              return "redirect:/listar";
      }


}

