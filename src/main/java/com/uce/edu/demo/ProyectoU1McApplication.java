package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica2;
import com.uce.edu.demo.tarea.fabrica.Ensamblar;
import com.uce.edu.demo.tarea.futbol.Convocatoria;
import com.uce.edu.demo.tarea.matriculacion.Matricula;

@SpringBootApplication
public class ProyectoU1McApplication implements CommandLineRunner {

	// 1)DI por atributo
//	@Autowired
//	private CitaMedica cita;

	@Autowired
	private CitaMedica2 cita;

	// DI por constructor
	@Autowired
	private Convocatoria convocatoria;

	// Di por set
	@Autowired
	private Ensamblar ensamblar;

	// Di por atributos
	@Autowired
	private Matricula matricula;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1McApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mi primer proyecto con Spring Framework");

		String respuesta = this.cita.agendar(LocalDateTime.now(), "Javier", "Teran", 32, "Quito", "Pepe", 12);

		System.out.println(respuesta);

		System.out.println("--------------------------------------------------------");
		System.out.println("Deber de DI por constructor");

		String respuesta2 = this.convocatoria.agendar(LocalDateTime.now(), "Jorge ", "Alfarro", 40, "Gonzalo", "Plata",
				19, "Delantero");

		System.out.println(respuesta2);
		System.out.println("--------------------------------------------------------");

		System.out.println("Deber de DI por Set");
		String respuesta3 = this.ensamblar.ensamblaje("Juan", "Espinoza", "Motocross", "XMLS", 12546,
				LocalDateTime.now());
		System.out.println(respuesta3);

		System.out.println("--------------------------------------------------------");
		System.out.println("Deber de DI por Atributos");
		String respuesta4 = this.matricula.matricular("Michael", "Cen", 22, "Programación II", "Sexto", "AMS-15",
				LocalDateTime.now());
		System.out.println(respuesta4);

	}

}
