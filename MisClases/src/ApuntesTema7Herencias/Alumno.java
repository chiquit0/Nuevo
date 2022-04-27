package ApuntesTema7Herencias;

public class Alumno extends Persona{

	//Atributos
	protected String curso;
	protected String ciclo;
	
	public Alumno() {
		super();
		curso = "";
		ciclo = "";
	}
	
	public Alumno(String nombre, String apellidos, String dni, int edad, String curso, String ciclo) {
		
		super(nombre, apellidos, dni, edad);
		this.curso = curso;
		this.ciclo = ciclo;
	}

	//GETTERS:
	public String getCurso() {
		return curso;
	}
	public String getCiclo() {
		return ciclo;
	}
	
	//SETTERS:
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	
	
}
