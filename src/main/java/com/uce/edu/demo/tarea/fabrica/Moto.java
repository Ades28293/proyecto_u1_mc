package com.uce.edu.demo.tarea.fabrica;

import org.springframework.stereotype.Component;

@Component
public class Moto {
 
	private String nombre;
	private String modelo;
	private int codigo;
	
	
	//Get y Set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	} 
	
}
