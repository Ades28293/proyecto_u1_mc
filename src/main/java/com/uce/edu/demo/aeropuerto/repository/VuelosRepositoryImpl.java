package com.uce.edu.demo.aeropuerto.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.aeropuerto.modelo.Vuelos;
@Repository
public class VuelosRepositoryImpl implements IVuelosRepository {

	@Override
	public void insertar(Vuelos v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base el vuelo:" + v);
	}

	@Override
	public Vuelos buscar(String numVuelo) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base el vuelo:" + numVuelo);
		Vuelos v = new Vuelos();
		v.setNumVuelo(numVuelo);

		return v;
	}

	@Override
	public void actualizar(Vuelos v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base el vuelo:"+ v);
	}

	@Override
	public void eliminar(String numVuelo) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base el vuelo:"+ numVuelo);

	}

}
