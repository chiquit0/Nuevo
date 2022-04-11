package Macaya;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RepasoArrays {

	public static void main(String[] args) {
		//Un array de longitud 5 donde vaya introduciendo n�meros pero no se pueden repetir
		Scanner ent = new Scanner(System.in);
		int [] num = new int [5];
		int n = 0;
		boolean existe = true;
		
		do {
			existe = false;
			System.out.println("Introduce un n�mero:");
			int a = ent.nextInt();
			
			for(int i=0 ; i<n ; i++) {
				if(num[i]==a) {
					System.out.println("El n�mero ya est� en el array");
					existe = true;
					break;
				}
					
			}
			if(!existe) {
				num[n] = a;
				n++;
			}

		}while(n<5);
		Arrays.sort(num); //Arrays.sort ordena los n�meros del array de manera ascendente
		System.out.print("Los n�meros dentro del array son : ");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
	}
}
