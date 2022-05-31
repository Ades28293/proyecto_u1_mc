package com.uce.edu.demo.tarea.matriculacion;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Matricula {
	
	private LocalDateTime fechaMatricula;
	
	@Autowired
	private Estudiante estudiante;
	@Autowired
	private Materia materia;
	
	public String matricular(String nombre,String apellido,int edad,String nombreMateria,String semestre,
			String aula,LocalDateTime fechaMatricula) {
		
		this.estudiante.setNombre(nombre);
		this.estudiante.setApellido(apellido);
		this.estudiante.setEdad(edad);
		
		this.materia.setNombre(nombreMateria);
		this.materia.setSemestre(semestre);
		this.materia.setAula(aula);
		
		this.fechaMatricula=fechaMatricula;
		
		return "Matricula Realizada";
		
	}
	
	//Get y Set
	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}

}
