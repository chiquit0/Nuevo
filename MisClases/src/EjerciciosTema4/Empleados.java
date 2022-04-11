package EjerciciosTema4;

public class Empleados {

	//ATRIBUTOS
	private int dni;
	private char letradni;
	private String nombre;
	private String cargo;
	private int año;
	private float salario;

	
	//CONSTRUCTOR SIN PARÁMETROS
	public Empleados() {
		int dni = 0;
		char letradni = ' ';
		String nombre = " ";
		String cargo = " ";
		int año = 0;
		float salario = 0.0f;

	}
	
	//CONSTRUCTOR CON PARÁMETROS
	public Empleados(int dni, char letradni,  String nombre, String cargo, int año, float salario) {
		this.dni = dni;
		this.letradni = letradni;
		this.nombre = nombre;
		this.cargo = cargo;
		this.año = año;
		this.salario = salario;

	}
	
	//GETTERS:
	
	public int getDni() {
		return dni;
	}
	
	public char getLetradni() {
		return letradni;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getCargo() {
		return cargo;
	}
	
	public int getAño() {
		return año;
	}
	
	public float getSalario() {
		return salario;
	}
	
//	public float getNomina() {
//		return nomina;
//	}
//	
	//SETTERS:
	
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public void setLetradni(char dni) {
		this.letradni = letradni;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void setAño(int año) {
		this.año = año;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}	
	
//	public void setNomina(float salario) {
//		this.nomina = nomina;
//	}
	
	public String toString() {
		
		return getDni()+ "" + getLetradni()+ " - " + getNombre()+
		"\n"+ getCargo()+ " - " + getAño()+
		"\n"+ getSalario()+"\n";
	}
	
	public float getNomina() {
		int añoactual = 2022;
		
		return getSalario() * getAño();
		
	}
	
}
