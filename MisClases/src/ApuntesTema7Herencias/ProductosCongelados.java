package ApuntesTema7Herencias;

import java.time.LocalDate;

public class ProductosCongelados extends Productos {

	//Atributos
	private int temp;
	
	public ProductosCongelados() {
		super();
		temp = 0;
	}
	
	public ProductosCongelados(String nombre, LocalDate fCad, double numLote, int temp) {
		super(nombre, fCad, numLote);
		this.temp = temp;
	}

	//GETTERS
	public int getTemp() {
		return temp;
	}

	//SETTERS
	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	public String toString() {
		
		return super.toString() + " Temperatura o¡óptima para el producto: " + getTemp();
	}
	
}
