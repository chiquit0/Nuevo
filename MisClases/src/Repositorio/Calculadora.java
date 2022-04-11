package Repositorio;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		int opcion = 0;
		float op1 = 0.0f, op2 = 0.0f;
		do {
			System.out.println("Calculadora 3000 \n" + 
					"1º) Suma \n" +
					"2º) Resta \n" +
					"3º) Multiplicación \n" +
					"4º) División \n" +
					"5º) Salir \n");
		
			opcion = ent.nextInt();
			if(opcion >= 1 && opcion <= 4) {
				System.out.println("Introduce un número");
				op1= ent.nextFloat();
				System.out.println("Introduce el otro número");
				op1= ent.nextFloat();
			}
				
			switch(opcion) {
				
				case 1:
					System.out.println(op1 + " + " + op2 + " = " + (op1+op2));
					break;
					
				case 2:
					System.out.println(op1 + " - " + op2 + " = " + (op1-op2));
					break;
					
				case 3:
					System.out.println(op1 + " * " + op2 + " = " + (op1*op2));
					break;
					
				case 4:
					if(op2 !=0) {
					  System.out.println(op1 + " / " + op2 + " = " + (op1/op2));
					}else {
						System.out.println("La división entro cero no es posible");
					}
					  break;
					  
				case 5:
					System.out.println("Adiós");
					break;
					
				default:
					System.out.println("Opción no válida");
				}
			
		}while(opcion !=5);
	}
	public static float suma(float op1, float op2) {
		float resul=0f;
		resul= op1+op2;
		return resul;
		
	}
	   public static float restar(float op1, float op2) {
		   float resul=0f;
			resul= op1-op2;
			return resul;
	   }
	   public static float multiplicar(float op1, float op2) {
		   float resul=0f;
			resul= op1*op2;
			return resul;
	    }
	   public static float dividir(float op1, float op2) {
		   float resul=0f;
			resul= op1/op2;
			return resul;
	   }
}
