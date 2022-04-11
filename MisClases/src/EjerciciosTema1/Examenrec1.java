package EjerciciosTema1;

//import java.util.Scanner;

public class Examenrec1 {

	public static void main(String[] args) {
		
//		Scanner ent = new Scanner(System.in);
//		
//		int peso = 0, plazas = 0;
//			
//		//Entra el coche
//		System.out.println("Bienvenido al parking."
//					+ "\nIntroduzca el peso de su vehículo:");
//		peso = ent.nextInt();
//				
//		if(peso < 500) {
//			System.out.println("Puedes estacionarte en la primera planta.");
//		}else if(peso < 500 && plazas < 0) {
//			System.out.println("Puedes estacionarte en la segunda planta.");	
//		}else if(peso > 500) {
//			System.out.println("Puedes estacionarte en la tercera planta.");
//		}
//	**************************************SOLUCION*****************************************************
		
		float peso = 0.0f;
		int planta1 = 0, planta2 = 150, planta3 = 100;
		
		peso = (float)(Math.random() * 800) + 100; //Para generar un peso aleatorio
			System.out.println(peso);
		
			if(peso < 500 && planta1 > 0) {
			System.out.println("Aparque en la planta 1");
			planta1 --; //Para restarle las plantas ocupadas
		}else if(peso < 500 && planta2 > 0) {
			System.out.println("Aparque en la planta 2");
			planta2 --;
		}else if(peso >= 500 && planta3 > 0) {
			System.out.println("Aparque en la planta 3");
			planta3 --;
		}else {
			System.out.println("No hay plazas libres");
		}
	}
}
