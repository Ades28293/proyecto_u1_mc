package com.uce.edu.demo.bodega.service;

import java.time.LocalDateTime;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;

public interface IInventarioService {

	
	public void insertarInventario(Producto p,Inventario i);

	public Inventario buscarInventario(LocalDateTime fechaIngreso);

	public void actualizarInventario(Inventario i);

	public void eliminarInventario(LocalDateTime fechaIngreso);
}
