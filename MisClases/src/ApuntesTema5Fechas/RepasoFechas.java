package ApuntesTema5Fechas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class RepasoFechas {

	public static void main(String[] args) {
		
		//Crear para calcular los dias de permiso que tiene un trabajador, sin contar sábados ni domingos
		
		
		LocalDate fecha =null;
		boolean correcta=true;
		String fechaI=" ";
		//Pide un formato de fecha determinado
		DateTimeFormatter ff= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner ent = new Scanner(System.in);
		
		do {
			try{
				System.out.println("Introduce la fecha");
				fechaI= ent.nextLine().replace('-', '/');		
				fecha=LocalDate.parse(fechaI, ff);
				
			}catch(DateTimeParseException ex) {
				System.out.println("Fecha erronea");
				correcta=false;
			}

		}while(correcta==false);
		
		//Existe una clase enum sobre esto
		if(fecha.getDayOfWeek().equals(DayOfWeek.SATURDAY)){
			fecha=fecha.plusDays(2);	
			
		}else if(fecha.getDayOfWeek().equals(DayOfWeek.SUNDAY)){
			fecha=fecha.plusDays(1);
		
		}else {
			
		}
		
		System.out.println("Tu permiso empieza el " + fecha.format(ff) + " y termina el: "+
				fecha.plusWeeks(16).format(ff));
	
		
	}		
}
