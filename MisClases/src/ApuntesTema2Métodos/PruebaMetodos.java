package ApuntesTema2M�todos;

public class PruebaMetodos {

	public static void main(String[] args) {
//		Ejemplo del power point M�todos y atributos 2.1
		
//		String saludo = "Hola";
		
//		saludo.length(); || .length es el m�todo, son peque�os trozos que van entre llaves
//		saludar1();
//		saludar(saludo);
//		String saludo = saludar2();
//		System.out.println(saludo);
	
		String sal = saludar4("Mundo");
		
		System.out.println(sal);
		
	}

	public static String saludar4(String cadena) {
		String salida = "Hola";
		
		
		return salida;
	}
	
	public static String saludar2() {
		String cadena = "Mundo";
		
		return cadena;
	}
	
	public static void saludar(String cadena) {
	
		System.out.println(cadena);
	}

	public static void saludar1() {
		System.out.println("Hola Mundo");
	}

}
