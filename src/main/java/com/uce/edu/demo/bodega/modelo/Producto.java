package com.uce.edu.demo.bodega.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Producto implements Comparable<LocalDateTime>{
	private String nombreProducto;
	private BigDecimal precioVenta;
	private BigDecimal precioCompra;
	private int cantidadProductos;
	private LocalDateTime fechaIngreso;

	// Get y Set
	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}

	public BigDecimal getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(BigDecimal precioCompra) {
		this.precioCompra = precioCompra;
	}

	public int getCantidadProductos() {
		return cantidadProductos;
	}

	public void setCantidadProductos(int cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
	}

	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	// Metodo toString
	@Override
	public String toString() {
		return "\nProducto [nombreProducto=" + nombreProducto + ", precioVenta=" + precioVenta + ", cantidadProductos="
				+ cantidadProductos + ", fechaIngreso=" + fechaIngreso + "]";
	}

	@Override
	public int compareTo(LocalDateTime o) {
		// TODO Auto-generated method stub
		return this.fechaIngreso.compareTo(o);

	}

}
