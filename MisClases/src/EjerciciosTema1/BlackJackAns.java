package EjerciciosTema1;

import java.util.Scanner;

public class BlackJackAns {

	public static void main(String[] args) {
		
		Scanner ent =  new Scanner(System.in);
		int totalJ=0, totalB=0, carta=0;
		boolean parar = false;
		String respuesta = "";
		
		System.out.println("Turno del jugador");
		//Turno del jugador
		do {
			carta = (int) (Math.random() * 10) + 1;
			
			totalJ += carta;
		    //+= incrementa el valor de la izquierda con el de la derecha
			System.out.println("Has sacado un " + carta + ". Llevas acumulado " + totalJ);
		
			System.out.println("¿Quieres seguir? S/N");
			respuesta = ent.nextLine();
			
			if(! respuesta.equalsIgnoreCase("s")) {
				parar = false;
			}
				
		}while(totalJ < 21 && parar == false);

		do {
			System.out.println("Turno de la banca");
	
            carta = (int) (Math.random() * 10) + 1;
			
			totalB += carta;
			System.out.println("La banca saca un " + carta + ". Lleva acumulado " + totalJ);
		
	
		}while(totalB < 16);
		
		
		//Pierden los 2:
		if(totalJ > 21 && totalB > 21) {
			System.out.println("No hay ganador.");
		}else if(totalJ == totalB) {
			System.out.println("Hay empate.");
		}else if((totalJ <= 21 && totalJ > totalB) || (totalJ <= 21 && totalB > 21)) {
			System.out.println("Gana el jugador");
		//}else
	}
} }
