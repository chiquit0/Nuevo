package ApuntesTema1VariablesyBucles;

import java.util.Scanner;

public class Hucha {

	public static void main(String[] args) {
		
		float cantidad = 0.0f;
		float objetivo = (float)(Math.random()*1000);
		float ahorrado = objetivo;
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Objetivo de ahorro " + objetivo);
		
		while(objetivo > 0) {
			System.out.println("¿Cuánto quiere ingresar?");
			cantidad = Float.parseFloat(ent.nextLine().replace(',' , '.'));
			objetivo = objetivo - cantidad;
			if(ahorrado > 0) {
				System.out.println("Ha ingresado " + cantidad + " le falta para el objetivo " + objetivo);
		}else {
			System.out.println("Has cumplido el objetivo de " + objetivo);
		}
	}
	}
}
