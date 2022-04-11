package EjerciciosTema5;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class FiestasAnsw {

	private String nombre;
	private String lugar;
	private LocalDate fechaI;
	private LocalDate fechaF;
	
	public FiestasAnsw() {
		nombre = " ";
		lugar = " ";
		fechaI = null;
		fechaF = null;
	}
	
	public FiestasAnsw(String nombre, String lugar, LocalDate fechaI, LocalDate fechaF) {
		this.nombre = nombre;
		this.lugar = lugar;
		this.fechaI = fechaI;
		this.fechaF = fechaF;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public LocalDate getFechaI() {
		return fechaI;
	}

	public void setFechaI(LocalDate fechaI) {
		this.fechaI = fechaI;
	}

	public LocalDate getFechaF() {
		return fechaF;
	}

	public void setFechaF(LocalDate fechaF) {
		this.fechaF = fechaF;
	}

	public int getDur() {
		
		return (int)ChronoUnit.DAYS.between(fechaI, fechaF);
	}
	
	public boolean esEnVerano() {
		LocalDate veranoI = LocalDate.of(LocalDate.now().getYear(), 6, 20);
		LocalDate veranoF = LocalDate.of(LocalDate.now().getYear(), 9, 24);
		boolean verano = false;
		
		if(this.fechaI.isAfter(veranoI) && this.fechaI.isBefore(veranoF)) {
			verano = true;
		}else {
			verano = false;
		}
		return verano;
	}
	public String getDiaSemana(LocalDate fecha) {
		
		String dia = " ";
		
		switch(fecha.getDayOfWeek()) {
		
		case MONDAY: dia = "Lunes";
					break;
		case TUESDAY:dia = "Martes";
					break;
		case WEDNESDAY: dia = "Miércoles";
					break;
		case THURSDAY: dia = "Jueves";
					break;
		case FRIDAY: dia = "Viernes";
		
		default:
		}
		return dia;
	}
	
	public String toString() {
	
		return getNombre() + " " + getLugar() + " (" + getFechaI() + " " + getFechaF() + ") \n"
				+" dura " + getDur() + " días y empieza ";
	}

}
