package com.ucreativa;

public class Computadora {
	
	private int procesador;
	private String marca;
	private int memoria;
	
	public int getProcesador() {
		return procesador;
	}


	public void setProcesador(int procesador) {
		this.procesador = procesador;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getMemoria() {
		return memoria;
	}


	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	

	public Computadora(int procesador, String marca, int memoria) {
		super();
		this.procesador = procesador;
		this.marca = marca;
		this.memoria = memoria;
	}
	public String toString() {
		return "Computadora: Procesador= " + procesador + "Marca= " + marca + "Memoria= " + memoria;
	}
}
