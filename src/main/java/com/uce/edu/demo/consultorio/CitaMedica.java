package com.uce.edu.demo.consultorio;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class CitaMedica {
	private LocalDateTime fechaCita;
	
   //@Autowired 1)Atributos
	private Doctor doctor;
	//@Autowired 1)Atributos
	private Paciente paciente;
	
	//2)Di Inyeccion por contructor
	public  CitaMedica(Doctor doctor,Paciente paciente) {
		this.doctor=doctor;
		this.paciente=paciente;
	}
	
	
	public String agendar(LocalDateTime fechaCita, String nombre,String apellido,int edad,String ciudad,
			String nombrePaciente,int edadPaciente) {
		
		
		this.doctor.setNombre(nombre);
		this.doctor.setApellido(apellido);
		this.doctor.setEdad(edad);
		this.doctor.setCiudad(nombrePaciente);
		
		//seteamos los atributos de la cita medica
		this.paciente.setEdad(edadPaciente);
		this.paciente.setNombre(nombrePaciente);
		this.fechaCita=fechaCita;
		
		
		return "Cita agendada";
	}
	
	//Set y Get
	public Doctor getDoctor() {
		return doctor;
	}
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
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	

}
