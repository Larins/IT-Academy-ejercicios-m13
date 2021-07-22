package com.example.demo.bean;

import javax.persistence.*;


@Entity
@Table(name="libros")

public class Libro {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int id;

	@Column(name="titulo", nullable=false, length=30)
	private String titulo;
	private String autor;
	private String editorial;
	private String fecha;
	//private Tematica tematica; //Para usar combobox comentamos esta declaración y usamos la siguiente:
	@Column(name="TEMATICA")
	@Enumerated(EnumType.STRING)
	PRIVATE Tematica tematica;

	public Libro(int id, String titulo, String autor, String editorial, String fecha, Tematica tematica) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.fecha = fecha;
		this.tematica = tematica;

	}
	
	public Libro() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Tematica getTematica() {
		return tematica;
	}

	public void setTematica(Tematica tematica) {
		this.tematica = tematica;
	}
	
}