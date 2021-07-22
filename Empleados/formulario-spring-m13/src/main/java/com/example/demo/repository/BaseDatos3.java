package com.example.demo.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.bean.Empleado;

public interface BaseDatos3 extends JpaRepository<Empleado, Integer> {
	
	/*
	public void inserta(Empleado libro);		//SAVE
	public void borrar(int id);				//DELETE BY ID
	public void modifica(Empleado libro);		//SAVE
	public Empleado getEmpleado(int id);			//FIND BY ID
	public ArrayList<Empleado> getEmpleados();	//FIND ALL
	public boolean compruebaUsuario(String usuario, String password);
	*/

}
