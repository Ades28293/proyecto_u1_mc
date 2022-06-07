package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica2;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.tarea.fabrica.Ensamblar;
import com.uce.edu.demo.tarea.futbol.Convocatoria;
import com.uce.edu.demo.tarea.matriculacion.Matricula;

@SpringBootApplication
public class ProyectoU1McApplication implements CommandLineRunner {

	//inyeccion
	@Autowired
	private IEstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1McApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Estudiante e=new Estudiante();
		e.setNombre("Edison");
		e.setApellido("Cayambe");
		e.setCedula("1720757101");
		
		this.estudianteService.ingresarEstudiante(e);
		
		Estudiante e1=new Estudiante();
		e1.setNombre("Pepito");
		e1.setApellido("Perez");
		e1.setCedula("1752166486");
		
		this.estudianteService.ingresarEstudiante(e1);
		
		//usar los 3 metodos restantes
		//actualizar
		e.setCedula("0997125604");
		this.estudianteService.actualizarEstudiante(e);
		
		
		this.estudianteService.buscarApellido("Cayambe");
		
		this.estudianteService.borrarEstudiante("0997125604");
		
		

	}

}
