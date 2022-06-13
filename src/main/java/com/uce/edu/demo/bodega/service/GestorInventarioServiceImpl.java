package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.repository.IInventarioRepository;
import com.uce.edu.demo.bodega.repository.IProductoRepository;

@Service
public class GestorInventarioServiceImpl implements IGestoriInventarioService {

	@Autowired
	private IInventarioService iInventarioService;

	@Autowired
	private IProductoService iProductoService;

	@Autowired
	private IInventarioRepository iInventarioRepository;

	@Autowired
	private IProductoRepository iProductoRepository;

	@Override
	public void insertarPro(Producto pro, Inventario inv) {
		// TODO Auto-generated method stub
		this.iProductoService.insertar(pro);
		List<Producto> insertarPro = inv.getInventarioPro();
		insertarPro.add(pro);
		inv.setInventarioPro(insertarPro);
		this.iInventarioService.actualizarInventario(inv);

	}

	@Override
	public void inventarioCrear(Producto pro, Inventario inv) {
		// TODO Auto-generated method stub
		this.iProductoService.insertar(pro);
		this.iInventarioService.insertarInventario(pro, inv);

	}

	@Override
	public void consultar(Inventario inv, LocalDateTime fechaIngreso) {
		// TODO Auto-generated method stub
		List<Producto> inventarioConsultar = inv.getInventarioPro();
		inv.setInventarioPro(inventarioConsultar);
		this.iInventarioService.actualizarInventario(inv);

		System.out.println("Los productos buscados por medio de Fecha son:");
		for (Producto i : inventarioConsultar) {
			if (i.compareTo(fechaIngreso) > 0)
				System.out.println(i);
		}

	}

	@Override
	public BigDecimal precio(Producto p) {
		BigDecimal precioCompra = p.getPrecioCompra();
		BigDecimal ganancia = new BigDecimal("0.10");
		BigDecimal iva = new BigDecimal("0.12");

		BigDecimal operacion = ganancia.multiply(precioCompra);
		BigDecimal operacion2 = iva.multiply(precioCompra);

		BigDecimal sumaOpe = operacion.add(operacion2);

		BigDecimal precioVenta = sumaOpe.add(precioCompra);

		p.setPrecioVenta(precioVenta);

		return precioVenta;

	}

}