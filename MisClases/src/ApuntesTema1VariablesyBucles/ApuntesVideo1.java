package ApuntesTema1VariablesyBucles;

import java.util.Scanner;

public class ApuntesVideo1 {

	public static void main(String[] args) {
		
		//*********************************************************MODELO TIPO SCANNER Y CONDICIONAL IF*************************************************************
		
		// < Menor qu�, > Mayor qu�, != diferente qu�, == igual qu�
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Introduce tu edad, por favor");
		
		int edad=ent.nextInt(); //Esto sirve para almacenar el n�mero que se quiera en la consola
//
		if(edad>=18) { //Si el n�mero es mayor o igual de 18, eres mayor de edad
			System.out.println("Eres mayor de edad");
//		
		}else { //Si el n�mero no es mayor o igual que 18, eres menor de edad
			System.out.println("Eres menor de edad");

//		}
		
		if (edad<18) {
			System.out.println("Eres un adolescente");
		
		}else if(edad<40) {
			System.out.println("Eres joven");
		
		}else if(edad<65) {
			System.out.println("Eres mayor");
		}else {
			System.out.println("Eres un viejete");
		}
		}
	}
}
