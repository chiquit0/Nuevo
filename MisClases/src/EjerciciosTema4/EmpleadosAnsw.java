package EjerciciosTema4;

public class EmpleadosAnsw {

	//ATRIBUTOS
	private String dni;
	private String nombre;
	private String cargo;
	private int a�o;
	private float salario;
	
	//CONSTRUCTOR SIN PARAMETROS
	public EmpleadosAnsw() {
		dni =" ";
		nombre = " ";
		cargo = " ";
		a�o = 2022;
		salario = 0.0f;
	}
	
	//CONSTRUCTIR CON PARAMETROS:
	public EmpleadosAnsw(String dni, String nombre, String cargo, int a�o, float salario) {
		this.dni = dni;
		this.nombre = nombre;
		this.cargo = cargo;
		this.a�o = a�o;
		this.salario = salario;
	}
	
	//GETTERS:
	public String getDni() {
		return dni;
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
	
	//SETTERS:
	public void setDni(String dni) {
		this.dni = dni;
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
	
	public int getExp() {
		
		final int currentYear = 2022; //Constante
		return currentYear - getA�o();

	}
	
	public float getNomina() {
		
		return getSalario() + (20 * getExp());
	}
	
	public String toString() {
		
		return "Empleado: " + getDni() + "\t" + getNombre() + "\n" +
				"\t" + getCargo() + "\t \t" + getExp() + "\n" +
				"\t \t \t" + getNomina();
	}
	
	
}
