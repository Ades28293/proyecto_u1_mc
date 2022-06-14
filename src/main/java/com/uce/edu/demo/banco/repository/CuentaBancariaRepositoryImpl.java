package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository{

	@Override
	public void actualizar(CuentaBancaria c) {
		//Aqui hay que construir los SQLs
		System.out.println("Cuenta bancaria actualizda a:" +c);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		System.out.println("Se busca la cuenta bancaria: "+numero);
		CuentaBancaria cta=new CuentaBancaria();
		cta.setNumero(numero);
		cta.setSaldo(new BigDecimal(100));
		//cta.setTipo("A");
		//cta.setTipo("C");
		cta.setTipo("F");
		return cta;
	}

	@Override
	public void insertar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado la cuenta: "+c);
		
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado la cuenta: "+numero);
		
	}

}
