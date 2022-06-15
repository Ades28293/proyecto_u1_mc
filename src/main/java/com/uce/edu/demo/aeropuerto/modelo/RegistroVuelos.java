package com.uce.edu.demo.aeropuerto.modelo;

public class RegistroVuelos {
	
	private String numRegistroVuelo;
	private Vuelos vuelo;
	
	//Set y Get
	
	public String getNumVuelo() {
		return numRegistroVuelo;
	}
	public void setNumVuelo(String numVuelo) {
		this.numRegistroVuelo = numVuelo;
	}
	public Vuelos getVuelo() {
		return vuelo;
	}
	public void setVuelo(Vuelos vuelo) {
		this.vuelo = vuelo;
	}
	
	@Override
	public String toString() {
		return "RegistroVuelos [numVuelo=" + numRegistroVuelo + ", vuelo=" + vuelo + "]";
	}
	

}
