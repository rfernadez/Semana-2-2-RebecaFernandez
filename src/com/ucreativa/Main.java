/**
 * 
 */
package com.ucreativa;

/**
 * @author rebe2
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televisor televisor1 = new Televisor(14.5, "Negro", 1000);
		
		System.out.println("Instancia 1");
		System.out.println(televisor1.toString());
		System.out.println("=========");
		
		Telefono telefono1 = new Telefono("Negro","Huawei", 120);
		
		System.out.println("Instancia 2");
		System.out.println(telefono1.toString());
		System.out.println("=========");
		
		Computadora computadora1 = new Computadora(7, "Lenovo", 200);
		
		System.out.println("Instancia 3");
		System.out.println(computadora1.toString());
		System.out.println("=========");
	
	}

}
