package ApuntesTema3Arrays;

public class ApuntesVideo {

	public static void main(String[] args) {
		
	//SINTAXIS DE ARRAYS: int[] nombre_matriz= { 15, 25, 8, -7, 92 };
				
		int[] miMatriz = { 5, 38, -15, 92, 71, 38, 2, 45};
	
	for(int i=0;i<miMatriz.length;i++) { //con .length el bucle for recorre toda la matriz aunque no se haya puesto la longitud concreta
		System.out.println("Valor del índice " + i + " = " + miMatriz[i]);
	}
	
	}

}
