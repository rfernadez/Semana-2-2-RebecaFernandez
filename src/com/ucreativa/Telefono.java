/**
 * 
 */
package com.ucreativa;

/**
 * @author rebe2
 *
 */
public class Telefono {
	private String color;
	private String marca;
	private int memoria;
	
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
		this.color = color;
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
	
	/**
	 * 
	 */
	public Telefono(String color,String marca, int memoria ) {
		// TODO Auto-generated constructor stub
		this.color= color;
		this.marca= marca;
		this.memoria= memoria;
	
}

	public String toString() {
	return "Telefono: Color= " + color + "Marca= " + marca + "Memoria= " + memoria;
}
}
