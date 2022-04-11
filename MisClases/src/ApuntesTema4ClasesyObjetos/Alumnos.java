package ApuntesTema4ClasesyObjetos;

import java.util.ArrayList;

public class Alumnos {

	private String nombre;
	private String ciclo;
	private ArrayList<Asignaturas> asignaturas;
	
	//Constructores
	public Alumnos() {
		nombre = " ";
		ciclo = " ";
		asignaturas = new ArrayList<Asignaturas>(); 
	}
	
	public Alumnos(String nombre, String ciclo) {
		this.nombre = nombre;
		this.ciclo = ciclo;
		this.asignaturas = new ArrayList<Asignaturas>();
	}

	//GETTERS
	public String getNombre() {
		return nombre;
	}
	
	public String getCiclo() {
		return ciclo;
	}
	
	//SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	
	public void setAsignaturas(ArrayList<Asignaturas>dam) {
		asignaturas = dam;
	}
	
	public void convalidarAsignatura(String asignatura, float notaNueva) {
		
		for(Asignaturas as : asignaturas ) {
			if(as.getNombre().equals(asignatura)) {
				as.setNotas(notaNueva);
			}
		}
	}
	
	public float notaMedia() {
		float total = 0.0f;
		
		for(int i=0 ; i<asignaturas.size() ; i++) {
			total += asignaturas.get(i).getNotas();
		}
		
		return total/asignaturas.size();
	}
}
