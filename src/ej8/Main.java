package ej8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// creacion del scanner
		Scanner sc = new Scanner(System.in);
		
		//
		String frase="";
		
		//
		String palabra = "alomomola";
		
		//array de cadenas que separa la frase por espacios
		String[] separacion;
		
		boolean esPalindromo=false;
		
		
		
		//si la primera mitad es igual que la segunda mitad
		
		
		

		//asignamos valor a palabra
//		palabra=sc.nextLine();
		

		separacion=palabra.split("");
		
		
		
		for(int i=0;i<separacion.length;i++) {
			
			if(separacion[i].equals(separacion[(separacion.length-1)-i])) {
				esPalindromo=true;
			}
			
			
		}
		
		System.out.println(esPalindromo);
		
		
	}

}
