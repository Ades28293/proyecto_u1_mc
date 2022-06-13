package com.uce.edu.demo.bodega.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.bodega.modelo.Inventario;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository {

	@Override
	public void insertar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado inventario: " + i);

	}

	@Override
	public Inventario buscar(LocalDateTime fechaIngreso) {
		// TODO Auto-generated method stub
		System.out.println("Se busca el producto: " + fechaIngreso);
		Inventario inv = new Inventario();
		inv.setFechaIngreso(fechaIngreso);

		return inv;
	}

	@Override
	public void actualizar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el inventario los productos : "+i);

	}

	@Override
	public void eliminar(LocalDateTime fechaIngreso) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado por la fecha : " + fechaIngreso);

	}

}
