package ApuntesTema1VariablesyBucles;

public class Sumas {

	public static void main(String[] args) {
		
		//Declaración e inicialización de variables
		String descripcion1="pan", descripcion2="yogures", descripcion3= "macarrones";
		int cantidad1 = 2, cantidad2 = 3, cantidad3 = 1;
		float precio1 = 1.5f, precio2 = 1.69f, precio3 = 1.25f;
		float total = 0.0f;
		
		//Primer artículo (2 de pan a 0.75€)
		total = total + (cantidad1 * precio1);
		
		//Segundo artículo (3 yogures a 1.69€)
		total = total + (cantidad2 * precio2);
		
		//Tercer artículo (1 de macarrones a 1.25€)
		total = total + (cantidad3 * precio3);
				
		
		System.out.println("Se ha comprado " + cantidad1 + " de " + descripcion1 + " total articulo " + ((cantidad1 * precio1)));
	    System.out.println("Se ha comprado " + cantidad2 + " de " + descripcion2 + " total articulo " + ((cantidad2 * precio2)));
	    System.out.println("Se ha comprado " + cantidad3 + " de " + descripcion3 + " total articulo " + ((cantidad3 * precio3)));
	    System.out.println("El total es " + total + " €");
	}

}
