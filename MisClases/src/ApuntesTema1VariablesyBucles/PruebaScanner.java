package ApuntesTema1VariablesyBucles;

import java.util.Scanner;

public class PruebaScanner {

	public static void main(String[] args) {   //EXAMENbucles, condicionles, manejo de tipo de datos
		
//		int num; //Declaraci�n
		
////		String cadena = new String ("Hola"); //Declaraci�n e instancia
		Scanner entrada = new Scanner(System.in); //Declaraci�n e instancia
//		
//		System.out.println("Introduce el nombre: ");
//		
//		String nombre = entrada.nextLine();
//		
//		System.out.println("Buenos dias " + nombre);
		
		System.out.println("Introduce una frase: ");
		
		String frase = entrada.nextLine();
		
		System.out.println("La frase contiene " + frase.length()+ " caracteres");

	}

}
