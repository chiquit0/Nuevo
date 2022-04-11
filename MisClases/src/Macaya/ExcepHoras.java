package Macaya;

import java.text.DecimalFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ExcepHoras {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		//Se instancian las horas en 0 para que luego el usuario las meta por teclado
		LocalTime horaE = LocalTime.of(0, 0);
		LocalTime horaS = LocalTime.of(0, 0);
		float paga = 0.0f;
		long horas = 0, minutos = 0;

		do{
			System.out.println("Introduce la hora de entrada:");
			horaE = validarHora(ent.nextLine());
			if (horaE == null) {
				System.out.println("La hora no es correcta. Introduzca la hora en el formato correcto (hh:mm)");
			}
		}while (horaE == null);

		do{
			System.out.println("Introduce la hora de salida:");
			horaS = validarHora(ent.nextLine());
			if (horaS == null) {
				System.out.println("La hora no es correcta. Introduzca la hora en el formato correcto (hh:mm)");
			} else {
				//Si la hora de entrada es mayor que la hora de salida entonces el programa falla y vuelve a empezar el bucle
				if (horaE.isAfter(horaS)) {
					System.out.println("La hora introducida no es valida");
					horaS = null;
				}
			}

		}while (horaS == null);
		System.out.println("La hora de entrada es " + horaE + " y la hora de salida es " + horaS);

		Duration duracion = Duration.between(horaE, horaS);
		horas = duracion.toHours();
		minutos = duracion.toMinutes();
		//Aqui instanciamos como queremos que salga el formato de euros, la almohadilla representa la entrada opcional de un número y el 0 la entrada obligatoria
		DecimalFormat formato = new DecimalFormat("#,###.00");
		System.out.println(formato.format(calcularPaga(minutos)) + "€");
	}

	public static LocalTime validarHora(String texto) {

		//Este método es para validar la fecha y especificar su formato
		LocalTime fecha = null;
		//Aqui se especifica el formato de la hora
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("hh:mm");

		try{
			fecha = LocalTime.parse(texto);
		}catch (DateTimeParseException ex) {
			fecha = null;
		}
		return fecha;

	}

	public static float calcularPaga(long minutos) {
		//Con este método creamos la fórmula para calcular la paga
		//1 hora son 12€, entonces dividimos los 12 mins entre 60 y lo multiplicamos por los minutos que tengamos
		float paga = 12f/60*minutos;
		return paga;
	}
}
