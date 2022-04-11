package ApuntesTema4ClasesyObjetos;

public class Personas {

	//Definir los atributos de la clase
	public String nombre;
	public char genero;
	public int edad;
	public float altura;
	public float peso;
	
	//Definir m�todos
	public Personas() { //Constructor por defecto, sin par�metros
		nombre = " ";
		genero = ' ';
		edad = 0;
		altura = 0.0f;
		peso = 0.0f;
	}
	
	public Personas(String nombre, char genero, int edad, float altura, float peso) {  //Constructor con par�metros
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
	}

	//GETTERS
	public String getNombre() {
		return nombre;
	}
	
	public char getGenero() {
		return genero;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public float getPeso() {
		return peso;
	}
	
	//SETTERS
	public void setNombre(String nombre) { //Es void porque modifica el valor, no lo devuelve
		this.nombre = nombre;
	}
	
	public void setGenero(char genero) { 
		this.genero = genero;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;	
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public float getIMC() {
		return peso / (altura*altura);
	}
	
	public String toString() { //Para imprimir por pantalla la informaci�n que hemos dado
		return "Persona: " + getNombre() + ", " + getGenero() + ", " + getEdad() + ", " + getIMC();
	
	}
}
