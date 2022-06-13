package com.uce.edu.demo.bodega.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.repository.IInventarioRepository;

@Service
public class InventarioServiceImpl implements IInventarioService {

	@Autowired
	private IInventarioRepository iInventarioRepository;

	@Override
	public void insertarInventario(Producto p, Inventario i) {
		// TODO Auto-generated method stub
		List<Producto> crearInventario = new ArrayList<>();
		crearInventario.add(p);
		i.setInventarioPro(crearInventario);
		i.setFechaIngreso(LocalDateTime.now());
		this.iInventarioRepository.insertar(i);
	}

	@Override
	public Inventario buscarInventario(LocalDateTime fechaIngreso) {
		// TODO Auto-generated method stub
		return this.iInventarioRepository.buscar(fechaIngreso);
	}

	@Override
	public void actualizarInventario(Inventario i) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.actualizar(i);
	}

	@Override
	public void eliminarInventario(LocalDateTime fechaIngreso) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.eliminar(fechaIngreso);
	}

}
