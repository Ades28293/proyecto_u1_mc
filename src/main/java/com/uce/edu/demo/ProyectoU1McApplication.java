package com.uce.edu.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1McApplication implements CommandLineRunner {

	// inyeccion
	@Autowired
	private IEstudianteService estudianteService;

	@Autowired
	private IMateriaService mateService;

	@Autowired
	private IMatriculaService matriService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1McApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Estudiante e = new Estudiante();
		e.setNombre("Edison");
		e.setApellido("Cayambe");
		e.setCedula("1720757101");

		this.estudianteService.ingresarEstudiante(e);

		Estudiante e1 = new Estudiante();
		e1.setNombre("Pepito");
		e1.setApellido("Perez");
		e1.setCedula("1752166486");

		this.estudianteService.ingresarEstudiante(e1);

		// usar los 3 metodos restantes
		// actualizar
		e.setCedula("0997125604");
		this.estudianteService.actualizarEstudiante(e);

		this.estudianteService.buscarApellido("Cayambe");

		this.estudianteService.borrarEstudiante("0997125604");

		/////////////////////////////////////////////////////////
		System.out.println("------------------------------");
		System.out.println("Consumo de métodos Materia ");

		Materia mate1 = new Materia();
		mate1.setNombre("Análisis");
		mate1.setSemestre("Sexto");

		this.mateService.insertar(mate1);

		Materia mate2 = new Materia();
		mate2.setNombre("Programacion Avanzada II");
		mate2.setSemestre("Sexto");

		this.mateService.insertar(mate2);

		mate1.setNombre("Algebra");
		this.mateService.actualizar(mate1);

		this.mateService.buscar("Análisis");
		this.mateService.eliminar("Algebra");
		
        /////////////////////////////////////////////////////////////
		System.out.println("------------------------------");
		System.out.println("Consumo de métodos Matricula ");

		List<Materia> materia = new ArrayList<Materia>();
		materia.add(mate1);
		materia.add(mate2);
		Matricula matri1 = new Matricula();

		matri1.setEstudiante(e);
		matri1.setNumero("165165165");
		matri1.setMateria(materia);
		this.matriService.insertar(matri1);

		Matricula matri2 = new Matricula();
		matri2.setEstudiante(e1);
		matri2.setNumero("09854564694");
		matri2.setMateria(materia);
		this.matriService.insertar(matri2);

		matri1.setMateria(materia);
		this.matriService.actualizar(matri2);

		this.matriService.buscar("165165165");
		this.matriService.eliminar("165165165");

	}

}
