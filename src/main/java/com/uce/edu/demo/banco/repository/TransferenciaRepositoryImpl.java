package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaRetiro) {
		// TODO Auto-generated method stub
		
		//Aqui deberia estar el Sql a la base(consulta) simulacion
		List<Transferencia>listaConsultada=new ArrayList<>();
		Transferencia trans1=new Transferencia();
		trans1.setFecha(LocalDateTime.now());
		trans1.setMontoTransferir(new BigDecimal(100));
		trans1.setNumeroCuentaDestino("1234");
		trans1.setNumeroCuentaOrigen("12567");
		
		listaConsultada.add(trans1);
		
		
		return listaConsultada;
	}
	

}
