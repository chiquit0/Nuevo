package ApuntesTema1VariablesyBucles;

import java.util.Scanner;

public class Nombre {

	public static void main(String[] args) { 
		
		//*************PARA UTILIZAR EL SCANNER***************
		
		Scanner ent = new Scanner(System.in); //Primero instanciamos en scanner
	
		System.out.println("Introduce tu nombre"); //Luego introducimos la frase

		String nombre = ent.nextLine(); //Ahora almacenamos el nombre en una variable
		
		System.out.println("Buenos días, " + nombre);
	}

}
