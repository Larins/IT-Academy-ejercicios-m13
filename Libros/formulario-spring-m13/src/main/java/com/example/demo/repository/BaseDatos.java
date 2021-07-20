/*package com.example.demo.repository;

import java.util.ArrayList;
import java.util.Iterator;

import com.example.demo.bean.Libro;

public class BaseDatos {

	ArrayList<Libro> libros = new ArrayList<Libro>();

	public BaseDatos() {
		libros.add(new Libro(1,"HARRY POTTER Y LA PIEDRA FILOSOFAL", "J.K.ROWLING", "SALAMANDRA", "01/01/2001 00:00:00", "JUVENIL"));
		libros.add(new Libro(2,"HARRY POTTER Y LA CÁMARA SECRETA", "J.K.ROWLING", "SALAMANDRA", "01/01/2002 00:00:00", "JUVENIL"));
		libros.add(new Libro(3,"HARRY POTTER Y EL PRISIONERO DE AZKABAN", "J.K.ROWLING", "SALAMANDRA", "01/01/2003 00:00:00", "JUVENIL"));
		libros.add(new Libro(4,"HARRY POTTER Y EL CÁLIZ DE FUEGO", "J.K.ROWLING", "SALAMANDRA", "01/01/2004 00:00:00", "JUVENIL"));
		libros.add(new Libro(5,"HARRY POTTER Y LA ORDEN DEL FÉNIX", "J.K.ROWLING", "SALAMANDRA", "01/01/2005 00:00:00", "JUVENIL"));
		libros.add(new Libro(6,"HARRY POTTER Y EL MISTERIO DEL PRÍNCIPE", "J.K.ROWLING", "SALAMANDRA", "01/01/2006 00:00:00", "JUVENIL"));
		libros.add(new Libro(7,"HARRY POTTER Y LAS RELIQUIAS DE LA MUERTE", "J.K.ROWLING", "SALAMANDRA", "01/01/2007 00:00:00", "JUVENIL"));
		libros.add(new Libro(8,"EL SILMARILION", "J.R.R.TOLKIEN", "MINOTAURO", "01/01/1998 00:00:00", "FANTASÍA"));
		libros.add(new Libro(9,"EL HOBBIT", "J.R.R.TOLKIEN", "MINOTAURO", "01/01/1999 00:00:00", "FANTASÍA"));
		libros.add(new Libro(10,"EL SEÑOR DE LOS ANILLOS 01 LA COMUNIDAD DEL ANILLO", "J.R.R.TOLKIEN", "MINOTAURO", "01/01/1977 00:00:00", "FANTASÍA"));
		libros.add(new Libro(11,"EL SEÑOR DE LOS ANILLOS 02 LAS DOS TORRES", "J.R.R.TOLKIEN", "MINOTAURO", "01/01/1978 00:00:00", "FANTASÍA"));
		libros.add(new Libro(12,"EL SEÑOR DE LOS ANILLOS 03 EL RETORNO DEL REY", "J.R.R.TOLKIEN", "MINOTAURO", "01/01/1979 00:00:00", "FANTASÍA"));

	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

	public void inserta(Libro libro) {
		libros.add(libro);
	}

	public void borrar(int id) {
		Iterator<Libro> it = libros.iterator();
		while(it.hasNext()) {
			Libro li = it.next();
			if (li.getId()==id) {
				it.remove();
				break;
			}
		}
	}

	public void modifica(Libro libro) {
		Iterator<Libro> it = libros.iterator();
		while(it.hasNext()) {
			Libro li = it.next();
			if (li.getId()==libro.getId()) {
				li.setTitulo(libro.getTitulo());
				li.setAutor(libro.getAutor());
				li.setEditorial(libro.getEditorial());
				li.setFecha(libro.getFecha());
				li.setTematica(libro.getTematica());
				break;
			}
		}		
	}

	public Libro getLibro(int id) {
        // TODO Auto-generated method stub
        Libro libro = null;
        for (Libro li: libros) {
            if (li.getId()== id) {
                libro=li;
                break;
            }
        }
        return libro;
	}
}*/