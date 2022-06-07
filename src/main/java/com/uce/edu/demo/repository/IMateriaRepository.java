package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;

public interface IMateriaRepository {

	public void insertar(Materia m);

	// Leer
	public Materia buscar(String nombreMa);

	// Actualizar
	public void actualizar(Materia m);

	// Eliminar
	public void eliminar(String nombreMa);
}
