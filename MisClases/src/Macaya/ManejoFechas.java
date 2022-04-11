package Macaya;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ManejoFechas {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		LocalDate fecha = null;
		LocalDate hoy = LocalDate.now(); // La fecha de hoy
		boolean correcto = false;
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Aquí especifico el formate de fecha
																				// que quiero
		do {
			System.out.println("Introduce la fecha de nacimiento:");

			try {
				fecha = LocalDate.parse(ent.nextLine(), formato);
				// Si la fecha es correcta se acaba el bucle
				correcto = true;
				if (fecha.isAfter(hoy)) { // Para comparar fechas se usa .isAfter (por si la fecha es después de la de
											// hoy, o .isBefore para lo contrario
					throw new Exception("No me engañes con tu fecha");
				}

			} catch (DateTimeParseException ex) {
				System.out.println("Formato de fecha no válida, introduzca el formato correcto (dd/MM/yyyy)");
				// Si la fecha es incorrecta el bucle se repite
				correcto = false;
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
				correcto = false;
			}

		} while (!correcto);
		// Calcula diferencias entre fechas
		Period periodo = Period.between(fecha, hoy);
		//Aquí  enseño la fecha que he introducido
		System.out.println("Edad: " + periodo.getYears() + " años " + periodo.getMonths() + " meses "
				+ periodo.getDays() + " días.");

		DateTimeFormatter formatoDia = DateTimeFormatter.ofPattern("eeee");
		System.out.println("Día: " + fecha.format(formatoDia));

		// Con el .between indico x cosa que necesite entre dos fechas.
		LocalDate proxCumple = fecha.plusYears(periodo.getYears() + 1);
		Period diasRest = Period.between(hoy, proxCumple);

		// ChronoUnits me da todos los días que quedan para el próximo cumpleaños
		System.out.println("Quedan " + ChronoUnit.DAYS.between(hoy, proxCumple) + " días para el próximo cumpleaños");
	
		//Zodiaco signo = Zodiaco.CANCER;
		
		System.out.println("Zodiaco " +  obtenerZodiaco(fecha).name());

	}

	public static LocalDate actAño(LocalDate fecha,int anio) {
		LocalDate f = LocalDate.of(anio, fecha.getMonth(), fecha.getDayOfMonth());
		return f;
	}

	public static Zodiaco obtenerZodiaco(LocalDate fecha) {

		Zodiaco signo = null;
		Zodiaco [] signos = Zodiaco.values();
		for(int i=0; i<signos.length; i++) {
			if(entreFechas (fecha, actAño(signos[i].getInicio(),fecha.getYear()), actAño(signos[i].getFin(),fecha.getYear()))) {
				signo = signos[i];
			}
		}
		
		return signo;
	}
	
	public static boolean entreFechas(LocalDate fecha, LocalDate inferior, LocalDate superior) {
		
		inferior = inferior.minusDays(1);
		superior = superior.plusDays(1);
		
		
		if(fecha.isBefore(superior)&& fecha.isAfter(inferior)) 
			return true;
		return false;
	}
		
} 