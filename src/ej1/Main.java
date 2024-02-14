package ej1;

public class Main {
	//
	public static void main(String[] args) {
		
		//
		String cad1,cad2;
		
		int num1,num2;
		
		//
		cad1="hola";
		
		//
		cad2="adios";
		
		
		if(cad1.length()>cad2.length())
		
		//
		if (cad1.compareToIgnoreCase(cad2)>0){
			
			//
			System.out.println("la cadena "+cad2+" es mas larga");
			
		}
		//
		else if (cad1.compareToIgnoreCase(cad2)>0){
			
			//
			System.out.println("la cadena "+cad1+" es mas larga");
			
		}
		else {

			//
			System.out.println("ambas son iguales");
			
			
			
		}
		
	}
	
	
}
