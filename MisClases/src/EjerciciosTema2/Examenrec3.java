package EjerciciosTema2;

import java.util.Scanner;

public class Examenrec3 {

	public static void main(String[] args) {
		
		System.out.println(cadenatexto());			

	}

	public static String cadenatexto() {
			
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
		String frase = ent.nextLine();
		frase = frase.toUpperCase();
		System.out.println("#" + frase.trim() + "#");
	
		return frase;
	}
}                 
