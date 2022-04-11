package EjerciciosTema5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class PruebaFiestasAnsw {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		ArrayList<FiestasAnsw> lista = new ArrayList<FiestasAnsw>();
		Fiestas f;
		boolean continuar = false;
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		do{

			f = new Fiestas();

			System.out.println("Introduce el nombre de la fiesta:");
			// Se utiliza el setNomFiesta para añadir el nombre de la fiesta a los
			// constructores de la otra clase, así con el resto de atributos
			f.setNomFiesta((ent.nextLine()));
			System.out.println("Introduce el lugar de la fiesta: ");
			f.setNomLugar((ent.nextLine()));
			try{
				System.out.println("Introduce la fecha de inicio: ");
				f.setFechaI(LocalDate.parse(ent.nextLine(), df));
				System.out.println("Introduce la fecha de final: ");
				f.setFechaF(LocalDate.parse(ent.nextLine(), df));
			}catch (Exception ex) {
				System.out.println("La fecha introducida es incorrecta");
				continue;
			}
			System.out.println("¿Quieres introducir otra fiesta? (S/N)");
			if (ent.nextLine().toUpperCase().charAt(0) == 'S') {
				// Si la respuesta introducida es 'S', el bucle se repite
				continuar = true;
			}else {
				// Si la respuesta introducida es cualquier cosa diferente a 'S', el bucle se
				// acabaa
				continuar = false;
			}

		}while (continuar);
	
		mostrar(lista);
	
	}
	
	public static void mostrar(ArrayList<FiestasAnsw> lista) {
		
		String fiestaDeVerano = "Las fiestas de verano son: \n";
		
		for(FiestasAnsw f : lista) {
			
			System.out.println(f);
			if(f.esEnVerano()) {
				fiestaDeVerano += f.getNombre() + "\n";
			}
		}
	}
}
