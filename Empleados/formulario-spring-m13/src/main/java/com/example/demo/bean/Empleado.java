package com.example.demo.bean;

import javax.persistence.*;


@Entity
@Table(name="empleados")

public class Empleado { //Sustituye a LIBRO

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int id;

	@Column(name="nombre", nullable=false, length=30)
	private String nombre;
	private int salario;

	//Para usar combobox usamos la siguiente declaracion:
	@Column(name="POSICION")
	@Enumerated(EnumType.STRING)
	private Posicion posicion;

	public Empleado(int id, String nombre, Posicion posicion) {
		this.id = id;
		this.nombre = nombre;
		this.posicion = posicion;	
	}
	
	public Empleado() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
}