package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {

	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto);

	public Transferencia buscarTransferencia(String numeroCtaOrigen);

	public void actualizarTransferencia(Transferencia t);

	public void eliminarTransferencia(String numeroCtaOrigen);
	
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);

}
