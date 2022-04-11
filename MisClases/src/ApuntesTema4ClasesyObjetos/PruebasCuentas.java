package ApuntesTema4ClasesyObjetos;

import java.util.Scanner;

public class PruebasCuentas {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		Cuentas[] lista = new Cuentas[5];
		String nombreCuenta = " ";
		
		//Rellena la lista de cuentas
		for(int i=0; i<lista.length ; i++) { 
			System.out.println("Introduce el nombre del titular:");
			lista[i] = new Cuentas(ent.nextLine());
			lista[i].ingresar(Math.random() * 1000);
		}
		
		//Bucle for each
		for(Cuentas cuenta : lista) {
			System.out.println(cuenta);
		}
		
		System.out.println("Seleccione la cuenta de un titular");
		nombreCuenta = ent.nextLine();
		
		for(Cuentas cuenta : lista) {
			if(cuenta.getTitular().equalsIgnoreCase(nombreCuenta)) { //Compara los valores de los strings         
				System.out.println("Indique la cantidad a retirar");
				System.out.println("Saldo después de retirar " + cuenta.retirar(ent.nextDouble()));
				break;
			}
		}
	}
}
