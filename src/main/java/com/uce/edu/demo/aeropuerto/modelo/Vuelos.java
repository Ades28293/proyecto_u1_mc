package com.uce.edu.demo.aeropuerto.modelo;

public class Vuelos {

	private String numVuelo;
	private String origen;
	private String destino;

	// Set y Get
	public String getNumVuelo() {
		return numVuelo;
	}

	public void setNumVuelo(String numVuelo) {
		this.numVuelo = numVuelo;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	// metodo toString
	@Override
	public String toString() {
		return "Vuelos [numVuelo=" + numVuelo + ", origen=" + origen + ", destino=" + destino + "]";
	}

}
