package Entornos;

import java.util.Scanner;

public class DebugParejas {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		 int x =0;
		
		 System.out.println("Introduce un número para ver si es par o impar");
		 x=ent.nextInt();
		if (x % 2 == 0) {
			System.out.println("El numero es impar");
		}else {
			System.out.println("El numero es par");
		}

	}

}
