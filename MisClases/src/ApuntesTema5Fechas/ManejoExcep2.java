package ApuntesTema5Fechas;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoExcep2 {

	public static void main(String[] args) {
	
		Scanner ent = new Scanner(System.in);
		int num = 0;
		
		
		try {
			System.out.println("Introduce un número:");
			num = ent.nextInt();
			if(num%2 == 0) {
				System.out.println("Todo bien");
			}else {
				throw new ArithmeticException(); //Throw lanza manualmente una excepción
			}
			
		}catch(InputMismatchException ex) {
			System.out.println("Algo ha ido mal");
		}catch(ArithmeticException ex) {
			System.out.println("Algo ha ido mal");
		}
		finally {
			System.out.println("Fin del bloque"); //Es opcional, sirve para cerrar el bucle
		}
		
		
		
//*********************************************************************************************************************************************************************
//			GENERACION DE UNA FECHA ALEATORIA CON CONTROL DE ERRORES
//*********************************************************************************************************************************************************************
		
//		int year = 2022,  month = 0, day = 0, veces = 0;
//		LocalDate fecha = null;
//		boolean correcta = true;
		
		
//		do {
//			veces++; //Contando cuanto tarda en generar una fecha correcta
//			month = (int)(Math.random()*31 + 1);
//			day = (int)(Math.random()*31 + 1);
//			try {
//				fecha = LocalDate.of(year, month, day);
//				System.out.println(fecha + " " + veces);
//				correcta = true; //Si la fecha es correcta el bucle acaba, ya que está indicando que el boolean "correcta" es true.
//			}catch(DateTimeException ex) {
//				correcta = false; //Como la fecha no es correcta, "correcta" es igual a false y como estamos dentro de un bucle do while, se vuelve a repetir el bucle hasta que sea true
//			}
//			
//		}while(correcta == false);
	}

}
