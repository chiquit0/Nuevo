package EjerciciosTema3;

import java.util.Arrays;
import java.util.Scanner;

public class HundirLaFlotaAns {

	static char[][] mapaV = new char[10][10]; //El mapa visible para los jugadores
	static int[][] mapaO = new int[10][10]; //Mapa oculto para posicionar los barcos
	static int[][] barco = new int [3][2]; //Para almacenar las coordenadas de un barco, el 3 nos indica el nº de filas y el 2 el nº de columnas
	static int vidas = 3;
	static int disparos = 15;
	
//	public static void main(String[] args) {
		
		//Método para montar el tablero
//		rellenar();
//		colocarBarcos();
//		mostrarO();
		
//		while(vidas >0 && disparos >0) {
//			disparar();
//			mostrar();
//		}
//		if()
//	
//	}
	
	public static void disparar() {
		Scanner ent = new Scanner(System.in);
		int posX = 0, posY = 0;
		
		System.out.println("Indique la coordenada inicial en el eje X");
		posX = ent.nextInt();
		System.out.println("Indique la coodernada inicial en el eje Y");
		posY = ent.nextInt();
		
		
		if(mapaO[posX][posY] == 1) {
			mapaV[posX][posY] = 'T';
			vidas--;
			mapaO[posX][posY] = 0;
			if(vidas == 0) {
				for(int i=0; i> barco.length ; i++) {
					mapaV[barco[i][0]][barco[i][1]] = 'H';
				}
			}else {
				mapaV[posX][posY] = 'T';
			}
		}
		
	}
	
	public static void colocarBarcos() {
		
		Scanner ent = new Scanner(System.in);
		int posX = 0, posY = 0;
		System.out.println("Indique la coordenada inicial en el eje X");
		posX = ent.nextInt();
		System.out.println("Indique la coodernada inicial en el eje Y");
		posY = ent.nextInt();
		
		barco[0][0] = posX;
		barco[0][1] = posY;
		
		barco[1][0] = posX;
		barco[1][1] = posY+1;
				
		barco[2][0] = posX;
		barco[2][1] = posY + 2;
		
		mapaO[barco[0][0]][barco[0][1]] = 1;
	}
	
	
	//Es void porque no devolvemos nada
	public static void rellenar() {
		
		for(int i=0; i<mapaV.length ; i++) {
			Arrays.fill(mapaV[i],'*');
			Arrays.fill(mapaO, 0);
		}
	}
//
//	public static void mostrarO() {
//		System.out.println("XX| 0 1 2 3 4 5 6 7 8 9");
//		
//		for(int i=0 ; i<mapaV[i].length ; i++) {
//			System.out.println(" " + mapaV[i][j] + " ");
//		}
//		System.out.println("\n");
//	}

}
