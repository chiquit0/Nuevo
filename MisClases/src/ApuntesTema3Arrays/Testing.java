package ApuntesTema3Arrays;

import java.util.Arrays;

public class Testing {

	public static void main(String[] args) {
	
//		int [][] ejemplo = new int[][] { {1, 2, 55, 66}, {4, 51, 6}, {7, 8, 9} };
		int[][] matriz = new int[4][4];

		
//		for(int i=0 ; i < ejemplo.length ; i++) {
//			for(int j=0 ; j < ejemplo[i].length ; j++) {
//				System.out.println(ejemplo[i][j]);
		
		rellenar(matriz);
		mostrar(matriz);
		
		}
		
	public static void rellenar(int[][] miArray) {
		
		int cont = (miArray.length * miArray.length)  - 1;
		for(int i=0 ; i<miArray.length ; i++) {
			for(int j=0 ; j < miArray[i].length ; j++) {
				miArray[i][j] = cont;
				cont--;
			}
		
		}
		
	}
	
	public static void mostrar(int[][] tuArray) {
		
		// for(objeto iterador : lista) {
//		for(int[] fila : tuArray) {
//			System.out.println(Arrays.toString(fila));
		
		for(int i=0 ; i<tuArray.length ; i++) {
			for(int j=0 ; j < tuArray[i].length ; j++) {
				System.out.println(" " + tuArray[i][j] + " ");
			}
			System.out.println("\n");
			
	
	}
			
	
	}

}
