package EjerciciosTema2;

import java.util.Scanner;

public class PruebaMetodos {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		String nombre=" ";
		
		System.out.println("Introduzca su nombre:");
		nombre = ent.nextLine();
		
		System.out.println(saludar(nombre));

	}

//	public static void saludar(String nombre) {
//	
//		System.out.println("Buenos días " + nombre);
	
	public static String saludar(String nombre) {
	
		return "Buenos días" + nombre;
	}
}
