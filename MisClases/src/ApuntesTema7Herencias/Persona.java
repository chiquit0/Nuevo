package ApuntesTema7Herencias;

public class Persona {

	//Atributos
	protected String nombre;
	protected String apellidos;
	protected String dni;
	protected int edad;
	
	public Persona() {
		nombre = "";
		apellidos = "";
		dni = "";
		edad = 16;
	}
	
	public Persona(String nombre, String apellidos, String dni, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
	}

	//GETTERS
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public String getDni() {
		return dni;
	}
	
	public int getEdad() {
		return edad;
	}
	
	//SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
