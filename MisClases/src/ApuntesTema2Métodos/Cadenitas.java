package ApuntesTema2Métodos;

import java.util.Scanner;

public class Cadenitas {

	public static void main(String[] args) {
			Scanner ent = new Scanner(System.in);
			String cadena = " ";
	
			System.out.println("Introduzca una frase: ");
			cadena = ent.nextLine();
			
			mayus(cadena);
			String revertida = reves(cadena);
	
	}
	
	public static String reves(String cadena) {
		String frase= " ";
		
		for(int i= cadena.length() -1 ; i >= 0 ; i--) {
			frase += cadena.charAt(i);
		}
			
		return frase;
	}
	
	public static void mayus(String cad) {
		
		System.out.println(cad.toUpperCase());
	}
	
}
