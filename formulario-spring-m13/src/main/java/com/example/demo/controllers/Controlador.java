package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.bean.Libro;
import com.example.demo.bean.Usuario;
import com.example.demo.repository.BaseDatos;

@Controller //Lo convertimos en un servlet que atiende peticiones HTTP
@RequestMapping("")
public class Controlador {

	BaseDatos bd = new BaseDatos();

	@GetMapping("/")
	public String iniciar(Model model) {
		model.addAttribute("titulo","FORMULARIO DE ACCESO");
		return "login";
	}

	@PostMapping("/")
	//Método handler vía getters
	public String login(Usuario usuario, Model model) {
		if (usuario.getNombre().equals("edu") && usuario.getPassword().equals("edu")) {
			ArrayList<Libro> libros = bd.getLibros();
			model.addAttribute("usuario",usuario);
			model.addAttribute("libros",libros);
			return "consulta";
		} else
			return "login";
	}
	
	//Método handler vía @RequestParam
	
		/*public String login(Model model,
							@RequestParam String nombre,
							@RequestParam String password) {
			if (nombre.equals("edu") && password.equals("edu"))
				return "consulta";
			else
				return "login";*/
		
		

}