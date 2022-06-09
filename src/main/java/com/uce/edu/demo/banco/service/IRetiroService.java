package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroService {

	public void realizarRetiro(String numeroCta, BigDecimal monto);

	public Retiro buscarRetiro(String numeroCta);

	public void actualizarRetiro(Retiro r);

	public void borrarRetiro(String numeroCta);

}
