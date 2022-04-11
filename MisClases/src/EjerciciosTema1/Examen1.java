package EjerciciosTema1;

import java.util.Scanner;

public class Examen1 {

	public static void main(String[] args) {
		
//		Scanner ent = new Scanner(System.in);
//		
//		System.out.println("Introduce tu peso, por favor:");
//		
//		int peso = ent.nextInt();
//		
//		if(peso < 18.5) {
//			System.out.println("Necesitas comer más.");
//		}else if(peso == 18.5 || peso == 24.9) {
//			System.out.println("Peso normal.");
//		}else if(peso<=30) {
//			System.out.println("Tienes obesidad.");
//		}else if(peso>=30) {
//			System.out.println("Tienes obesidad mórbida.");
//		}
		
		
//		***********************************************************	SOLUCIÓN EJERCICIO 1***********************************************************
		
		Scanner ent = new Scanner(System.in);
		float peso=0.0f, altura=0.0f, imc=0.0f;
		
		System.out.println("Introduce tu peso:");
		peso = ent.nextFloat();
		System.out.println("Introduce tu altura:");
		altura = ent.nextFloat();
		
		imc =(float)(peso / Math.pow(altura, 2));
		imc = peso / (altura*altura);
		
		if(imc < 18.5) {
			System.out.println("Tu Imc es de " + imc + ", necesitas comer más.");
		}else if(imc >= 18.5 && imc < 25) {
			System.out.println("Tu Imc es de " + imc + ", tienes un peso correcto.");
		}else if(imc >= 25 && imc < 30) {
			System.out.println("Tu imc es de " + imc + ", tienes sobrepeso.");
		}else {
			System.out.println("Tu imc es de " + imc + ", tienes obesidad.");
		}
		

	}

}
