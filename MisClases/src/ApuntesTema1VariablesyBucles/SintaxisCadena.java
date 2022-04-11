package ApuntesTema1VariablesyBucles;

public class SintaxisCadena {

	public static void main(String[] args) {
		
		//Declaración e instacia de un objeto.
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
		
		//saludo = saludo.toUpperCase(); [toUpperCase para imprimir toda la frase en mayúsculas]
		//System.out.println(saludo.toLowerCase()); [to Lowercase para imprimir toda la frase en minúsculas]
		
		//String subcadena1 = saludo.substring(4,9);
		//System.out.println(subcadena1);
		
		//saludo.replace("Sevilla","Cantabria");
		//saludo.replace("maravilla","porquería.")
		
		//"String modificado" es una variable donde almacenamos la información que queremos cambiar, así gastamos menos líneas
		String modificado = saludo.replace("Sevilla", "Cantabria").replace("maravilla", "porquería."); 
		System.out.println(modificado);
		//También se puede poner System.out.println(saludo.replace("Sevilla", "Cantabria").replace("maravilla", "porquería."));
		
		String nombre = "Lara";
		
		System.out.println("*"+nombre.trim()+"*");//trim para eliminar los espacios en blanco
		
		
		
		
		
		
		
		
		
		
		
				

	}

}
