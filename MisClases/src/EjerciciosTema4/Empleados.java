package EjerciciosTema4;

public class Empleados {

	//ATRIBUTOS
	private int dni;
	private char letradni;
	private String nombre;
	private String cargo;
	private int a�o;
	private float salario;

	
	//CONSTRUCTOR SIN PAR�METROS
	public Empleados() {
		int dni = 0;
		char letradni = ' ';
		String nombre = " ";
		String cargo = " ";
		int a�o = 0;
		float salario = 0.0f;

	}
	
	//CONSTRUCTOR CON PAR�METROS
	public Empleados(int dni, char letradni,  String nombre, String cargo, int a�o, float salario) {
		this.dni = dni;
		this.letradni = letradni;
		this.nombre = nombre;
		this.cargo = cargo;
		this.a�o = a�o;
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
	
	public int getA�o() {
		return a�o;
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
	
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}	
	
//	public void setNomina(float salario) {
//		this.nomina = nomina;
//	}
	
	public String toString() {
		
		return getDni()+ "" + getLetradni()+ " - " + getNombre()+
		"\n"+ getCargo()+ " - " + getA�o()+
		"\n"+ getSalario()+"\n";
	}
	
	public float getNomina() {
		int a�oactual = 2022;
		
		return getSalario() * getA�o();
		
	}
	
}
