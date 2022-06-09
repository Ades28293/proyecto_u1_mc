package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository {

	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el deposito: " + d);
	}

	@Override
	public Deposito buscarDeposito(String numeroCtaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado el deposito: "+numeroCtaDestino);
		Deposito d=new Deposito();
		d.setNumeroCuentaDestino(numeroCtaDestino);
		return d;
	}

	@Override
	public void actualizarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el deposito "+d);
		
	}

	@Override
	public void eliminarDeposito(String numeroCtaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el deposito: "+numeroCtaDestino);
		
	}

}
