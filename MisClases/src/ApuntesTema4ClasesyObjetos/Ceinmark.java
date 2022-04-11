package ApuntesTema4ClasesyObjetos;

import java.util.ArrayList;

public class Ceinmark {

	public static void main(String[] args) {
		
		Alumnos miguel = new Alumnos("Miguel", "1ºDAM");
		
		ArrayList<Asignaturas> dam = new ArrayList<Asignaturas>();
		dam.add(new Asignaturas("Programación", 0, 256));
		dam.add(new Asignaturas("Bases de datos", 0, 192));
		dam.add(new Asignaturas("Sistemas Informáticos", 0, 192));
		dam.add(new Asignaturas("FOL", 0, 96));
		dam.add(new Asignaturas("Entornos de desarrollo", 0, 96));
		dam.add(new Asignaturas("Lenguaje de marcas", 0, 128));
		
		miguel.setAsignaturas(dam);
		System.out.println(miguel.notaMedia());
		
		miguel.convalidarAsignatura("BBDD", 10);
		
		System.out.println(miguel.notaMedia());
	}

}
