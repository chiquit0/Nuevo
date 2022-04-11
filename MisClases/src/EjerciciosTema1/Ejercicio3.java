package EjerciciosTema1;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Declaración e inicialización de valiables
		int var1 = 3;
		int var2 = 9;
		int aux;
		System.out.println(var1);
		System.out.println(var2);

		aux = var1;
		var1=var2;
		var2=aux;
		
		System.out.println(var1);
		System.out.println(var2);
		
		var1 = var1 + 77; //var1 += 77;
		System.out.println(var1);
		
				
	}

}
