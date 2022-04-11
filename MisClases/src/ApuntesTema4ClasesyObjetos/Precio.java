package ApuntesTema4ClasesyObjetos;

public class Precio {
//DEFINICÓN DE CLASES Y ATRIBUTOS
	//Atributos
	public double euros;
	public String nombre;
	
	//Constructores
	public Precio() { 								//Constructor sin parámetros
		euros = 0.0;
		nombre = " ";
	}
	
	public Precio(double euros, String nombre) {
		this.euros = euros;
		this.nombre = nombre;
	}
	
	//GETTERS Y SETTERS;
	public void setEuros(double cantidad) { 		//Es void porque no tiene que devolver nada pero está obligado a dar un valor.
    //this.euros = cantidad;     					//El this solo se utiliza para hacer referencia a x atributo o método de la clase en la que se está.
		euros = cantidad;
	}
	
	public double getEuros() {
		return this.euros;
	}
}
