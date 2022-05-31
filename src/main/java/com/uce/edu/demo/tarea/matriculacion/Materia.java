package com.uce.edu.demo.tarea.matriculacion;

import org.springframework.stereotype.Component;

@Component
public class Materia {
	private String nombre;
	private String semestre;
	private String aula;
	
	//Get y Set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}

}
