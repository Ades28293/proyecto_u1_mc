package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroRepository {
	
	// Crud
		// insertar
		public void insertarRetiro(Retiro r);

		// buscar
		public Retiro buscarRetiro(String numeroCta);

		// actualizar
		public void actualizarRetiro(Retiro r);

		// eliminar
		public void eliminarRetiro(String numeroCta);
		
		public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);

}
