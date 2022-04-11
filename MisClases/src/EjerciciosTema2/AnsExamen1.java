package EjerciciosTema2;

import java.util.Scanner;

public class AnsExamen1 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		String frase = "", fraseLarga = "";
		
		for(int i=1; i<=5 ; i++) {//Mientras i sea menor o igual a 5 se van a ir escribiendo las frases de una en una
//		int i=1;
//		do {
			System.out.println("Introduce la " + i + "ª frase:");
			frase = ent.nextLine();
			if(frase.length() > fraseLarga.length()) {
				fraseLarga = frase;
			}
//			i++; //El incremento
//		}while(i<=5);
		
		System.out.println("La frase más larga es: \n"
			+ fraseLarga +"\n"	
			+ "Con " + fraseLarga.length() + " caracteres.");
	
		}
	}
}

