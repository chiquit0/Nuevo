package ApuntesTema3Arrays;

import java.util.Scanner;

public class PruebaArrays {

	public static void main(String[] args) {
		
			Scanner ent = new Scanner(System.in);
			int size = 0;
			int[] array;
			
			System.out.println("Introduce el tamaño del Array:");
			size= ent.nextInt();
			array = new int[size]; 
			
			for(int i=0 ; 1<array.length ; i++) {
				System.out.println("Rellena la celda " + i);
				array[i] = ent.nextInt();
						
			}	
			
	}

	public static void mostrarArray(int[] lista) {
		System.out.println("El array tiene " + lista.length + " elementos");
		for(int i=0 ; i<lista.length ; i++) {
			System.out.println(lista[i]);
		}
	}
	
}
