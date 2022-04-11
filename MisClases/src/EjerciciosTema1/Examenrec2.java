package EjerciciosTema1;

public class Examenrec2 {

	public static void main(String[] args) {
		
//		String cadena= "Los murciélagos estaban anclados en el techo sedientos de sangre";
//		char letra = ' ';
//		letra+= 26;
//		int num = 64;
//		System.out.println((char)num);
//******************************SOLUCIÓN*********************************************************
	
		String cadena = "Los murciélagos estaban anclados en el techo sedientos de sangre";
		
		int longitud = cadena.length();
		
		for(int i=0; i < cadena.length() ; i++) {
			System.out.println(cadena.charAt(i) + "--" + (int)cadena.charAt(i));
		}
	
	}
}
