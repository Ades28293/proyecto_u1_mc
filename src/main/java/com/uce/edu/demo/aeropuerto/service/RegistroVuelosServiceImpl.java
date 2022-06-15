package com.uce.edu.demo.aeropuerto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.aeropuerto.modelo.PilotoGeneral;
import com.uce.edu.demo.aeropuerto.modelo.PilotoPrivado;
import com.uce.edu.demo.aeropuerto.modelo.RegistroVuelos;
import com.uce.edu.demo.aeropuerto.repository.IRegistroVuelosRepository;

@Service
public class RegistroVuelosServiceImpl implements IRegistroVuelosService{
	@Autowired
	private IRegistroVuelosRepository iRegistroVuelosRepository;
	
	@Autowired
	private PilotoGeneral pilotoGeneral;
	
	@Autowired
	private PilotoPrivado pilotoPrivado;

	@Override
	public void insertar(RegistroVuelos r) {
		// TODO Auto-generated method stub
		System.out.println("DI desde service SINGLETON "+ this.pilotoGeneral);
		System.out.println("DI desde service PROTOTYPE "+ this.pilotoPrivado);
		this.iRegistroVuelosRepository.insertar(r);
	}

	@Override
	public RegistroVuelos buscar(String numRegistroVuelo) {
		// TODO Auto-generated method stub
		return this.iRegistroVuelosRepository.buscar(numRegistroVuelo);
	}

	@Override
	public void actualizar(RegistroVuelos r) {
		// TODO Auto-generated method stub
		this.iRegistroVuelosRepository.actualizar(r);
		
	}

	@Override
	public void eliminar(String numRegistroVuelo) {
		// TODO Auto-generated method stub
		this.iRegistroVuelosRepository.eliminar(numRegistroVuelo);
		
	}

}
