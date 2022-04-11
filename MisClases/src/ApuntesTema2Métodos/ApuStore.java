package ApuntesTema2Métodos;

import java.util.Scanner;

public class ApuStore {

	public static void main(String[] args) {
		
			Scanner ent = new Scanner(System.in);
			int unidad = 0;
			float precio = 0.0f, total = 0.0f;
			char categoria = ' ';
			
						
			System.out.println("Introduce unidades: ");
			unidad = ent.nextInt();
			System.out.println("Introduce cantidad: ");
			precio = ent.nextFloat();
			System.out.println("Introduce categoria: ");
			categoria = ent.next().toUpperCase().charAt(0);
			
			
			total = calculoTotal(unidad, precio, categoria);
			System.out.println("A cobrar: " + total);
	
	}

	public static float calculoTotal(int unidad, float precio, char categoria) {
		float total = 0.0f;
		float descuento = 0.0f;
		
		if(categoria == 'B') {
			total = unidad * precio * 0.95f;
		}else if(categoria == 'C') {
			total = unidad * precio * 0.90f;
		}else {
			total = unidad * precio;
//      }else {
			System.out.println("Categoría incorrecta, sin descuento.");
		}
		
		
		
		return total;
	
	}
}
