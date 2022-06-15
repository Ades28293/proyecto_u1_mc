package com.uce.edu.demo.aeropuerto.repository;

import com.uce.edu.demo.aeropuerto.modelo.RegistroVuelos;

public interface IRegistroVuelosRepository {

	public void insertar(RegistroVuelos r);

	// Leer
	public RegistroVuelos buscar(String numRegistroVuelo);

	// Actualizar
	public void actualizar(RegistroVuelos r);

	// Eliminar
	public void eliminar(String numRegistroVuelo);
}
