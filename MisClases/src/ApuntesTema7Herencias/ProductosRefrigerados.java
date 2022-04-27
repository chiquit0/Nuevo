package ApuntesTema7Herencias;

import java.time.LocalDate;

public class ProductosRefrigerados extends Productos {

	private int codigo;
	
	public ProductosRefrigerados() {
		super();
		codigo = -10;
	}
	
	public ProductosRefrigerados(String nombre, LocalDate fCad, double numLote, int codigo) {
		super(nombre, fCad, numLote);
		this.codigo = codigo;
	}

	//GETTERS
	public int getCodigo() {
		return codigo;
	}

	//SETTERS
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String toString() {
		
		return super.toString() + getCodigo();
	}
	
}
