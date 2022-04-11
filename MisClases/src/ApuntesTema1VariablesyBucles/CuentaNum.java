package ApuntesTema1VariablesyBucles;

import java.util.Scanner;

public class CuentaNum {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		int num=0, contador=0, mayor=0;
		String cadena="";
		
		var miVar = "Hola Mundo";
		var nume = 3;
		
		do { 
			System.out.println("Introduce un número positivo, negativo para parar");
			num = ent.nextInt();
			
			if(num >= 0) {
				contador ++;
				cadena += num + ","; //cadena = cadena + num + ","
			}
			
			if(num > mayor) {
				mayor= num;
			}
			
			
		}while(num > 0); 
		
		System.out.println("El número total es " + contador);
		System.out.println("Los números introducidos son " + contador);
		
		System.out.println("El mayor es " + mayor);
		
	}
	
}
