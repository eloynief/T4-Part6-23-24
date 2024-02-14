package ej3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//lee los tamaños
		String[] a={"ඞ", "ඦ", "ඬ", "ඐ", "ඏ", "ඟ", "෴"};

		//
		String cad1="Hola que";
		

		// creacion del scanner
		Scanner sc = new Scanner(System.in);
		
		
		//la contraseña a adivinar, el intento que hacemos y el resultado del intento
		String contrasena="ducking",intento="",resultado="";
		
		Character caracter;
		
		
		do {
			
			System.out.println("Escriba el intento: ");
			
			intento=sc.next();
			
			while(intento.length()==contrasena.length()) {
				
				//escribir intento
				
				
			}
			
			//recorremos el string
			for(int i=0;i<contrasena.length();i++) {
				caracter=contrasena.charAt(i);
				//
				if(contrasena.charAt(i)==intento.charAt(i)) {
					resultado+=contrasena.charAt(i);
				}
				else {
					
					resultado+="*";
					
				}
				
			}

			System.out.println(resultado);
			
			
			
				
		}while(!contrasena.equals(intento));
		
		
		
		Main.valorMisMuertos(false);
		
		
		
		
		
	}
	
	//metodo de value of
    public static String valorMisMuertos(boolean b) {
        return b ? "true" : "false";
    }

	
	
	
	
	
	

}
