package com.uce.edu.demo.aeropuerto.service;

import com.uce.edu.demo.aeropuerto.modelo.Vuelos;

public interface IVuelosService {
	
	public void insertar(Vuelos v);

	// R:Leer/Buscar
	public Vuelos buscar(String numVuelo);

	// U: actualizar
	public void actualizar(Vuelos v);

	// D: eliminar

	public void eliminar(String numVuelo);
}
