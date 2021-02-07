package com.ucreativa;

public class Televisor {
	private double tamanopantalla;
	private String color;
	private int resolucion;
	
	// getters setters
	public double getTamanopantalla() {
		return tamanopantalla;
	}

	public void setTamanopantalla(double tamanopantalla) {
		this.tamanopantalla = tamanopantalla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}


	//constructor
	public Televisor(double tamanopantalla, String color, int resolucion) {
		this.tamanopantalla= tamanopantalla;
		this.color= color;
		this.resolucion= resolucion;
		
	}

	public String toString() {
		return "Televisor: Tamaño= " + tamanopantalla + "Color= " + color + "Resolucion= " + resolucion;
	}

}
