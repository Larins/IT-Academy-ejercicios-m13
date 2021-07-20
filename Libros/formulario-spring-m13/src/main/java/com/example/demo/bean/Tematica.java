package com.example.demo.bean;

public enum Tematica {
	
	Entretenimiento("ENTRETENIMIENTO"), Romantica("ROMANTICA"), Comedia("COMEDIA"), Ocio("OCIO"), Ficcion("FICCION"), Social("SOCIAL"), Infantil("INFANTIL"), Informatica("INFORMATICA"), Astronomia("ASTRONOMIA");

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String nombre;

	private Tematica(String tema) {
		this.nombre = tema;
	}

}
