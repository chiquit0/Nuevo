package ApuntesTema1VariablesyBucles;

import java.util.Scanner;
 
public class Password {

	public static void main(String[] args) {
		
		//Simulaci�n de un Login (3 intentos)
		Scanner ent = new Scanner(System.in);
		String passIN ="", pass = "qwerty";
	for(int i=3 ; i>0 ; i--) {
		System.out.println("Introduce la contrase�a: (Tienes "+ i + " intentos)");
		passIN = ent.nextLine();
		
		if(passIN.equals(pass)) {
			System.out.println("Contrase�a aceptada");
			break;
		}else {
			System.out.println("Contrase�a incorrecta");
		}

	}
	}
} 

