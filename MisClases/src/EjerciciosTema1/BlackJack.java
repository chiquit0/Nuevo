package EjerciciosTema1;

import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		int num = (int) (Math.random() * 10) + 1;
		int carta = 0, jugador = carta, máquina = 0;
		boolean respuesta = true;
		boolean juego = true;
		
		System.out.println("¡Bienvenido al Black Jack!"
				+ "\n¡Es el turno del jugador!");
		while( jugador < 21 && juego==true) {
			System.out.println("¿Quieres coger una carta? Pon true para si o false para no.");
			respuesta = ent.nextBoolean();
		if (respuesta==true) {
			carta = (int) (Math.random() * 10) + 1;
			System.out.println("Te ha tocado un " + carta);
			jugador += carta;
			System.out.println("Tus cartas suman un valor de " + jugador);
		
		}else {
			System.out.println("¡Tu turno ha acabado!");
			juego=false;
		}	
	}
	
		System.out.println("¡Es el turno de la máquina!");
		for(int i=0; máquina < 19; i++) {
			if(máquina < 19) {
				carta=(int) (Math.random() * 10) + 1;
				System.out.println("La máquina ha recibido un " + carta);
				máquina += carta;
				System.out.println("La máquina tiene " + carta);
			}
		System.out.println("La máquina tiene un total de " + máquina);
		}
	System.out.println("¡El juego ha terminado!");
	if(jugador <= 21 && jugador > máquina || máquina > 21) {
		System.out.println("¡Ha ganado el jugador con una puntuación de " + jugador + "!");
	}else if(máquina <= 21 && máquina > jugador || jugador > 21) {
		System.out.println("¡Ha ganado la máquina con una puntuación de " + máquina + "!");
	}else if(jugador > 21 && máquina > 21) {
		System.out.println("¡No hay ganador!");
	}else {
		System.out.println("¡Hay empate!");
	}
	}
}
