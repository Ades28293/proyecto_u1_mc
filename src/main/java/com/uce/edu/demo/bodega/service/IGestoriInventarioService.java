package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;

public interface IGestoriInventarioService {

	public void insertarPro(Producto pro, Inventario inv);
	
	public void inventarioCrear(Producto pro, Inventario inv);

	public void consultar(Inventario inv, LocalDateTime fechaIngreso);
	
	public BigDecimal precio(Producto p);

}
