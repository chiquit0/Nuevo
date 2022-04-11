package Macaya;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);

		float num1 = 0.0f, num2 = 0.0f;
		float resultado = 0.0f;
		boolean seguir = true;
		char respuesta = ' ';

		do {
			do {
				try {
					System.out.println("Introduce un número: ");
					ent = new Scanner(System.in);

					num1 = ent.nextFloat();
					seguir = false;

				} catch (InputMismatchException ex) {
					System.out.println("Error " + ex.getMessage());
					seguir = true;
				}
			}while (seguir);
			do {
				try {
					System.out.println("Introduce otro número: ");
					ent = new Scanner(System.in);

					num2 = ent.nextFloat();
					if (num2 == 0) {
						throw new Exception("no es posible la división entre 0");
					}
					seguir = false;
					resultado = num1 / num2;
					System.out.println("El resultado es: " + resultado);

				}catch (InputMismatchException ex) {
					System.out.println("Error " + ex.getMessage());
					seguir = true;
				}catch (Exception e) {
					System.out.println("No es posible dividir entre 0");
				}
			}while (seguir);

			do {
				
				System.out.println("¿Quieres continuar? S/N");
				
				respuesta = ent.next().charAt(0);
				if(Character.toUpperCase(respuesta)!='S' && Character.toUpperCase(respuesta) != 'N') {
					System.out.println("opción no válida");
					seguir = true;
				}else {
					seguir = false;
				}

			}while (seguir);

			if (Character.toLowerCase(respuesta) == 's') {
				seguir = true;
			}else {
				seguir = false;
			}

		}while (seguir);
	}
}
