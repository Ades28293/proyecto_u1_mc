package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;
@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository{

	@Override
	public void insertar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se inserta la trasnferencia: "+t);
		
	}

	@Override
	public Transferencia buscar(String numeroCtaOrigen) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado la transferecia: "+numeroCtaOrigen);
		Transferencia t=new Transferencia();
		t.setNumeroCuentaOrigen(numeroCtaOrigen);
		return t;
	}

	@Override
	public void actualizar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizdo la transferencia: "+t);
		
	}

	@Override
	public void eliminar(String numeroCtaOrigen) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado la transferencia: "+numeroCtaOrigen);
		
	}
	

}
