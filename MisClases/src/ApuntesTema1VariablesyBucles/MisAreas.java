package ApuntesTema1VariablesyBucles;

public class MisAreas {

	public static void main(String[] args) {
		
		//1 - cuadrado ; 2 - triangulo ; 3 - circulo	
		//Opción de la figura
		
		int opcion = 2;
		
		if(opcion == 1) {
		
		}else if(opcion == 2) { 
			
		}else if(opcion == 3) { 
		}
		
//		int opcion = 3;
		switch(opcion) {
			
			case 1:
				int lado = 4;
				System.out.println("El área de un cuadrado de ancho " + lado + " es " + (lado*lado));
				break;
			case 2:
				float base = 3 , altura = 5;
				System.out.println("El área de un triángulo de base " + base + " y altura "+ altura +" es " + (base*altura)/2);
				break;
			case 3:
				float radio = 12;
				System.out.println("El área de una circunferencia es " + (2* Math.PI *radio));
				break;
			default:
				System.out.println("Opción no valida");
		}
	
	}

}
