package ApuntesTema7Herencias;

import java.time.LocalDate;

public class ProductosFrescos extends Productos {

	//Atributos
	protected LocalDate fEnv;
	protected String origen;
	
	public ProductosFrescos() {
		super();
		fEnv = LocalDate.now();
		origen = "";
	}
	
	public ProductosFrescos(String nombre, LocalDate fCad, double numLote, LocalDate fEnv, String origen) {
		super(nombre, fCad, numLote);
		this.fEnv = fEnv;
		this.origen = origen;
	}

	//GETTERS
	public LocalDate getfEnv() {
		return fEnv;
	}
	
	public String getOrigen() {
		return origen;
	}
	
	//SETTERS
	public void setfEnv(LocalDate fEnv) {
		this.fEnv = fEnv;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	public String toString() {
		
		return super.toString() + "Fecha de envasado: " + getfEnv() + " " + getOrigen();
	}
	
}
