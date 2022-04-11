package EjerciciosTema1;

import java.util.Scanner;

public class lmao {

	public static void main(String[] args) {
		int  carta=0, jugador=carta, casa = 0;
		Scanner consola= new Scanner(System.in);
		boolean respuesta= true;
		boolean juego=true;
		
		//turno del jugador
			System.out.println("¡Bienvenido al Black Jack!"
					+ "\nTurno del jugador.");
			while(jugador < 21 && juego==true) {
				System.out.println("¿Quieres carta? true para si, false para no");
				respuesta = consola.nextBoolean();
				if(respuesta==true) {
					
					carta=(int) (Math.random() * 10) + 1;
					//para saber qué carta le ha tocado
					System.out.println("La carta es: " + carta);
					//la suma de sus cartas
					jugador += carta;
					System.out.println("Ahora tus cartas suman: " + jugador );
				
				}else {
					System.out.println("Has terminado");
					juego=false;
				}
			}
		
		
		System.out.println("La suma de tus cartas es " + jugador + "\n");
		
		//Turno de la casa
		
		System.out.println("Es el turno de la casa");
		for(int i=0; casa<16; i++) {
			if(casa<16) {
				carta=(int) (Math.random() * 10) + 1;
				//la carta que le ha tocado
				//System.out.println("Teha tocado una carta de " + carta + " puntos");
				//la suma de sus cartas
				casa += carta;
				//System.out.println("Ahora tus puntos son: " + casa);
			}
			
		}
		System.out.println("Las cartas de la casa suman: " + casa);
		
		if(jugador>21 && casa>21) {
			System.out.println("No gana nadie");
		}else if( casa<=21 && casa> jugador || jugador > 21) {
			System.out.println("Gana la casa con " + casa + " puntos");
		} else if(jugador<=21 && jugador > casa || casa >21){
			System.out.println("Jugador gana con " + jugador + " puntos");
		}else {
			System.out.println("Hay empate");
		}
	}

}
