package EjerciciosTema5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

import ApuntesTema4ClasesyObjetos.Productos;

public class PruebaFiestas {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		ArrayList<Fiestas> lista = new ArrayList<Fiestas>();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaI = null;
		LocalDate fechaF = null;
		boolean seguir = true;
		LocalDate veranoI = LocalDate.parse("21/06/2022",formato);
		LocalDate veranoF = LocalDate.parse("23/09/2022",formato);
		addFiesta(lista);

	}

	public static void addFiesta(ArrayList<Fiestas> lista) {

		Scanner ent = new Scanner(System.in);
		String nomFiesta = " ";
		String nomLugar = " ";
		LocalDate fechaI = null;
		LocalDate fechaF = null;
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate veranoI = LocalDate.parse("2022-6-21");
		LocalDate veranoF = LocalDate.parse("23/09/2022");
		
		char a�adir = ' ';
		boolean seguir = true;

		do {
			System.out.println("Introduce el nombre de la fiesta: ");
			nomFiesta = ent.nextLine();
			System.out.println("Introduce el lugar de la fiesta: ");
			nomLugar = ent.nextLine();
			do {
				try {
					System.out.println("Introduce la fecha de inicio de la fiesta: ");
					fechaI = LocalDate.parse(ent.nextLine(), formato);
				}catch (DateTimeParseException ex) {
					System.out.println("Fecha no v�lida, por favor introduzca la fecha en el formato correcto (dd/MM/yyyy)");
					seguir = false;
				}
			}while (seguir == false);
			do {
				try {
					System.out.println("Introduce la fecha de final de la fiesta: ");
					fechaF = LocalDate.parse(ent.nextLine(), formato);
				}catch(DateTimeParseException ex) {
					System.out.println("Fecha no v�lida, por favor introduzca la fecha en el formato correcto (dd/MM/yyyy)");
					seguir = false;
				}
			}while (seguir == false);
			
			lista.add(new Fiestas(nomFiesta, nomLugar, fechaI, fechaF));

			System.out.println("�Quieres a�adir otra fiesta? (S/N)");
			a�adir = ent.nextLine().toUpperCase().charAt(0);
			
		}while (a�adir == 'S');

		for (Fiestas f : lista) {
			System.out.println(lista);
//		Period periodo = Period.between(fechaI, fechaF);
//		System.out.println("La duraci�n de " + nomFiesta + " es de " + periodo.getDays() + " d�as.");	
		}
		for(Fiestas f : lista) {
		System.out.println("La fiesta " + nomFiesta + " empieza en " + fechaI.getDayOfWeek() + " y acaba en " + fechaF.getDayOfWeek());
		}
//		System.out.println("La fiesta " + nomFiesta + " empieza en " + fechaI.getDayOfWeek() + " y acaba en " + fechaF.getDayOfWeek());
		
//		if(fechaI.isAfter(veranoI) || fechaF.isBefore(veranoF)) {
//			System.out.println("La fecha " + nomFiesta + " coincide con el verano");
//		}
	}
}
