package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Retiro {
	
	private String numeroCta;
	private BigDecimal saldo;
	private LocalDateTime fecha;
	
	//Get y Set
	
	public String getNumeroCta() {
		return numeroCta;
	}
	public void setNumeroCta(String numeroCta) {
		this.numeroCta = numeroCta;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
	
	@Override
	public String toString() {
		return "Retiro [numeroCta=" + numeroCta + ", saldo=" + saldo + ", fecha=" + fecha + "]";
	}
	
	
	

}
