package com.uce.edu.demo.aeropuerto.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.aeropuerto.modelo.RegistroVuelos;
@Repository
public class RegistroVuelosRepositoryImpl implements IRegistroVuelosRepository{

	@Override
	public void insertar(RegistroVuelos r) {
		// TODO Auto-generated method stub
		System.out.println("se ha insertado el registro del vuelo: " + r);
	}

	@Override
	public RegistroVuelos buscar(String numRegistroVuelo) {
		// TODO Auto-generated method stub
		System.out.println("se ha buscado el registro del vuelo "+numRegistroVuelo);
		RegistroVuelos rVuelo= new RegistroVuelos();
		rVuelo.setNumVuelo(numRegistroVuelo);
		
		return rVuelo;
	}

	@Override
	public void actualizar(RegistroVuelos r) {
		// TODO Auto-generated method stub
		System.out.println("se ha actualizado el registro del vuelo: " + r);
	}

	@Override
	public void eliminar(String numRegistroVuelo) {
		// TODO Auto-generated method stub
		System.out.println("se ha eliminado el registro del vuelo: " + numRegistroVuelo);
	}

}
