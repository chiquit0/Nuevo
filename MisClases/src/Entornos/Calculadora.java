package Entornos;

public class Calculadora {

	public Float Suma(Float a, Float b) {
		return a+b;
	}
	
	//Funci�n que devuelve el resultado de una resta recibiendo como par�metros dos n�meros de tipo Float: a y b
	public Float Resta(Float a, Float b) {
		
		if (a > b) {
			return a-b;
		}else {
			System.out.println("Las liao y tal");
		}
		
		return a-b;
	}
	
	public Float Multiplicaci�n(Float a, Float b) {
		return a*b;
	}
	
	public Float Divisi�n(Float a, Float b) {
		return a/b;
	}
}
