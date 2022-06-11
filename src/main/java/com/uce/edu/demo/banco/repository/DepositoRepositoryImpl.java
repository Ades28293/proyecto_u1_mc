package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		
		List<Deposito>listaDeposito=new ArrayList<>();
		Deposito depo1=new Deposito();
		depo1.setFecha(LocalDateTime.of(2021, 2, 10, 8, 50, 2));
		depo1.setMonto(new BigDecimal(20));
		depo1.setNumeroCuentaDestino("2345");
		
		listaDeposito.add(depo1);
		
		
		Deposito depo2=new Deposito();
		depo2.setFecha(LocalDateTime.of(2021, 3, 15, 9, 53, 2));
		depo2.setMonto(new BigDecimal(50));
		depo2.setNumeroCuentaDestino("1234");
		
		listaDeposito.add(depo2);
		
		
		Deposito depo3=new Deposito();
		depo3.setFecha(LocalDateTime.of(2021, 5, 20, 7, 45, 2));
		depo3.setMonto(new BigDecimal(50));
		depo3.setNumeroCuentaDestino("3456");
		
		listaDeposito.add(depo3);
		
		
		Deposito depo4=new Deposito();
		depo4.setFecha(LocalDateTime.of(2021, 8, 12, 8, 35, 2));
		depo4.setMonto(new BigDecimal(50));
		depo4.setNumeroCuentaDestino("789");
		
		listaDeposito.add(depo4);
		
		
		return listaDeposito;
	}

}
