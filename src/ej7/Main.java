package ej7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// creacion del scanner
		Scanner sc = new Scanner(System.in);
		
		//
		String frase="";
		
		//
		String palabra = "";
		
		//array de cadenas que separa la frase por espacios
		String[] separacion;
		
		int contador=0;
		
		
		//
		System.out.println("Escribe la frase: ");

		//asignamos valor a la frase
		frase=sc.nextLine();
		
		//asignamos el valor de la separacion
		separacion=frase.split(" ");
		
		//
		System.out.println("Ahora escribe la palabra: ");
		
		//asignamos valor a palabra
		palabra=sc.nextLine();
		
		for(int i=0;i<separacion.length;i++) {
			
			if(palabra.equals(separacion[i])) {
				contador++;
			}
			
		}
		
		//comprobar si el numero aparece 1 o mas veces
		if(contador==1) {

			//
			System.out.println("La palabra aparece "+contador+" vez");
			
		}
		else {

			//
			System.out.println("La palabra aparece "+contador+" veces");
			
		}
		
		
	}

}
