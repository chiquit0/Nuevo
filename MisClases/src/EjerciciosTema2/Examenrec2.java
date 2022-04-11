package EjerciciosTema2;

import java.util.Scanner;

public class Examenrec2 {

	public static void main(String[] args) {
	
		System.out.println(opcion());

	}
	
	public static int opcion () {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Introduce un número del 1 al 5: ");
		int opcion = ent.nextInt();
		
		switch(opcion) {
		case 1:
			System.out.println("Letra a.");
			break;
		case 2:
			System.out.println("Letra e.");
			break;
		case 3:
			System.out.println("Letra i.");
			break;
		case 4:
			System.out.println("Letra o.");
			break;
		case 5:
			System.out.println("Letra u.");
		default:
			System.out.println("Número incorrecto.");
		
		}
		return opcion;
	}
}
