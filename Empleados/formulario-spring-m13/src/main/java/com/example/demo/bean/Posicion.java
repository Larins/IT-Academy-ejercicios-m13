package com.example.demo.bean;

public enum Posicion { //Sustituye a TEMATICA
	
	BOSS("BOSS"), MANAGER("MANAGER"), SENIOR("SENIOR"), JUNIOR("JUNIOR");
	
	private String puesto;

	private Posicion(String pos) {
		this.puesto = pos;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String nombre) {
		this.puesto = puesto;
	}
}
