package ApuntesTema4ClasesyObjetos;

public class Precio {
//DEFINIC�N DE CLASES Y ATRIBUTOS
	//Atributos
	public double euros;
	public String nombre;
	
	//Constructores
	public Precio() { 								//Constructor sin par�metros
		euros = 0.0;
		nombre = " ";
	}
	
	public Precio(double euros, String nombre) {
		this.euros = euros;
		this.nombre = nombre;
	}
	
	//GETTERS Y SETTERS;
	public void setEuros(double cantidad) { 		//Es void porque no tiene que devolver nada pero est� obligado a dar un valor.
    //this.euros = cantidad;     					//El this solo se utiliza para hacer referencia a x atributo o m�todo de la clase en la que se est�.
		euros = cantidad;
	}
	
	public double getEuros() {
		return this.euros;
	}
}
