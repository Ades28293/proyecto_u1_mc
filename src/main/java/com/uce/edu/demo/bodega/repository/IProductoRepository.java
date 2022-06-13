package com.uce.edu.demo.bodega.repository;

import com.uce.edu.demo.bodega.modelo.Producto;

public interface IProductoRepository {
	
	public void insertar(Producto p);

	public Producto buscar(String nombreProducto);

	public void actualizar(Producto p);

	public void eliminar(String nombreProducto);

}