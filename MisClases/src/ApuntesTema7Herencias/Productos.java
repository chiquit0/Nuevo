package ApuntesTema7Herencias;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Productos {

	protected String nombre;
	protected LocalDate fCad;
	protected double numLote;
	
	public Productos() {
		nombre = "";
		fCad = LocalDate.now();
		numLote = 0.0d;
	}
	
	public Productos(String nombre, LocalDate fCad, double numLote) {
		this.nombre = nombre;
		this.fCad = fCad;
		this.numLote = numLote;
	}

	//GETTERS:
	public String getNombre() {
		return nombre;
	}
	
	public LocalDate getfCad() {
		return fCad;
	}
	
	public double getNumLote() {
		return numLote;
	}

	//SETTERS:
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setfCad(LocalDate fCad) {
		this.fCad= fCad;
	}

	public void setNumLote(double numLote) {
		this.numLote = numLote;
	}
	
	public String toString() {
		
		return "Producto: \n\t" + getNombre() + " " + getfCad().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ " " + getNumLote() + "\n\t";
	}
	
}
