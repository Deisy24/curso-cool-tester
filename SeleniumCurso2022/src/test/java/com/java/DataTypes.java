package com.java;

public class DataTypes {

	public static void main(String[] args) {
		// Datos primitivos
		
		byte var1 = 1; // Numerico entero longitud de -28 a -127
		short var2 = 1; // Numerico entero
		int var3 = 1;  // Numerico entero - Automation
		long var4 = 1L; // Numero entero - Automation
		float var5 = 1.2f; // Numerico real
		double var6 = 1.2;  //Numerico real (decimales) - Automation
		char var7 = 'a';  //Caracter
		boolean var8 = true; // boleano - Autometion - tiene dos valores TRUE / FALSE
		
		// declarar variables
		int x;
		x= 1000;
		
		int y=10;
		
		// Cadena char
		String message = "Hello World";
		
		//Char symbol example
		char symbol = '\u00A9';
		//Imprimir en consola
		System.out.println(symbol);
		System.out.println(message);
		
		// Concatenacion. se representa con el signo +
		System.out.println(message+symbol);
		
		int numero = 1;
		int numero2 = 2;
		String nombre = "Daisy";
		System.out.println(nombre + numero);
		System.out.println(numero + numero2);
		System.out.println(numero + "" + numero2);



	}

}
