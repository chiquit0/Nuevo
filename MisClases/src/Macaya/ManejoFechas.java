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
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Aqu� especifico el formate de fecha
																				// que quiero
		do {
			System.out.println("Introduce la fecha de nacimiento:");

			try {
				fecha = LocalDate.parse(ent.nextLine(), formato);
				// Si la fecha es correcta se acaba el bucle
				correcto = true;
				if (fecha.isAfter(hoy)) { // Para comparar fechas se usa .isAfter (por si la fecha es despu�s de la de
											// hoy, o .isBefore para lo contrario
					throw new Exception("No me enga�es con tu fecha");
				}

			} catch (DateTimeParseException ex) {
				System.out.println("Formato de fecha no v�lida, introduzca el formato correcto (dd/MM/yyyy)");
				// Si la fecha es incorrecta el bucle se repite
				correcto = false;
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
				correcto = false;
			}

		} while (!correcto);
		// Calcula diferencias entre fechas
		Period periodo = Period.between(fecha, hoy);
		//Aqu�  ense�o la fecha que he introducido
		System.out.println("Edad: " + periodo.getYears() + " a�os " + periodo.getMonths() + " meses "
				+ periodo.getDays() + " d�as.");

		DateTimeFormatter formatoDia = DateTimeFormatter.ofPattern("eeee");
		System.out.println("D�a: " + fecha.format(formatoDia));

		// Con el .between indico x cosa que necesite entre dos fechas.
		LocalDate proxCumple = fecha.plusYears(periodo.getYears() + 1);
		Period diasRest = Period.between(hoy, proxCumple);

		// ChronoUnits me da todos los d�as que quedan para el pr�ximo cumplea�os
		System.out.println("Quedan " + ChronoUnit.DAYS.between(hoy, proxCumple) + " d�as para el pr�ximo cumplea�os");
	
		//Zodiaco signo = Zodiaco.CANCER;
		
		System.out.println("Zodiaco " +  obtenerZodiaco(fecha).name());

	}

	public static LocalDate actA�o(LocalDate fecha,int anio) {
		LocalDate f = LocalDate.of(anio, fecha.getMonth(), fecha.getDayOfMonth());
		return f;
	}

	public static Zodiaco obtenerZodiaco(LocalDate fecha) {

		Zodiaco signo = null;
		Zodiaco [] signos = Zodiaco.values();
		for(int i=0; i<signos.length; i++) {
			if(entreFechas (fecha, actA�o(signos[i].getInicio(),fecha.getYear()), actA�o(signos[i].getFin(),fecha.getYear()))) {
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