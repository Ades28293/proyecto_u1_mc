package com.uce.edu.demo.consultorio;

import org.springframework.stereotype.Component;

//Les voy a poner una metadata(anotaciones)
@Component
public class Doctor {
	private String nombre;
	private String apellido;
	private int edad;
	private String Ciudad;
	
	

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
	public String getCiudad() {
		return Ciudad;
	}
	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
