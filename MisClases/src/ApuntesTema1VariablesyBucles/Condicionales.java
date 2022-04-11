package ApuntesTema1VariablesyBucles;

public class Condicionales {

	public static void main(String[] args) {
		
//		int numero = 12;
		
//		if ( numero > 10 ) {
				//linea de ejecución si la condición es verdadera
//				System.out.println(numero + " es mayor de 10");
//		}else if (numero == 10){ 
//			System.out.println(numero + " es igual a 10");
//		}else { 
//			System.out.println(numero + " es menor a 10");
//		}
		
		
//		System.out.println("fin");
//**************************************************************************************************************			
		//EJERCICIO: comparar 2 numeros e indicar cual es el mayor o por el contario si son iguales
		//Indicar si un numero es par o impar 
		//Dado un numero de X (máximo 5) digitos, mostrar por pantalla cuanto vale X
		
		//PRIMER EJERCICIO PAR O IMPAR
//		int numero = 41;
	
//		int resto = numero % 2 ;
//		if(resto == 0) {  //if((numero % 2) == 0) {
//			System.out.println("Es par");
//		}else {
//			System.out.println("Es impar");
//**************************************************************************************************************		
		//SEGUNDO EJERCICIO INDICA EL MAYOR
//		int numero1 = 0, numero2 = 0;
		
//		if(numero1 > numero2) {
//			System.out.println(numero1 + "es mayor que " + numero2);
//		}else if(numero2 > numero1) {
//			System.out.println(numero2 + "es mayor que " + numero1);
//		}else {
//			System.out.println(numero2 + "es igual que " + numero1);
//		}
//***************************************************************************************************************
		//DADO UN NUMERO X, INDICAR LAS CIFRAS QUE LO COMPONE
		
		int entrada = 5;
		
		if(entrada < 10) {
			System.out.println(entrada + " tiene 1 cifra");
		}else if(entrada < 100) {
			System.out.println(entrada + " tiene 2 cifras");
		}else if(entrada < 1000) {
			System.out.println(entrada + " tiene 3 cifras");
		}else if(entrada < 10000) {
		    System.out.println(entrada + " tiene 4 cifras");
				}
	}
		
	
		
} 
