package ej6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		// creacion del scanner
		Scanner sc = new Scanner(System.in);
		
		//
		String cad1="";
		
		//
		String cad2 = "";
		
		
		//
		while(!cad1.equalsIgnoreCase("fin")) {
			
			sc.nextLine();
			
			cad2+=cad1;
			
			//
			System.out.println("Escribe la frase:");
			
			//
			cad1=sc.nextLine();
			
//			//si la palabra escrita no es fin
//			if(!cad1.equalsIgnoreCase("fin")) {
//				cad2+=cad1+" ";
//			}
			
		}
		
		
		System.out.println(cad2);
		
		
	}

}
