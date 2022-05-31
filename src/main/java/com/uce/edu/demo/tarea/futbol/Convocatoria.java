package com.uce.edu.demo.tarea.futbol;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class Convocatoria {

	private LocalDateTime fechaConvocatoria;

	//
	private Entrenador entrenador;
	private Jugador jugador;

	// constructor
	public Convocatoria(Entrenador entrenador, Jugador jugador) {
		this.jugador = jugador;
		this.entrenador = entrenador;
	}

	public String agendar(LocalDateTime fechaConvocatoria, String nombre, String apellido, int edad,
			String nombreJugador, String apellidoJugador, int edadJugador, String posicionJUgador) {

		this.entrenador.setNombre(nombre);
		this.entrenador.setApellido(apellido);
		this.entrenador.setEdad(edad);

		//
		this.jugador.setNombre(nombreJugador);
		this.jugador.setApellido(apellidoJugador);
		this.jugador.setEdad(edadJugador);
		this.jugador.setPosicion(posicionJUgador);

		this.fechaConvocatoria = fechaConvocatoria;

		return "Convocatoria realizada";

	}
	
	//Set y Get

	public LocalDateTime getFechaConvocatoria() {
		return fechaConvocatoria;
	}

	public void setFechaConvocatoria(LocalDateTime fechaConvocatoria) {
		this.fechaConvocatoria = fechaConvocatoria;
	}

	public Entrenador getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	
	

}
