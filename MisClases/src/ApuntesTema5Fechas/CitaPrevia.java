package ApuntesTema5Fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class CitaPrevia {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		//Con LocalTime.of se especifica la hora que se necesite
		LocalTime horaI = LocalTime.of(9, 0);
		LocalTime horaF = LocalTime.of(13, 0);
		LocalDateTime cita = null;
		
		System.out.println("Horario comercial de " + horaI + " a " + horaF + "\n"
				+ "Seleccione la hora de la cita");

		try { 
			cita = LocalDateTime.of(LocalDate.now(), LocalTime.parse(ent.nextLine()));
	
			if(cita.toLocalTime().isAfter(horaI) || cita.toLocalTime().isBefore(horaF)) {
//				cita = LocalDateTime.of(cita.plusDays(1), LocalTime.of(15, 00));
			}
			
			System.out.println("Hora de la cita " + cita);
			
		}catch(Exception ex ) {
			System.out.println("Error en la hora de la cita");
		}
		}

}
