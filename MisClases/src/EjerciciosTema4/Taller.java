package EjerciciosTema4;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Taller {

	public static void main(String[] args) {
		
		ArrayList<Operaciones> opciones = new ArrayList<Operaciones>();
		Scanner ent = new Scanner(System.in);
		int op = 0;
		boolean cont = true;
		boolean salir = false;
		Reparaciones rep = null;
		
//		addUds(opciones);
		
		while(cont) {
			//opcion 1: crear reparacion
			//opcion 2: modificar reparacion
			//opcion 3: borrar una operacion
			//opcion 4: calcular precio
			//opcion 5: finalizar
			
			
			System.out.println("Elije una opción: \n"
					+ "1. Pedir reparaciones. \n"
					+ "2. Ver reparaciones. \n"
					+ "3. Modificar reparaciones. \n"
					+ "4. Calcular precio final. \n"
					+ "5. Salir." );
			int opcion = ent.nextInt();
			
			switch(opcion) {
				case 1: ent.nextLine();
						System.out.println("Introduce la matrícula:");
						rep = new Reparaciones(ent.nextLine());
						//addUds(opciones);
						break;
			
				case 2: if(rep==null) {
							System.out.println("Se requiere crear reparación. Opción 1");
						}else {
							if(rep.numOperaciones()==0) {
								rep.nuevaOP();
							}else {
								rep.modificarOP();
							}
							
						}
						break;
			
				case 3: cancelarRep(opciones);
						break;
			
				case 4: cont = false;
						System.out.println("Adiós :)");
						break;
					
				default: System.out.println("Opción no válida. ");
			}
			
			
		
		}
	}
	
	public static void addUds(ArrayList<Operaciones>opciones) {
		
		Scanner ent = new Scanner(System.in);
		String matricula = " ";
		int uds = 0;
		String desc = " ";
		double precio = 0.0;
		char continuar = ' ';
		
		//Creamos un bucle para dar de alta las reparaciones
		do {
			System.out.println("Introduce tu matricula:");
			matricula = ent.nextLine();
			System.out.println("Introduce cuántas reparaciones quieres realizar:");
			uds = Integer.parseInt(ent.nextLine());
			System.out.println("Introduce la descripción de la/s reparación/es:");
			desc = ent.nextLine();
			System.out.println("Introduce el precio de la/s reparación/es: ");
			precio = Double.parseDouble(ent.nextLine());
			
			//Almacenamos las operaciones
//			opciones.add(new Operaciones(matricula, uds, desc, precio));
			
			System.out.println("¿Desea hacer otra reparación? (S/N)");
			continuar = ent.nextLine().toUpperCase().charAt(0); 
		
		}while(continuar == 'S');
		//Cuando la condición es falsa, el bucle do while para y el programa sigue avanzando
		
	}
	
	public static void imprimir(ArrayList<Operaciones>opciones) {
		
		int totalUds = 0, linea = 1;
		double totalPrecio = 0.0;
		
		//Imprimimos los detalles de la reparación
		System.out.println("Unidades   |   Descripción   |   Precio/Unidad   |   Precio final");
		for(Operaciones o : opciones) {
			System.out.println(linea + " - " + o);
			linea++;
			totalUds += o.getUds();
			totalPrecio += o.getTotal();
		}
		System.out.println("Total unidades: " + totalUds + ". Total a pagar: " + totalPrecio);
	}
	
	public static void cancelarRep(ArrayList<Operaciones>opciones) {
		Scanner ent = new Scanner(System.in);
		int respuesta = 0;
		
		imprimir(opciones);
		System.out.println("¿Que reparación quieres cancelar?");
		respuesta = ent.nextInt();
		
		opciones.remove(Integer.parseInt(ent.nextLine())-1);
		
		System.out.println("Reparación calcelada");
		imprimir(opciones);
				
	}
	

}
