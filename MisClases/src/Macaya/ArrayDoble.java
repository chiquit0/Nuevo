package Macaya;

import java.util.Scanner;

public class ArrayDoble {

	public static void main(String[] args) {
		//Introducir las notas de los alumnos
		
		Scanner ent = new Scanner(System.in);
		
		String [] nombres = {"Ana", "Lara", "Javi", "Pepe"};
		String [] evaluacion = {"Primera", "Segunda"};
		float [][] notas = new float[4][2];
		
		//En estos for se introducen las notas de cada alumno con, uno para el array nombres y otro para el array evaluacion
		for(int i=0; i<nombres.length; i++) {
			for(int j=0; j<evaluacion.length; j++) {
				System.out.println("Introduce la nota de " + nombres[i] + " de la " + evaluacion[j] + " evaluación:");
				notas[i][j] = ent.nextFloat();
				
			}
		}
		 //En estos for se muestran las notas de cada alumno, se quita el "ln" del syso para que no haya salto de linea automatico
		for(int i=0; i<notas.length; i++) {
			System.out.print("Las notas de " + nombres[i] + ":");
			for(int j=0; j<evaluacion.length; j++) {
				System.out.print(notas[i][j]+ " ");
			}	
			System.out.println();
		}
	}
}
