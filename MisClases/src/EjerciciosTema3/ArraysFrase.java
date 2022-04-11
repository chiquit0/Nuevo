package EjerciciosTema3;

import java.util.Arrays;

public class ArraysFrase {

	public static void main(String[] args) {
		
		
		String frase = "En un pueblo italiano vive nuestro amigo Marco";
		
		String[] palabras = frase.split(" ");
			
		System.out.println(Arrays.toString(palabras));
		
		masLarga(palabras);
	//	masVocales(palabras);

	}

	public static void masLarga(String[] palabras) { 
		String larga = "";
		
		for(int i=0 ; i < palabras.length ; i++) {
			if(palabras[i].length() > larga.length()) {
				larga= palabras[i];
			}
		}
	
	System.out.println("La más larga es " + larga + " con " + larga.length() + " caracteres.");
	
	}

}
