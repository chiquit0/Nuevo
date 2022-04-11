package EjerciciosTema4;

import java.util.ArrayList;

import java.util.Scanner;

public class Reparaciones {

	//Atributos
	private String matricula;
	private ArrayList<Operaciones>listaOP;
	
	public Reparaciones() {
		matricula = " ";
		listaOP = new ArrayList<Operaciones>();
	}
	
	public Reparaciones(String matricula) {
		this.matricula = matricula;
		listaOP = new ArrayList<Operaciones>();
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void modificarOP() {
		char op = ' ';
		Scanner ent = new Scanner(System.in);
		System.out.println("�Desea a�adir una reparaci�n? (A para a�adir, M para modificar");
		op = ent.nextLine().toUpperCase().charAt(0);
		//op.equalsIgnoreCase espara cuando nos da igual diferenciar entre mayusculas y minusculas.
		if(op=='A') { //Se pone == ya que "char" es de tipo primitivo y lo permite, si fuera String habria que poner .equals
			nuevaOP();
		}else if(op=='M') {
			System.out.println("Introduce la nueva matr�cula:");
			this.setMatricula(ent.nextLine());
		}else if(op == 'O') {
			System.out.println("Introduce la linea de la operaci�n a modificar");
//			Integer.parseInt(ent.nextLine())-1
		}
		
	}
	
	public int numOperaciones() {
		return listaOP.size();
	}
	
	public void nuevaOP() {
		Scanner ent = new Scanner(System.in);
		Operaciones op = new Operaciones();
		
		System.out.println("Introduce cant/horas");
		op.setUds(Float.parseFloat(ent.nextLine()));
		System.out.println("Introduce descripci�n");
		op.setDesc(ent.nextLine());
		System.out.println("Introduce precio");
		op.setPrecio(Float.parseFloat(ent.nextLine()));
		
		listaOP.add(op); //Para a�adir las operaciones que han metido por pantalla
		
		//listaOP.ad(new Operaciones(int Unidades, String desc, Float precio));
		
	}
	
	public String toString() {
		
		String salida = " ";
		
		salida += "Matricula: " + this.getMatricula() + "\n";
		
		for(int i=0; i<listaOP.size() ; i++) {
			salida += "Operaci�n" + (i+1) + listaOP.get(i).toString() + "\n";
		}
		
		return salida;
	}
}

