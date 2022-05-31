package com.uce.edu.demo.tarea.futbol;

import org.springframework.stereotype.Component;

@Component
public class Entrenador {
	private String nombre;
	private String apellido;
	private int edad;
	
	//Set y Get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
