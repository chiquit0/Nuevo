package ApuntesTema7Herencias;

import ApuntesTema4ClasesyObjetos.Alumnos;

public class Ceinmark {

	public static void main(String[] args) {
		
		String[]asig = new String[] {"FOL", "BBDD"};
		
		Profesor p = new Profesor("Manu", "Gomez", "77777", 27, asig,900f);
		Alumno samu = new Alumno("Samuel", "Ceballos", "33333", 19, "DAM", "PRIMERO");
		
		System.out.println(p);
		System.out.println(samu);
		

	}

}
