package ApuntesTema5Fechas;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Parquimetro {

	public static void main(String[] args) {
	
		//Source - Format
		Scanner ent = new Scanner(System.in);
		int hora = 0, min = 0;
		boolean Hvalida = true, Mvalida = true;
		
		do {
			try {
				if(!Hvalida) {
					System.out.println("Introduce la hora de irte a la cama: ");
					hora = ent.nextInt();
				}
				if(!Mvalida) {
					System.out.println("Introduce el minuto de irte a la cama: ");
					min = ent.nextInt();
				}
				
				LocalTime hour = LocalTime.of(hora, min);
				Hvalida = true;
				Mvalida = true;
				
				System.out.println("Te vas a la cama a las " + hour);
			}catch (DateTimeException ex) {
				if(ex.getMessage().contains("Minute")) {
					Hvalida = false;
				}else {
					Mvalida = false;
				}
			}
		}while(!Hvalida || !Mvalida);
		
		
		
		//Introducir la hora fin del establecimiento (12:30)
		//Calcular el precio del estacionamiento:
			//Menos de 1 hora - 0'05ct/min
			//1 hora o más 0'02ct/min
//*******************************************************************************************************************************************
//                               PARQUIMETRO
//*******************************************************************************************************************************************
		
//		Scanner ent = new Scanner(System.in);
//		LocalTime horaS = null;
//		String entrada = " ";
//		float total = 0.0f;
//		boolean error = true;
//		
//		do {
//			try { 
//				System.out.println("Introduce la hora de salida");
//				entrada = ent.nextLine();
//				horaS = LocalTime.parse(entrada); //El .parse convierte el String en el que sale la hora "12:30" a un LocalTime
//				error = true;
//			}catch(DateTimeParseException ex) {
//				System.out.println("Error en la hora");
//				error = true;
//			}
//
//		}while(!error); 
//			
//		long minutosTotales = Duration.between(LocalTime.now(), horaS).toMinutes();
//				
//		if(minutosTotales >= 60) {
//			total = 0.02f * minutosTotales;
//		}else {
//			total = 0.05f * minutosTotales;
//		}
//			
//		System.out.println("A pagar " + total + " por " + minutosTotales + " minutos.");	
	}
}
