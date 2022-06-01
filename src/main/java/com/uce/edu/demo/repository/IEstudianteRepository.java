package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Estudiante;

public interface IEstudianteRepository {

	// CRUD
	// C:crear/insertar
	public void insertar(Estudiante e);

	// R:Leer/Buscar
	public Estudiante buscar(String apellido);

	// U: actualizar
	public void actualizar(Estudiante e);

	// D: eliminar

	public void eliminar(String cedula);

}
