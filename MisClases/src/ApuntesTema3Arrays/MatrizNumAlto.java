package ApuntesTema3Arrays;

import java.util.Arrays;

public class MatrizNumAlto {

	public static void main(String[] args) {
		
		int[][] matriz = new int[aleatorio(5,10)][aleatorio(5,10)];
		
		rellenar(matriz);  ///Llamada al método
		mostrar(matriz);
		busqueda(matriz);
		
		Arrays.fill(matriz[0], 5);
	
	}
	
	public static void busqueda(int [][]matriz) {  //() parámetros de entrada, variables de tipo primitivo.   //Cabecera o definición.
		int mayor = 0, menor = 101;
		String posMenor = " ", posMayor = " ";
		
		for(int i=0 ; i<matriz.length ; i++) {  //Se utiliza "i" para mostrar la posición de un elemento.
			for(int j=0 ; j < matriz[i].length ; j++) {
				if(matriz[i][j] > mayor) {
					mayor = matriz[i][j];
					posMayor = i + " " + j;
				}
				
				if(matriz[i][j] < menor) {
					menor = matriz[i][j];
					posMenor = i + " " + j;
				}
			}
		}
	
		System.out.println("El mayor es " + mayor + "(" + posMayor + ")");
		System.out.println("El mayor es " + menor + "(" + posMenor + ")");
	}
	
	public static int aleatorio(int num1, int num2) {
		int numAle = (int)(Math.random() * (num2 + 1 - num1) ) + num1;
		return numAle;
	
	}
	
	public static void rellenar(int [][]matriz) {
		for(int i=0 ; i<matriz.length ; i++) { //Bucle que recorre las filas
			for(int j=0 ; j < matriz[i].length ; j++) { //Bucle que recorre las columnas
				matriz[i][j] = aleatorio(1,100);
			}
		}
	}

	public static void mostrar(int [][] matriz) {
		System.out.println(matriz.length + " filas - " + matriz[0].length + " columnas");
		for(int[] fila : matriz ) {
			System.out.println(Arrays.toString(fila));
		}
	}

}
