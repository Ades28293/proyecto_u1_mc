package com.uce.edu.demo.aeropuerto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.aeropuerto.modelo.Vuelos;
import com.uce.edu.demo.aeropuerto.repository.IVuelosRepository;
@Service
public class VuelosServiceImpl implements IVuelosService{
	
	@Autowired
	private IVuelosRepository iVuelosRepository;

	@Override
	public void insertar(Vuelos v) {
		// TODO Auto-generated method stub
		this.iVuelosRepository.insertar(v);
	}

	@Override
	public Vuelos buscar(String numVuelo) {
		// TODO Auto-generated method stub
		return this.iVuelosRepository.buscar(numVuelo);
	}

	@Override
	public void actualizar(Vuelos v) {
		// TODO Auto-generated method stub
		this.iVuelosRepository.actualizar(v);
		
	}

	@Override
	public void eliminar(String numVuelo) {
		// TODO Auto-generated method stub
		this.iVuelosRepository.eliminar(numVuelo);
		
	}

}
