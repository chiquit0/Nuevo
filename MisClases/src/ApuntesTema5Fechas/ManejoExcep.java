package ApuntesTema5Fechas;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoExcep {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		int num1 = 0, num2 = 0, res = 0;
		boolean error = false;

		do {
			try {
				System.out.println("Introduce un número");
				num1 = ent.nextInt();
				System.out.println("Introduce otro número");
				num2 = ent.nextInt();

				res = num1 / num2;
				System.out.println("El resultado de dividir " + num1 + " entre " + num2 + " es igual a " + res);
			}
//				}catch(ArithmeticException ex) {
//					System.out.println("Error: " + ex.getMessage());
//					error = true;
//				}catch(InputMismatchException ex) {
//					System.out.println("Error: " + ex.getMessage());
//					error = true;
//					ent.nextLine();
//				}
			catch (Exception ex) {
				System.out.println("El último syso de error");
				error = true;
				ent.nextLine();
			}
		} while (error);

//		LocalDate fecha = null;
//		
//		try {
//		
//			fecha = LocalDate.of(2002,  31, 15);
//		
//		}catch(DateTimeException ex) {
//			System.out.println(ex.getMessage()); //Nos muestra un mensaje de error cuando algún número de la fecha está mal
//		}
//		
//		System.out.println(fecha);

//		int num1 = 30;
//		int num2 = 2;
//		int res = 0;
//		
//		try {
//			res = num1/num2;
//		
//		}catch(ArithmeticException ex) {
//			System.out.println(ex.getMessage());	
//		}
//		System.out.println(res);

	}
}