package com.example.demo.bean;

public enum Posicion { //Sustituye a TEMATICA
	
	/*BOSS("BOSS"), MANAGER("MANAGER"), SENIOR("SENIOR"), JUNIOR("JUNIOR");*/
	BOSS("BOSS", 5000), MANAGER("MANAGER", 3500), SENIOR("SENIOR", 2500), JUNIOR("JUNIOR", 1000);
	
	private String puesto;
	private int salario;

	private Posicion(String puesto, int salario) {
		this.puesto = puesto;
		this.salario = salario;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	
}
