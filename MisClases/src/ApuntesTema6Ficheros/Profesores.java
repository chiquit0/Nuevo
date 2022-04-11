package ApuntesTema6Ficheros;

public class Profesores {

	//Atributos
	private String nombre;
	private String dni;
	private String[] asignatura;
	private double salario;

	//Constructor sin parámetros
	public Profesores() {
		this.nombre = " ";
		this.dni = " ";
		this.asignatura = null;
		this.salario = 0.0d;
	}

	//Constructor con parámetros
	public Profesores(String nombre, String dni, String[] asignatura, double salario) {
		this.nombre = nombre;
		this.dni = dni;
		this.asignatura = asignatura;
		this.salario = salario;
	}

	//GETTERS
	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public String[] getAsignatura() {
		return asignatura;
	}

	public double getSalario() {
		return salario;
	}
	
	//SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setAsignatura(String[] asignatura) {
		this.asignatura = asignatura;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String toString() {

		return "El profesor " + getNombre() + " con dni " + getDni() + " imparte las asignaturas " + mostrarAsig()
				+ " y su sueldo es de " + getSalario() + " euros.";
	}

	public String mostrarAsig() {

		String texto = " ";

		for (int i = 0; i < this.asignatura.length; i++) {
			texto = texto + asignatura[i] + " ";
		}
		return texto;
	}

}
