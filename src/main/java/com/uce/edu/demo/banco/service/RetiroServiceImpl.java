package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.repository.IRetiroRepository;
@Service
public class RetiroServiceImpl implements IRetiroService{
	
	
	@Autowired
	private ICuentaBancariaService bancariaService;
	
	@Autowired
	private IRetiroRepository iRetiroRepository;

	@Override
	public void realizarRetiro(String numeroCta, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaOrigen=this.bancariaService.buscar(numeroCta);
		BigDecimal saldoCta=ctaOrigen.getSaldo();
		BigDecimal nuevoSaldoCta=saldoCta.subtract(monto);
		ctaOrigen.setSaldo(nuevoSaldoCta);
		this.bancariaService.actualizar(ctaOrigen);
		
		Retiro r=new Retiro();
		r.setNumeroCta(numeroCta);
		r.setSaldo(monto);
		r.setFecha(LocalDateTime.now());
		
		this.iRetiroRepository.insertarRetiro(r);
		
		
	}

	@Override
	public Retiro buscarRetiro(String numeroCta) {
		// TODO Auto-generated method stub
		return this.iRetiroRepository.buscarRetiro(numeroCta);
	}

	@Override
	public void actualizarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		this.iRetiroRepository.actualizarRetiro(r);
	}

	@Override
	public void borrarRetiro(String numeroCta) {
		// TODO Auto-generated method stub
		this.iRetiroRepository.eliminarRetiro(numeroCta);
	}

	@Override
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		return this.iRetiroRepository.consultar(cuenta, fechaInicio, fechaFin);
	}

}
