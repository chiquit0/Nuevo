package ApuntesTema2M�todos;

import java.util.Scanner;

public class MisAreas {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		int opcion = 0;
		
		System.out.println("Elige una figura para el c�lculo del �rea: \n"
				+ "1�) Cuadrado \n"
				+ "2�) Tri�ngulo \n"
				+ "3�) C�rculo ");
		
		opcion = ent.nextInt();
		
		switch(opcion) {
			
			case 1:
				System.out.println("El area del cuadrado es: " + areaCuadrado());
				break;
			case 2:
				System.out.println("El area del tri�ngulo es: " + areaTriangulo());
				break;
			case 3:
				System.out.println("El area del c�rculo es: " + areaCirculo());
				break;
			default:
				System.out.println("No existe esa opci�n.");
			
			}
			
//			System.out.println("El area de la figura es: " + area);
		
		}

		public static float areaCuadrado() {
			Scanner ent = new Scanner(System.in);
			float lado = 0.0f;
			
			System.out.println("Introduce el lado del cuadrado:");
			lado = Float.parseFloat(ent.nextLine().replace(',','.'));
			return (float)Math.pow(lado, 2);

		}
		
		public static float areaTriangulo() {
			Scanner ent = new Scanner(System.in);
			float altura = 0.0f, base = 0.0f;
			
			System.out.println("Introduce la altura del tri�ngulo:");
			altura = Float.parseFloat(ent.nextLine().replace(',','.'));
			System.out.println("Introduce la base del tri�ngulo: ");
			base = Float.parseFloat(ent.nextLine().replace(',','.'));
			
			return (base * altura) / 2;
			
			
		}
		
		public static float areaCirculo() {
			Scanner ent = new Scanner(System.in);
			float radio = 0.0f;
			
			System.out.println("Introduce el radio del c�rculo:");
			radio = Float.parseFloat(ent.nextLine().replace(',','.'));
			
			return (float)(2 * Math.PI * radio);
			
	
		
		}
	}