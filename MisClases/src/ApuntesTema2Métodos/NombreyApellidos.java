package ApuntesTema2Métodos;

import java.util.Scanner;

public class NombreyApellidos {

	public static void main(String[] args) {
		
//		String nombre = nombre1();
//		String apellidos();
//		
//		System.out.println("Tu nombre y apellidos son: " + nombre + apellidos);
	
		System.out.println(recogerDatos());
	}
	
	public static String recogerDatos() {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		String nombre = ent.nextLine();
		System.out.println("Introduce tu apellido: ");
		String apellidos = ent.nextLine();
		
		return "Buenos días " + nombre + " " + apellidos ;
	}

//	public static String nombre1() {
//		Scanner ent = new Scanner(System.in);
//		String nombre = " ";
//		
//		System.out.println("Introduce tu nombre:");
//		nombre = ent.nextLine();
//		
//		return nombre;
//		
//	}
//	public static String apellidos() {
//		Scanner ent = new Scanner(System.in);
//		String apellidos = " ";
//		
//		System.out.println("Introduce tus apellidos: ");
//		apellidos = ent.nextLine();
//		
//		return apellidos;
//
//
//	}
}
