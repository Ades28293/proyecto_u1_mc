package com.uce.edu.demo.bodega.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.bodega.modelo.Producto;
@Repository
public class ProductoRepositoryImpl implements IProductoRepository{

	@Override
	public void insertar(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado el producto: "+p);
		
	}

	@Override
	public Producto buscar(String nombreProducto) {
		// TODO Auto-generated method stub
		System.out.println("Se busca el producto: "+nombreProducto);
		Producto pro=new Producto();
		pro.setNombreProducto(nombreProducto);
		return pro;
	}

	@Override
	public void actualizar(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el producto: "+p.getNombreProducto()+" Precio de Venta:"+p.getPrecioVenta());
		
	}

	@Override
	public void eliminar(String nombreProducto) {
		// TODO Auto-generated method stub
		
		System.out.println("Se ha eliminado el producto: "+nombreProducto);
		
	}

}
