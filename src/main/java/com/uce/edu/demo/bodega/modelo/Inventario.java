package com.uce.edu.demo.bodega.modelo;

import java.time.LocalDateTime;
import java.util.List;

public class Inventario {

	private List<Producto> inventarioPro;
	private LocalDateTime fechaIngreso;

	// Get y Set

	public List<Producto> getInventarioPro() {
		return inventarioPro;
	}

	public void setInventarioPro(List<Producto> inventarioPro) {
		this.inventarioPro = inventarioPro;
	}

	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	// metodo ToString

	@Override
	public String toString() {
		return "Inventario [inventarioPro=" + inventarioPro + "]";
	}

}
