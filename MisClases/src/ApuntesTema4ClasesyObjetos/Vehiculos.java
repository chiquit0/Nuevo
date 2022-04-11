package ApuntesTema4ClasesyObjetos;

public class Vehiculos {
	//CREAR UNA CLASE QUE DEFINA LOS DATOS DE VEHÍCULOS (MARCA-MODELO), KM, TIPO COMBUSTIBLE, PRECIO)
	
	//Atributos
	public String marca;
	public int kms;
	public char combustible;
	public float precio;
	
	//Constructores
	public Vehiculos() { //Sin parámetros
		marca = " ";
		kms = 0;
		combustible = ' ';
		precio = 0.0f;
		
	}
	
	public Vehiculos(String marca, int kms, char combustible, float precio) { //Con parámetros
		this.marca = marca;
		this.kms = kms;
		this.combustible = combustible;
		this.precio = precio;
		
	}
	
	//GETTERS Y SETTERS:
	public String getMarca() {
		return marca;
	}
	
	public int getKms() {
		return kms;
	}
	
	public char getCombustible() {
		return combustible;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setKms(int kms) {
		this.kms = kms;
	}
	
	public void setCombustible(char combustible) { 
		this.combustible = combustible;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public String toString() { //Para imprimir por pantalla la información que hemos dados
		
		String salida = "Vehículo: " + marca + "\n" +
						"Kms: " + kms + "\n" + 
						"Comsbustible: " + combustible + "\n" + 
						"Precio: " + precio;	
		return salida;
	}
}
