package ApuntesTema1VariablesyBucles;

public class SintaxisCadena {

	public static void main(String[] args) {
		
		//Declaraci�n e instacia de un objeto.
		String hola = "Hola";
		String cadena = "KeAse";
		String unidad = hola + cadena;
		System.out.println(unidad);
		
		System.out.println(hola.length());
		System.out.println(cadena.length());
		
		System.out.println(hola.length() + cadena.length());
		
		//************************************************************************************************************
		
		//EJERCICIO: pasar la frase todo a mayus luego a minus y luego subcadena:
		
		String saludo = "La lluvia en Sevilla es una maravilla";
		
		//saludo = saludo.toUpperCase(); [toUpperCase para imprimir toda la frase en may�sculas]
		//System.out.println(saludo.toLowerCase()); [to Lowercase para imprimir toda la frase en min�sculas]
		
		//String subcadena1 = saludo.substring(4,9);
		//System.out.println(subcadena1);
		
		//saludo.replace("Sevilla","Cantabria");
		//saludo.replace("maravilla","porquer�a.")
		
		//"String modificado" es una variable donde almacenamos la informaci�n que queremos cambiar, as� gastamos menos l�neas
		String modificado = saludo.replace("Sevilla", "Cantabria").replace("maravilla", "porquer�a."); 
		System.out.println(modificado);
		//Tambi�n se puede poner System.out.println(saludo.replace("Sevilla", "Cantabria").replace("maravilla", "porquer�a."));
		
		String nombre = "Lara";
		
		System.out.println("*"+nombre.trim()+"*");//trim para eliminar los espacios en blanco
		
		
		
		
		
		
		
		
		
		
		
				

	}

}
