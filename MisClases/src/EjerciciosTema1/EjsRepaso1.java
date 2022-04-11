package EjerciciosTema1;

public class EjsRepaso1 {

	public static void main(String[] args) {
		
//		String frase = "La vida es como una caja de bombones";
//		String delReves = "";
//		
//		for(int i=frase.lenght() -1 ; i >= 0 ; i--) {
//			delReves += frase.charAt(i);	
//		}
//		
//		System.out.println(delReves);

		String frase = "Hola mundo";
		
		String var = frase.substring(frase.indexOf("mundo"));
		
		System.out.println("Maravilloso " + var);
	
	}

}
