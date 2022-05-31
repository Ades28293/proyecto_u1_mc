package com.uce.edu.demo.tarea.fabrica;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ensamblar {

	private LocalDateTime fechaEnsamblaje;
	
	//3)DI por metodos set
	private Moto moto;
	private Trabajador trabajador;
	
	
	public String ensamblaje(String nombre,String apellido,String nombreMoto,String modeloMoto,
			int codigoMoto,LocalDateTime fechaEnsamblaje) {
		
		this.trabajador.setNombre(nombre);
		this.trabajador.setApellido(apellido);
		
		this.moto.setNombre(nombreMoto);
		this.moto.setModelo(modeloMoto);
		this.moto.setCodigo(codigoMoto);
		
		this.fechaEnsamblaje=fechaEnsamblaje;
		
		return "Moto ensamblada";
		
	}


	//Get y Set
	public LocalDateTime getFechaEnsamblaje() {
		return fechaEnsamblaje;
	}


	public void setFechaEnsamblaje(LocalDateTime fechaEnsamblaje) {
		this.fechaEnsamblaje = fechaEnsamblaje;
	}


	public Moto getMoto() {
		return moto;
	}

	@Autowired
	public void setMoto(Moto moto) {
		this.moto = moto;
	}


	public Trabajador getTrabajador() {
		return trabajador;
	}

	@Autowired
	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}
	
	
	
	
}
