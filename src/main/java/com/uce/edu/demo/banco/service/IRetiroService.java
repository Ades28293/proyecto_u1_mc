package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroService {

	public void realizarRetiro(String numeroCta, BigDecimal monto);

	public Retiro buscarRetiro(String numeroCta);

	public void actualizarRetiro(Retiro r);

	public void borrarRetiro(String numeroCta);

	
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);
}
