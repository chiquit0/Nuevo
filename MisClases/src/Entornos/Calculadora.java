package Entornos;

public class Calculadora {

	public Float Suma(Float a, Float b) {
		return a+b;
	}
	
	//Función que devuelve el resultado de una resta recibiendo como parámetros dos números de tipo Float: a y b
	public Float Resta(Float a, Float b) {
		
		if (a > b) {
			return a-b;
		}else {
			System.out.println("Las liao y tal");
		}
		
		return a-b;
	}
	
	public Float Multiplicación(Float a, Float b) {
		return a*b;
	}
	
	public Float División(Float a, Float b) {
		return a/b;
	}
}
