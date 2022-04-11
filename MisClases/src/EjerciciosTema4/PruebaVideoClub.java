package EjerciciosTema4;

import java.util.ArrayList;

public class PruebaVideoClub {

	public static void main(String[] args) {
		
		ArrayList<VideoClub> lista = new ArrayList<VideoClub>();
		
		lista.add(new VideoClub(55, "Star Wars", "Ciencia ficción", 10));
		lista.add(new VideoClub(32, "Charlie y la fábrica de chocolate", "Fantasía", 2));
		lista.add(new VideoClub(87, "Matilda", "Fantasia", 0));
		lista.add(new VideoClub(55, "Jumanji", "Aventuras", 15));
		lista.add(new VideoClub(55, "La Viuda Negra", "Ciencia ficción", 8));
		
		
		for(VideoClub p : lista) {
			System.out.println(p);
//			if(p.getUdsStock() <= 0) {
//				System.out.println("LA PELICULA NO ESTÁ DISPONIBLE");
//			}
		
		}
	}
}
