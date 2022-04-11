package ApuntesTema4ClasesyObjetos;

public class Asignaturas {

	//Atributos
	private String nombre;
//	private ListadoAsignaturas nombreAsignaturas;
	private float notas;
	private int horas;
	
	public Asignaturas() {
		nombre = " ";
		notas = 0.0f;
		horas = 0;
//		nombreAsignatura = null;
	}
	
	public Asignaturas(String nombre,  float nota, int horas) {
		this.nombre = nombre;
		this.notas = notas;
		this.horas = horas;
//		this.nombreAsignaturas = nombreAsignaturas;
	}

	//GETTERS:
	public float getNotas() {
		return notas;
	}

	public String getNombre() {
		return nombre;
	}
	
	public int getHoras() {
		return horas;
	}

	//SETTERS:
	public void setNotas(float notas) {
		this.notas = notas;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	
	
}
