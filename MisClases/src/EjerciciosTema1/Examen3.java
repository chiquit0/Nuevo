package EjerciciosTema1;

public class Examen3 {

	public static void main(String[] args) {
		
		String frase = "Los murciélagos estaban anclados en el techo sedientos de sangre";
		int cont=0;
		char letra;
		
		for(int i=0 ; i < frase.length() ; i++) {
			letra = frase.charAt(i);
			if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				cont++;
			}
		}
		
		System.out.println("Número de vocales es = " + cont);
	

	}

}
