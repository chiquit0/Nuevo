package EjerciciosTema4;

import java.util.ArrayList;

public class PruebaEmpleadosAnsw {

	public static void main(String[] args) {
		
		ArrayList<EmpleadosAnsw> lista = new ArrayList<EmpleadosAnsw>();
		EmpleadosAnsw maxSalario = new EmpleadosAnsw();
		
		lista.add(new EmpleadosAnsw("78346872X", "Lara", getCargo(), aleatorio(1985,2022), aleatorio(800,3000)));
		lista.add(new EmpleadosAnsw("22346872X", "Ariana", getCargo(), aleatorio(1985,2022), aleatorio(800,3000)));
		lista.add(new EmpleadosAnsw("33346872X", "Natalia", getCargo(), aleatorio(1985,2022), aleatorio(800,3000)));
		lista.add(new EmpleadosAnsw("44346872X", "Paola", getCargo(), aleatorio(1985,2022), aleatorio(800,3000)));
		lista.add(new EmpleadosAnsw("55346872X", "JoseMi", getCargo(), aleatorio(1985,2022), aleatorio(800,3000)));
		lista.add(new EmpleadosAnsw("66346872X", "Diego", getCargo(), aleatorio(1985,2022), aleatorio(800,3000)));
		
		for(EmpleadosAnsw emp : lista) {
			System.out.println("Empleados con más de 10 años en la empresa");
		if(emp.getExp() > 10) {
			System.out.println(emp);
		}
		
		if(emp.getNomina() > maxSalario.getNomina()) {
			maxSalario = emp;
		}
		
	
		}
		System.out.println("El empleado que más cobra es: " + maxSalario);
	}
	
	public static int aleatorio(int num1, int num2) {
		
		int numAle = (int)(Math.random() * (num2 + 1 - num1) ) + num1;
		
		return numAle;
	
	}
	
	public static String getCargo() {
		
		String cargos[] = new String[] {"CEO", "Admin", "Compras", "Ventas", "Secretaría" };
		
		return cargos [(int)(Math.random() * cargos.length)];
	}
	
	

}
