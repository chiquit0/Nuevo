package EjerciciosTema3;

import java.util.Arrays;

import java.util.Scanner;

public class HundirLaFlota {
//Generar un barco de manera horizontal o vertical con math.random
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		boolean respuesta = true;
		System.out.println("Bienvenido al Hundir la flota. \n"
				+ "El tamaño del tablero es de 10x10, dispones de 15 intentos para derrumbar un barco que ocupa 3 posiciones. \n"
				+ "La letra A significa agua, la letra T tocado y la letra H hundido. \n"
				+ "Pon true para comenzar.");
		respuesta = ent.nextBoolean();
		
		char [][] tablero = new char[10][10];
//		int [][] posicionBarco = new int[3][4]
		
		//TABLERO:       //Método de rellenar
		for(int i=0; i<tablero.length ; i++) {
			Arrays.fill(tablero[i], '*');//Así se rellena la matriz con asteriscos automáticamente
			System.out.println(Arrays.toString(tablero[0]));
		}
	//Introducir coordenadas
	System.out.println("Introduce coordenadas:");
	System.out.println("Coordenada X:");
		int posx = ent.nextInt();
	System.out.println("Coordenada Y:");
		int posy = ent.nextInt();	
		
		int posjugador = 0;
//		int posx, posy = posjugador;
	}
	
	
	
//	public static int posBarco(char[][] posBarco) {
//		int posx = 4;
//		int posy = 6;
//		
//		for(int i=0; i<posBarco.length; i++) {
//			posBarco[4][6] = "X";		
//			
//	}
//
//	public static disparo() {
//		if(posBarco == posjugador) {
//			System.out.println("Tocado");
//		}else if{ (posBarco != posjugador) {
//			System.out.println("Agua");
//		}
//	}
//		public static void rellenar(int[][] posBarco) {
//			int[][] pos = new int[4][7];
//			int cont = (posBarco.length * posBarco.length)  - 1;
//			for(int i=0 ; i<posBarco.length ; i++) {
//				for(int j=0 ; j < posBarco[i].length ; j++) {
//					posBarco[4][7] = cont;
//					cont--;
//				}
//			}
//		}

		
		
//	public void setInicializar(String[][] matriz) {
//		for(int i=0;i<matriz.length;i++) {
//			for(int j=0;j<matriz[i].length;j++) {
//				matriz[i][j] = "X";
//			}
//		}
//			disparar(matriz);
//		}

		
		
//		public static void disparar(char [][]matriz) { //Al disparar debe cambiar la casilla
//			char posicion = ' ';
			
			//for(int i=0, i<)
		
}		
			
//		}
//		//Método de mostrar
//		for(int i=0 ; i<matriz.length ; i++) { 
//			for(int j=0 ; j < matriz[i].length ; j++) {
//				System.out.println(" " + matriz[i][j] + " ");
//			}
//			System.out.println("\n");
		
	

