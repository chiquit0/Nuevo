package ApuntesTema5Fechas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class CalculoPermiso {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		// Para poner el formato de fecha que se desee
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//LocalDate fecha = null;
		
		System.out.println("Introduce una fecha");

		try {
			// En esta variable "fecha" se guarda la fecha que hemos introducido en el syso mediante el "ent.nextLine"
			// Al lado indicamos la variable df para que la fecha que hemos introducido salga con el formato que hemos especificado en la linea 13
			LocalDate fecha = LocalDate.parse(ent.nextLine(), df);
			
			//Aqui comparas el día de la fecha que te han introducido con el dia de la semana
			//En este caso fecha.getDayOfWeek ve en qué día de la semana cae la fecha que has introducido y comprueba que no es un sábado
			//Con DayOfWeek hacemos referencia a la clase enum para saber si el dia que hemos introducido es sábado
				if(fecha.getDayOfWeek() == DayOfWeek.SATURDAY) {
			//Si cae en sábado, aumentamos la fecha 2 días para que el permiso de lactancia comience al lunes siguiente		
					fecha = fecha.plusDays(2);
			//Con el domingo hacemos lo mismo, solo que aumentamos solo 1 día la fecha		
				}else if(fecha.getDayOfWeek() == DayOfWeek.SUNDAY) {
					fecha = fecha.plusDays(1);
				}
			//Con fecha.plusWeeks te suma la cantidad de fechas que especifiques a la fecha que se haya introducido por teclado
				//Acodarse siempre de ponerlo en el formato espeeificado arriba con .format
			System.out.println("Fecha de reincorporación " + fecha.plusWeeks(4).format(df));
			
			
			// Se introdujo por pantalla la fecha ""44/03/2022" y dio este error:
		}catch(DateTimeParseException ex) {
			System.out.println("Fecha no válida");
		}
	}

}
