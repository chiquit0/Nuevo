package Entornos;

import java.util.Scanner;

public class Kilos {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		float kgs = 0.0f;
		
		System.out.println("Introduce tu peso: ");
		kgs = ent.nextFloat();
		System.out.println("¡Tu peso es " + kgs + " kgs!");

	}

}
