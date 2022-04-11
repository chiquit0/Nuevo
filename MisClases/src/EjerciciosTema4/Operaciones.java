package EjerciciosTema4;

public class Operaciones {

	//Atributos
	private float uds;
	private String desc;
	private double precio;
	
	public Operaciones() { //Constructor sin parámetros
		uds = 0.0f;
		desc = " ";
		precio = 0.0;
	}
	
	public Operaciones (float uds, String desc, double precio) { //Constructor con parámetros
		this.uds = uds;
		this.desc = desc;
		this.precio = precio;
	}

	//GETTERS: 
	
	public float getUds() {
		return uds;
	}

	public String getDesc() {
		return desc;
	}

	public double getPrecio() {
		return precio;
	}
	
	//SETTERS:
	
	public void setUds(float uds) {
		this.uds = uds;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double getTotal() {
		return getUds() + getPrecio();
	}
	
	public String toString() {
		return " " + getUds() + " " + getDesc() + " " + getPrecio() + " €   Total:" + getTotal();
	}
	
	
}
