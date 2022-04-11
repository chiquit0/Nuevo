package ApuntesTema4ClasesyObjetos;

public class PruebaStatic {

	public static void main(String[] args) {
		
//		PersonaStatic persona1 = new PersonaStatic("Lara", 21);
//		
//		PersonaStatic persona2 = new PersonaStatic("Fernando", 28);
//
//		System.out.println(persona1);
//		System.out.println(persona2);
		
		Operacion op = new Operacion();
		int resultado = Operacion.sumar(5, 8);
		
		System.out.println(resultado);
		System.out.println(Operacion.restar(10, resultado));
	}

}
