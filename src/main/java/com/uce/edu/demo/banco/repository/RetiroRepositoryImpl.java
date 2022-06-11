package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
		System.out.println("Se ha buscado el retiro: " + numeroCta);
		Retiro r = new Retiro();
		r.setNumeroCta(numeroCta);
		return r;
	}

	@Override
	public void actualizarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el retiro " + r);

	}

	@Override
	public void eliminarRetiro(String numeroCta) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el retiro: " + numeroCta);

	}

	@Override
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {

		List<Retiro> listaRetiro = new ArrayList<>();
		Retiro reti1 = new Retiro();
		reti1.setFecha(LocalDateTime.of(2022, 12, 20, 13, 34, 10));
		reti1.setSaldo(new BigDecimal(25));
		reti1.setNumeroCta("1239");

		listaRetiro.add(reti1);

		return listaRetiro;
	}

}
