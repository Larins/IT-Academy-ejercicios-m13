package com.example.demo.bean;

public enum Tematica {
	
	ENTRETENIMIENTO("ENTRETENIMIENTO"), ROMANTICA("ROMANTICA"), COMEDIA("COMEDIA"), OCIO("OCIO"), FICCION("FICCION"), SOCIAL("SOCIAL"), INFANTIL("INFANTIL"), INFORMATICA("INFORMATICA"), ASTRONOMIA("ASTRONOMIA");

	private String nombre;

	private Tematica(String tema) {
		this.nombre = tema;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
