package com.uce.edu.demo.banco.repository;


import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;
@Repository
public class RetiroRepositoryImpl implements IRetiroRepository {

	@Override
	public void insertarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el retiro: " + r);
	}

	@Override
	public Retiro buscarRetiro(String numeroCta) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado el retiro: "+numeroCta);
		Retiro r=new Retiro();
		r.setNumeroCta(numeroCta);	
		return r;
	}

	@Override
	public void actualizarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el retiro "+r);
		
	}

	@Override
	public void eliminarRetiro(String numeroCta) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el retiro: "+numeroCta);
		
	}

}
