package EjerciciosTema1;

import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		int num = (int) (Math.random() * 10) + 1;
		int carta = 0, jugador = carta, m�quina = 0;
		boolean respuesta = true;
		boolean juego = true;
		
		System.out.println("�Bienvenido al Black Jack!"
				+ "\n�Es el turno del jugador!");
		while( jugador < 21 && juego==true) {
			System.out.println("�Quieres coger una carta? Pon true para si o false para no.");
			respuesta = ent.nextBoolean();
		if (respuesta==true) {
			carta = (int) (Math.random() * 10) + 1;
			System.out.println("Te ha tocado un " + carta);
			jugador += carta;
			System.out.println("Tus cartas suman un valor de " + jugador);
		
		}else {
			System.out.println("�Tu turno ha acabado!");
			juego=false;
		}	
	}
	
		System.out.println("�Es el turno de la m�quina!");
		for(int i=0; m�quina < 19; i++) {
			if(m�quina < 19) {
				carta=(int) (Math.random() * 10) + 1;
				System.out.println("La m�quina ha recibido un " + carta);
				m�quina += carta;
				System.out.println("La m�quina tiene " + carta);
			}
		System.out.println("La m�quina tiene un total de " + m�quina);
		}
	System.out.println("�El juego ha terminado!");
	if(jugador <= 21 && jugador > m�quina || m�quina > 21) {
		System.out.println("�Ha ganado el jugador con una puntuaci�n de " + jugador + "!");
	}else if(m�quina <= 21 && m�quina > jugador || jugador > 21) {
		System.out.println("�Ha ganado la m�quina con una puntuaci�n de " + m�quina + "!");
	}else if(jugador > 21 && m�quina > 21) {
		System.out.println("�No hay ganador!");
	}else {
		System.out.println("�Hay empate!");
	}
	}
}
