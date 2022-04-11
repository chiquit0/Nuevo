package ApuntesTema4ClasesyObjetos;

import java.util.Scanner;

public class PruebaPersonas {

	public static void main(String[] args) {
		
		Personas Mateo = new Personas();  //Se instancia igual que la clase de tipo Scanner
		Personas David = new Personas("David", 'H', 21, 72, 1.85f);
		
		System.out.println(David);

		Mateo.setEdad(22);
		
		
		
		Scanner ent = new Scanner(System.in);
//		
//		System.out.println("Introduce el nombre:");
//		Mateo.setNombre(ent.nextLine());
//		System.out.println("Introduce tu género:");
//		Mateo.setGenero(ent.nextLine().charAt(0));
//		System.out.println("Introduce tu edad: ");
//		Mateo.setEdad(ent.nextInt());
//		
//		System.out.println("Nombre: " + Mateo.getNombre());
//		System.out.println("Género " + Mateo.getGenero());
//		System.out.println("Edad " + Mateo.getEdad());

	}

}
