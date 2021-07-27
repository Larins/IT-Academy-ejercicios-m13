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

import com.example.demo.bean.Empleado;
import com.example.demo.bean.Posicion;
import com.example.demo.bean.Usuario;
import com.example.demo.repository.BaseDatos3Service;

@Controller // Lo convertimos en un servlet que atiende peticiones HTTP
@RequestMapping("") // localhost:8080
public class Controlador {

	@GetMapping("/")
	public String iniciar(Model model) {
		model.addAttribute("titulo", "FORMULARIO DE ACCESO");
		model.addAttribute("info1", "Introduce los datos de acceso:");
		return "login";
	}

	Usuario usuario;

	@Autowired
	BaseDatos3Service bd;

	// HANDLER LOGIN
	@PostMapping("/")
	public String login(Usuario usuario, Model model) {
		if (bd.compruebaUsuario(usuario.getNombre(), usuario.getPassword())) {
			ArrayList<Empleado> empleados = bd.getEmpleados();
			model.addAttribute("usuario", usuario);
			this.usuario = usuario;
			model.addAttribute("empleados", empleados);
			model.addAttribute("empleado", new Empleado(0,"",Posicion.JUNIOR));
			model.addAttribute("boton", "Insertar empleado");
			model.addAttribute("action", "/insertar");
			return "consulta";
		} else
			model.addAttribute("titulo", "FORMULARIO DE ACCESO");
		return "login";
	}

	// HANDLER INSERCION
	@PostMapping("/insertar")
	public String insertar(Empleado empleado, Model model) {
		empleado.setSalario(empleado.getPosicion().getSalario());
		bd.inserta(empleado);
		ArrayList<Empleado> empleados = bd.getEmpleados();
		model.addAttribute("usuario", this.usuario);
		this.usuario = usuario;
		model.addAttribute("empleados", empleados);
		model.addAttribute("empleado", new Empleado(0,"",Posicion.JUNIOR));
		model.addAttribute("boton", "Insertar empleado");
		model.addAttribute("action", "/insertar");
		return "consulta";
	}

	// Handler borrado
	@GetMapping("/borrado/{id}")
	public String borrar(@PathVariable int id, Model model) {
		bd.borrar(id);
		ArrayList<Empleado> empleados = bd.getEmpleados();
		model.addAttribute("usuario", this.usuario);
		this.usuario = usuario;
		model.addAttribute("empleados", empleados);
		model.addAttribute("empleado", new Empleado(0,"",Posicion.JUNIOR));
		model.addAttribute("boton", "Insertar empleado");
		model.addAttribute("action", "/insertar");
		return "consulta";
	}

	// Handler modificar GET (rellenar formulario)
	@GetMapping("/modificar/{id}")
	public String modificar(@PathVariable int id, Model model) {
		Empleado empleado = bd.getEmpleado(id);
		ArrayList<Empleado> empleados = bd.getEmpleados();
		model.addAttribute("usuario", this.usuario);
		this.usuario = usuario;
		model.addAttribute("empleados", empleados);
		model.addAttribute("empleado", empleado);
		model.addAttribute("boton", "Actualizar empleado");
		model.addAttribute("action", "/modificar");
		return "consulta";
	}

	// Handler modificar POST (enviar formulario)
	@PostMapping("/modificar")
	public String modificar2(Empleado empleado, Model model) {
		empleado.setSalario(empleado.getPosicion().getSalario());
		bd.modifica(empleado);
		ArrayList<Empleado> empleados = bd.getEmpleados();
		model.addAttribute("usuario", this.usuario);
		// this.usuario = usuario;
		model.addAttribute("empleados", empleados);
		model.addAttribute("empleado", new Empleado(0,"",Posicion.JUNIOR));
		model.addAttribute("boton", "Actualizar empleado");
		model.addAttribute("action", "/insertar");
		return "consulta";
	}
}