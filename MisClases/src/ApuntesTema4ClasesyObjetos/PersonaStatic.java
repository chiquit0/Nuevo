package ApuntesTema4ClasesyObjetos;

public class PersonaStatic {

	private String nombre;
	private int edad;
	public static int cantidad = 0;
	
	public PersonaStatic(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		cantidad++;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String toString() {
		return "Personas - Nombre: " + nombre + ", edad: " + edad + ")";
	}
	
}
