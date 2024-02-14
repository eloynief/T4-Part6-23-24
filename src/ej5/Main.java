package ej5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// creacion del scanner
		Scanner sc = new Scanner(System.in);
		
		//
		String cad1="";
		
		System.out.println("Escribe la frase:");
		
		cad1=sc.nextLine();
		
		
		
		//se imprime los caracteres invertidos
		System.out.println(cadenaReves(cad1));
		
		//cierre scanner
		sc.close();
		
	}

	public static String cadenaReves(String cad1) {
		String cad2="";
		
		//for que recorre al reves
		for(int i=cad1.length()-1;i>=0;i--) {
			
			//le va sumando la ultima letra
			cad2+=cad1.charAt(i);
			
		}
		return cad2;
	}

}
