package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.service.IGestoriInventarioService;

@SpringBootApplication
public class ProyectoU1McApplication implements CommandLineRunner {

	// inyeccion
	@Autowired
	private IGestoriInventarioService iGestoriInventarioService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1McApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Inventario inv = new Inventario();
		Producto pro1 = new Producto();

		pro1.setNombreProducto("Gelatina");
		pro1.setCantidadProductos(35);
		pro1.setPrecioCompra(new BigDecimal(75));
		pro1.setFechaIngreso(LocalDateTime.of(2019, 2, 12, 6, 5));
		pro1.setPrecioVenta(this.iGestoriInventarioService.precio(pro1));

		Producto pro2 = new Producto();

		pro2.setNombreProducto("Galletas");
		pro2.setCantidadProductos(18);
		pro2.setPrecioCompra(new BigDecimal(36));
		pro2.setFechaIngreso(LocalDateTime.of(2019, 7, 12, 6, 3));
		pro2.setPrecioVenta(this.iGestoriInventarioService.precio(pro2));

		Producto pro3 = new Producto();

		pro3.setNombreProducto("Doritos");
		pro3.setCantidadProductos(63);
		pro3.setPrecioCompra(new BigDecimal(12));
		pro3.setFechaIngreso(LocalDateTime.of(2021, 6, 12, 6, 2));
		pro3.setPrecioVenta(this.iGestoriInventarioService.precio(pro3));

		Producto pro4 = new Producto();

		pro4.setNombreProducto("Carne");
		pro4.setCantidadProductos(42);
		pro4.setPrecioCompra(new BigDecimal(25));
		pro4.setFechaIngreso(LocalDateTime.of(2022, 2, 7, 6, 7));
		pro4.setPrecioVenta(this.iGestoriInventarioService.precio(pro4));

		Producto pro5 = new Producto();

		pro5.setNombreProducto("Pollo");
		pro5.setCantidadProductos(89);
		pro5.setPrecioCompra(new BigDecimal(50));
		pro5.setFechaIngreso(LocalDateTime.of(2022, 2, 12, 6, 9));
		pro5.setPrecioVenta(this.iGestoriInventarioService.precio(pro5));
		
		this.iGestoriInventarioService.inventarioCrear(pro1, inv);
		this.iGestoriInventarioService.insertarPro(pro1, inv);
		this.iGestoriInventarioService.insertarPro(pro2, inv);
		this.iGestoriInventarioService.insertarPro(pro3, inv);
		this.iGestoriInventarioService.insertarPro(pro4, inv);
		this.iGestoriInventarioService.insertarPro(pro5, inv);
		
		System.out.println("Busqueda por filtro fecha");
		this.iGestoriInventarioService.consultar(inv, LocalDateTime.of(2022, 1, 1, 0, 0));
		
		

		

	}

}
