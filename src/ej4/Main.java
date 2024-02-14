package ej4;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
//		{"ඞ", "ඦ", "ඬ", "ඐ", "ඏ", "ඟ", "෴"}
		
		//lee los tamaños
		String[] recogida;
		
		//orden de tamaños
		String[] ordenada;
		
		
		String cad1="Hola que no";
		
		
		recogida=cad1.split(" ");
		
		//ordena la a
		Arrays.sort(recogida);
		
		System.out.println(Arrays.toString(recogida));
		
		
		
//		//
//		String frase = "En un lugar de la mancha";
//		
//		//
//		String frase2;
//		
//		//
//		String[] palabras; // Separador: espacio en blanco
//		
//		//
//		String[] ordenado;
//		
//		palabras = frase.split(" "); 
//		
//		frase2=palabras.toString();
//		
		
		
	}

}
