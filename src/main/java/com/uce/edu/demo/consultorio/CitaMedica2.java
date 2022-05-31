package com.uce.edu.demo.consultorio;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitaMedica2 {
	private LocalDateTime fechaCita;

	//3)DI por metodos set
	private Doctor doctor; // 3) a su metodo Set le pongo @Autowired
	private Paciente paciente; //3) a su metodo Set le pongo @Autowired

	public String agendar(LocalDateTime fechaCita, String nombre, String apellido, int edad, String ciudad,
			String nombrePaciente, int edadPaciente) {

		this.doctor.setNombre(nombre);
		this.doctor.setApellido(apellido);
		this.doctor.setEdad(edad);
		this.doctor.setCiudad(nombrePaciente);

		// seteamos los atributos de la cita medica
		this.paciente.setEdad(edadPaciente);
		this.paciente.setNombre(nombrePaciente);
		this.fechaCita = fechaCita;

		return "Cita agendada 2";
	}

	// Set y Get
	public Doctor getDoctor() {
		return doctor;
	}

	@Autowired
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	@Autowired
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}
