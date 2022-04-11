package EjerciciosTema1;

import java.util.Scanner;

public class EjsRepaso6 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		final float iva = 0.21f; //Constante
		float precio = 0.0f;
		float precioFinal = 0.0f;
		
//		DecimalFormat df = new DecimalFormat("##,##");
		System.out.println("Introduce el precio del producto");
		
		String price = ent.nextLine();
		precio = Float.parseFloat(ent.nextLine().replace(',','.'));
		
//		precio = Float.parseFloat(price);
		
		precioFinal = precio + (precio * iva);
		
//		System.out.println("El precio final es " + df.format(precioFinal1));
		
		

	}

}
