package ApuntesTema4ClasesyObjetos;

public class PruebaLibros {

	public static void main(String[] args) {
		
		Libros novela = new Libros(9788483651234L, "La canci�n de Aquiles", "Madeline Miller", 504);
		Libros cocina = new Libros(2975036815478L, "Argui�ano", "Carlos", 12);

		System.out.println(novela); //El syso hace llamada al metodo toString
		System.out.println(cocina);
		
		
//		if(novela.getnumPag() > cocina.getnumPag()) {
//			System.out.println("El libro con m�s p�ginas es" + );
//		}else {
//			System.out.println("El libro con m�s p�ginas es " + );
//		}
	}

}
