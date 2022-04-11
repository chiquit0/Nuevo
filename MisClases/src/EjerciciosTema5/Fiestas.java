package EjerciciosTema5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Fiestas {
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	//Atributos
	private String nomFiesta;
	private String nomLugar;
	private LocalDate fechaI;
	private LocalDate fechaF;
	
	//Constructor sin parámetros
	public Fiestas() { 
		nomFiesta = " ";
		nomLugar = " ";
		fechaI = null;
		fechaF = null;
		
	}
	//Constructor con parámetros
	public Fiestas(String nomFiesta, String nomLugar, LocalDate fechaI, LocalDate fechaF) {
		this.nomFiesta = nomFiesta;
		this.nomLugar = nomLugar;
		this.fechaI = fechaI;
		this.fechaF = fechaF;
	}
	
	//Getters
	public String getNomFiesta() {
		return nomFiesta;
	}
	public String getNomLugar() {
		return nomLugar;
	}
	public LocalDate getFechaI() {
		return fechaI;
	}
	public LocalDate getFechaF() {
		return fechaF;
	}
	
	//Setters
	public void setNomFiesta(String nomFiesta) {
		this.nomFiesta = nomFiesta;
	}
	
	public void setNomLugar(String nomLugar) {
		this.nomLugar = nomLugar;
	}

	public void setFechaI(LocalDate fechaI) {
		this.fechaI = fechaI;
	}

	public void setFechaF(LocalDate fechaF) {
		this.fechaF = fechaF;
	}
	
	
	public String toString() {
		
		Period periodo = Period.between(fechaI, fechaF);
		
		return "La fiesta " + getNomFiesta() + " con lugar en " + getNomLugar() + " se celebrará desde el " + getFechaI().format(formato) + " hasta el " + getFechaF().format(formato)
		+ "\n \n \n"
		+ "La duración de " + nomFiesta + " es de " + periodo.getDays() + " días."
		+ "\n"; 
	}
	
}
