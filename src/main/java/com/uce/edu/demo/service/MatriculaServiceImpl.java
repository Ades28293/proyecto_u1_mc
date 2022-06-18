package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.repository.IMatriculaRepository;
@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository matriculaRepository;
	
	@Autowired
	private ProfesorGeneral profesorGeneral;
	
	@Autowired
	private ProfesorMateria profesorMateria;
	
	@Lookup
	public ProfesorMateria obtenerProfesorM() {
		//ejercicio de bases de datos de transformacion
//		ProfesorMateria profe=new ProfesorMateria();
//		ProfesorMateria profe=this.obtenerProfesorM();
		
//		ProfesorMateria profeM=new ProfesorMateria();
//		profeM.setApellido("Tapia");
//		profeM.setNombre("Jose");
		
		return null;
	}
	
	@Lookup
	public ProfesorGeneral obtenerProfesorG() {
		
		return null;
	}
	
	

	@Override
	public void insertar(Matricula ma) {
		// TODO Auto-generated method stub
		System.out.println("DI desde service SINGLETON "+ this.profesorGeneral);
		System.out.println("DI desde service PROTOTYPE "+ this.profesorMateria);
		
		System.out.println("DI desde un metodo Materia: "+ this.obtenerProfesorM());
		System.out.println("DI desde un metodo General: "+ this.obtenerProfesorG());
		
		this.matriculaRepository.insertar(ma);
	}

	@Override
	public Matricula buscar(String numero) {
		// TODO Auto-generated method stub
		return this.matriculaRepository.buscar(numero);
	}

	@Override
	public void actualizar(Matricula ma) {
		// TODO Auto-generated method stub
		this.matriculaRepository.actualizar(ma);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		this.matriculaRepository.eliminar(numero);
	}

}
