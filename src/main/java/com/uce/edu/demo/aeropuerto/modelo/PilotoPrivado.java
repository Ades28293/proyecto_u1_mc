package com.uce.edu.demo.aeropuerto.modelo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PilotoPrivado {

	private String nombre;
	private String apellido;
	
	
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
	
	
	@Override
	public String toString() {
		return "PilotoPrivado [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
}
