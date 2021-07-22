package com.example.demo.service;

import java.util.ArrayList;
import com.example.demo.bean.Empleado;

//En comentarios: la función equivalente en JPA
public interface IBaseDatos3 {
	public void inserta(Empleado libro);		//SAVE
	public void borrar(int id);				//DELETE BY ID
	public void modifica(Empleado libro);		//SAVE
	public Empleado getEmpleado(int id);			//FIND BY ID
	public ArrayList<Empleado> getEmpleados();	//FIND ALL
	public boolean compruebaUsuario(String usuario, String password);

}