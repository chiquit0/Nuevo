package ApuntesTema1VariablesyBucles;

import java.util.Scanner;

public class AdivinaNum {

	public static void main(String[] args) {
		
//		int num= (int) ((Math.random() *5) + 1); //Asi se genera un numero aleatorio
//		int numEntrada=0;
//		boolean acierto=false;
//		Scanner ent = new Scanner(System.in);
//		System.out.println(num);
//				
//		System.out.println("Adivina el n�mero en " + i + " intentos");
//		numEntrada = ent.nextInt();
//			
//		if(numEntrada == num) {
//			System.out.println("Has acertado");
//		}else if(numEntrada > num) {
//			System.out.println("Has fallado, el n�mero es menor");
//		}else {
//			System.out.println("Has fallado, el n�mero es mayor");		
//		}		
//		
//	for(int i=5; i>0 ; i--) {
//		System.out.println("Adivina el n�mero en " + i + " intentos");
//		numEntrada = ent.nextInt();
//			
//		if(numEntrada == num) {
//			System.out.println("Has acertado");
//		}else if(numEntrada > num) {
//			System.out.println("Has fallado, el n�mero es menor");
//		}else {
//			System.out.println("Has fallado, el n�mero es mayor");		
//		}
//	}
//	if(!acierto) {
//		System.out.println("Has fallado, el n�mero era " + num);
		
		
		Scanner ent = new Scanner(System.in);
		int num = (int)(Math.random() * 100) + 1; //Genera un n�mero aleatorio entre 1 y 100
		int numEntrada=0;
		int intentos = 4;
		boolean acierto=false;
		
	do {
		System.out.println("Adivina el n�mero (" + intentos + " intentos)");
		 numEntrada = ent.nextInt();
		
		if(numEntrada == num) {
			System.out.println("Has acertado");
			acierto = true;
		}else if(numEntrada < num) {
			System.out.println("El n�mero era mayor");
		}else {
			System.out.println("El n�mero era menor");
		}
		
	
		intentos --;
	}while(intentos > 0 && !acierto);
	
	if(!acierto) {
		System.out.println("Has perdido, el n�mero era " + num);
	}
	
	
	
	} }
