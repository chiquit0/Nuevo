package ApuntesTema7Herencias;

import java.util.Arrays;

public class Profesor extends Persona{
//Aqui está herendando los atributos y datos de la clase Persona
	
	
	//Atributos
	protected String[] asig;
	protected float salario;
	
	public Profesor() { //Constructor sin parámetros
		super(); //Hace referencia a la clase superior que en este caso es Persona
		asig = null;
		salario = 0.0f;
	}
	
	public Profesor(String nombre, String apellidos, String dni, int edad, String[] asig, float salario) { //Constructor con parámetros
		//En el constructor con parámetros no se puede poner super dentro de los parámetros, hay que meterlos manualmente
		
		super(nombre, apellidos, dni, edad);
//		this.nombre = nombre;
//		this.apellidos = apellidos;
//		this.dni = dni;
//		this.edad = edad;
		this.asig = asig;
		this.salario = salario;
		
	}

	//GETTERS
	public String[] getAsig() {
		return asig;
	}
	public float getSalario() {
		return salario;
	}
	
	//SETTERS
	public void setAsig(String[] asig) {
		this.asig = asig;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return "Profesor: \n \t" + getNombre() + " " + getApellidos() + "\n \t" +
				"DNI: " + getDni() + " Edad: " + getEdad() + "\n\t"
				+ "Asig =" + Arrays.toString(getAsig()) + " Salario =" + getSalario();
	}
	
}
