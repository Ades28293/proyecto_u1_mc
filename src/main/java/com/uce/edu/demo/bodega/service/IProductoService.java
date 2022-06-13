package com.uce.edu.demo.bodega.service;

import com.uce.edu.demo.bodega.modelo.Producto;

public interface IProductoService {
	
	public void insertar(Producto p);

	public Producto buscar(String nombreProducto);

	public void actualizar(Producto p);

	public void eliminar(String nombreProducto);

}
