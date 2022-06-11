package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoRepository {

	// Crud
	// insertar
	public void insertarDeposito(Deposito d);

	// buscar
	public Deposito buscarDeposito(String numeroCtaDestino);

	// actualizar
	public void actualizarDeposito(Deposito d);

	// eliminar
	public void eliminarDeposito(String numeroCtaDestino);

	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);

}
