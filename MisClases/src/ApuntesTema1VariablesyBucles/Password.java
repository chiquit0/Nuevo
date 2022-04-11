package ApuntesTema1VariablesyBucles;

import java.util.Scanner;
 
public class Password {

	public static void main(String[] args) {
		
		//Simulación de un Login (3 intentos)
		Scanner ent = new Scanner(System.in);
		String passIN ="", pass = "qwerty";
	for(int i=3 ; i>0 ; i--) {
		System.out.println("Introduce la contraseña: (Tienes "+ i + " intentos)");
		passIN = ent.nextLine();
		
		if(passIN.equals(pass)) {
			System.out.println("Contraseña aceptada");
			break;
		}else {
			System.out.println("Contraseña incorrecta");
		}

	}
	}
} 

