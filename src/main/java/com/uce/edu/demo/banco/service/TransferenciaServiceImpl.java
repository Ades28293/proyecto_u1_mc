package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService {
	// como la logica de CuentaBancariaService no hace nada
	// si puedo inyectar el CuentaBancariaRepository
	@Autowired
	private ICuentaBancariaService bancariaService;
	@Autowired
	private ITransferenciaRepository transferenciaRepo;
	
	
	

	@Override
	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria cOrigen = this.bancariaService.buscar(ctaOrigen);
		BigDecimal saldoOrigen = cOrigen.getSaldo();
		BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(monto);
		cOrigen.setSaldo(nuevoSaldoOrigen);
		this.bancariaService.actualizar(cOrigen);

		CuentaBancaria cDestino = this.bancariaService.buscar(ctaDestino);
		BigDecimal saldoDestino = cDestino.getSaldo();
		BigDecimal nuevoSaldoDestino = saldoDestino.add(saldoDestino);
		cOrigen.setSaldo(nuevoSaldoDestino);
		this.bancariaService.actualizar(cDestino);

		Transferencia t = new Transferencia();
		t.setNumeroCuentaOrigen(ctaOrigen);
		t.setNumeroCuentaDestino(ctaOrigen);
		t.setMontoTransferir(monto);
		t.setFecha(LocalDateTime.now());

		this.transferenciaRepo.insertar(t);

	}

	@Override
	public Transferencia buscarTransferencia(String numeroCtaOrigen) {
		// TODO Auto-generated method stub
		return this.transferenciaRepo.buscar(numeroCtaOrigen);
	}

	@Override
	public void actualizarTransferencia(Transferencia t) {
		// TODO Auto-generated method stub
		this.transferenciaRepo.actualizar(t);
		
	}

	@Override
	public void eliminarTransferencia(String numeroCtaOrigen) {
		// TODO Auto-generated method stub
		this.transferenciaRepo.eliminar(numeroCtaOrigen);
	}

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		return this.transferenciaRepo.consultar(cuenta, fechaInicio, fechaFin);
	}

}
