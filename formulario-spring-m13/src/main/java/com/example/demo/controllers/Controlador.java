package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.bean.Libro;
import com.example.demo.bean.Usuario;
import com.example.demo.repository.BaseDatos;
import com.example.demo.repository.BaseDatos2;
import com.example.demo.repository.BaseDatos3Service;

@Controller //Lo convertimos en un servlet que atiende peticiones HTTP
@RequestMapping("") //localhost:8080
public class Controlador {

	//BaseDatos bd = new BaseDatos();
	//BaseDatos2 bd = new BaseDatos2();
	@Autowired
	BaseDatos3Service bd;

	//Proyecto PPT propone login hardcodeado
	//Este sería mi usuario hardcodeado si usara ese método
	//En su lugar he usado el método compruebaUsuario --> ver Handler login (vía getters)
	
	Usuario usuario;
	
	/*
	String loginUser = "Lara";
	String loginPassword = "1234";
	*/

	@GetMapping("/")
	public String iniciar(Model model) {
		model.addAttribute("titulo","FORMULARIO DE ACCESO");
		model.addAttribute("info1","Introduce los datos de acceso:");
		
		//Con el usuario hardcodeado podíamos mostrar los siguientes datos para facilitar el login
		//Una vez parametrizado con compruebaUsuario, queda deprecado
		//model.addAttribute("info2","Usuario: " + loginUser);
		//model.addAttribute("info3","Password: " + loginPassword);
		return "login";
	}

	@PostMapping("/")
	//Handler login (vía getters)
	public String login(Usuario usuario, Model model) {
		if (bd.compruebaUsuario(usuario.getNombre(), usuario.getPassword())) {
		//Cuando el login estaba hardcodeado este código iba dentro del if
		//usuario.getNombre().equals(loginUser) && usuario.getPassword().equals(loginPassword)
			ArrayList<Libro> libros = bd.getLibros();
			model.addAttribute("usuario",usuario);
			this.usuario = usuario;
			model.addAttribute("libros",libros);
			//model.addAttribute("boton","Insertar libro");
			//model.addAttribute("action","/insertar");
			return "consulta";
		} else
			return "login";
	}

	//Handler inserción
	@PostMapping("/insertar")
	public String insertar(Libro libro, Model model) {
		bd.inserta(libro);
		ArrayList<Libro> libros = bd.getLibros();
		model.addAttribute("usuario",this.usuario);
		model.addAttribute("libros",libros);
		model.addAttribute("boton","Insertar libro");
		model.addAttribute("action","/insertar");
		return "consulta";
	}
	
	//Handler borrado
	@GetMapping("/borrado/{id}")
	public String borrar(@PathVariable int id, Model model) {
		bd.borrar(id);
		ArrayList<Libro> libros = bd.getLibros();
		model.addAttribute("libros", libros);
		model.addAttribute("usuario", this.usuario);
		model.addAttribute("boton","Insertar libro");
		model.addAttribute("action","/insertar");
		return "consulta";
	}

	//Handler modificar GET (rellenar formulario)
	@GetMapping("/modificar/{id}")
	public String modificar(@PathVariable int id, Model model) {
		Libro libro = bd.getLibro(id);
		ArrayList<Libro> libros = bd.getLibros();
		model.addAttribute("libros",libros);
		model.addAttribute("libro",libro);
		model.addAttribute("usuario",this.usuario);
		model.addAttribute("boton","Actualizar libro");
		model.addAttribute("action","/modificar");
		return "consulta";
	}

	//Handler modificar POST (enviar formulario)
	@PostMapping("/modificar")
	public String modificar2(Libro libro, Model model) {
		bd.modifica(libro);
		ArrayList<Libro> libros = bd.getLibros();
		model.addAttribute("usuario",this.usuario);
		model.addAttribute("libros",libros);
		model.addAttribute("libro",null);
		model.addAttribute("boton","Insertar libro");
		model.addAttribute("action","/insertar");
		return "consulta";

	}

	//Método handler vía @RequestParam
	//Queda sustituido por el Handler login (vía getters)
	
		/*public String login(Model model,
							@RequestParam String nombre,
							@RequestParam String password) {
			if (nombre.equals("edu") && password.equals("edu"))
				return "consulta";
			else
				return "login";*/
		
		

}