package com.example.demo.service;

import java.util.ArrayList;
import com.example.demo.bean.Libro;

//En comentarios: la función equivalente en JPA
public interface IBaseDatos3 {
	public void inserta(Libro libro);		//SAVE
	public void borrar(int id);				//DELETE BY ID
	public void modifica(Libro libro);		//SAVE
	public Libro getLibro(int id);			//FIND BY ID
	public ArrayList<Libro> getLibros();	//FIND ALL
	public boolean compruebaUsuario(String usuario, String password);

}