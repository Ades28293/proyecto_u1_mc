package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.aeropuerto.modelo.PilotoGeneral;
import com.uce.edu.demo.aeropuerto.modelo.PilotoPrivado;
import com.uce.edu.demo.aeropuerto.modelo.RegistroVuelos;
import com.uce.edu.demo.aeropuerto.modelo.Vuelos;
import com.uce.edu.demo.aeropuerto.service.IRegistroVuelosService;

@SpringBootApplication
public class ProyectoU1McApplication implements CommandLineRunner {

	// inyeccion
	@Autowired
	private PilotoGeneral pilotoGeneral1;

	@Autowired
	private PilotoGeneral pilotoGeneral2;

	@Autowired
	private PilotoPrivado pilotoPrivado1;

	@Autowired
	private PilotoPrivado pilotoPrivado2;

	@Autowired
	private IRegistroVuelosService iRegistroVuelosService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1McApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("EJEMPLO SINGLETON");

		this.pilotoGeneral1.setNombre("Michael");
		this.pilotoGeneral1.setApellido("Cen");

		System.out.println(this.pilotoGeneral1);
		System.out.println("--------------------------------------------");
		System.out.println(this.pilotoGeneral2);
		this.pilotoGeneral1.setNombre("Juan");
		System.out.println("--------------------------------------------");

		System.out.println(this.pilotoGeneral1);
		System.out.println("------------------------------------------");
		System.out.println(this.pilotoGeneral2);

		System.out.println("EJEMPLO PROTOTYPE");
		this.pilotoPrivado1.setNombre("Daniel");
		this.pilotoPrivado1.setApellido("Teran");
		System.out.println(this.pilotoPrivado1);

		System.out.println(this.pilotoPrivado2);

		RegistroVuelos rVuelo1 = new RegistroVuelos();
		rVuelo1.setNumVuelo("13215");
		rVuelo1.setVuelo(new Vuelos());

		this.iRegistroVuelosService.insertar(rVuelo1);

	}

}
