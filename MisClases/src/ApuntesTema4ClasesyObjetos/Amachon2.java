package ApuntesTema4ClasesyObjetos;

import java.util.ArrayList;

import java.util.Scanner;

public class Amachon2 {

	public static void main(String[] args) {
		
		//Declaraci�n de objetos y variables
		ArrayList<Productos> carrito = new ArrayList<Productos>();
		Scanner ent = new Scanner(System.in);
		int op = 0;
		boolean salir = false;
		boolean continuar = true;
		
//		addCarrito(carrito);
//		imprimir(carrito);
//		eliminar(carrito);
	
		while(continuar) {
			//opcion 1: a�adir articulos
			//opcion 2: ver carrito
			//opcion 3: eliminar producto
			//opcion 4: finalizar compra		
			System.out.println("Elije una opci�n: \n"
					+ "1�) A�adir productos \n"
					+ "2�) Eliminar un producto \n"
					+ "3�) Ver carrito \n"
					+ "4�) Finalizar compra");
			op = ent.nextInt();
		
			switch(op) {
				case 1: addCarrito(carrito);
						break;
				
				case 2: if(carrito.size() > 0)  {
							eliminar(carrito);
						}else {
							System.out.println("No hay productos.");
						}
						break;
				
				case 3: imprimir(carrito);
						break;
						
				case 4: busqueda(carrito);
						break;
					
				case 5: continuar = true;
						System.out.println("Adi�s :)");
						
				default: System.out.println("Opci�n no v�lida.");
			}
		}
	
	}
		
	public static void addCarrito(ArrayList<Productos> carrito) {
	
		Scanner ent = new Scanner(System.in);
		int cant = 0;
		double precio = 0.0;
		int dto = 0;
		String desc = " ";
		char cont = ' ';
		
		
		//Comienza un bucle que nos permite dar de alta Productos en el carrito
		do {
			System.out.println("Introduce la cantidad del producto: ");
			cant = Integer.parseInt(ent.nextLine());
			System.out.println("Introduce la descripci�n del producto: ");
			desc = ent.nextLine();
			System.out.println("Introduce el precio del producto: ");
			precio = Double.parseDouble(ent.nextLine());
			System.out.println("Introduce el dto del producto: ");
			dto = Integer.parseInt(ent.nextLine());		
			
			//Se almacena el producto en carrito.add
			carrito.add(new Productos(cant, desc, precio, dto));
			
			System.out.println("�Desea a�adir otro producto (S/N)?");
		
			//Se captura la respuesta en el ent.nextline, se convierte en masy�sculas con el toUpperCase y luego cogemos la primera letra de la palabra con charAt.
			cont = ent.nextLine().toUpperCase().charAt(0); 
			
		}while(cont == 'S');
		//Si la condici�n es falsa, el bucle se para y el programa sigue avanzando

	}

	//Hace referencia al ArrayList de arriba para imprimirlo por pantalla despu�s
	public static void imprimir(ArrayList<Productos> carrito) { 
		
		int totalCant = 0, linea = 1;
		double totalPrecio = 0.0;
		
		//Imprimir el detalle del carrito
		System.out.println("Cantidad   Descripci�n   Precio/Unidad   Descuento   Total");
		for(Productos p : carrito) {
			System.out.println(linea + "�) " + p);
			linea++;
			totalCant += p.getCant();
			totalPrecio += p.getTotal();
		}
	
	System.out.println("Total unidades: " + totalCant + ". Total a pagar: " + totalPrecio);
	}
	
	public static void eliminar(ArrayList<Productos> cesta) {
		Scanner ent = new Scanner(System.in);
		int resp = 0;
		
		imprimir(cesta); 
		
		System.out.println("�Qu� producto quieres eliminar?");
		resp = ent.nextInt();
		
		cesta.remove(Integer.parseInt(ent.nextLine()) -1); //Se resta 1 ya que las posiciones de los arrays empiezan por el n�mero 0
		
		System.out.println("Producto eliminado");
		imprimir(cesta);
	}
	
	public static void busqueda(ArrayList<Productos> cesta) {
		
		Scanner ent = new Scanner(System.in);
		String desc = " ";
		ArrayList<Productos> listaBus = new ArrayList<Productos>();
		
		System.out.println("Introduce el producto:");
		desc = ent.nextLine();
		
		for(int i=0; i <cesta.size() ; i++) {
			if(cesta.get(i).getDesc().contains(desc)) {
				listaBus.add(cesta.get(i));
			}
		}
		
		if(listaBus.size() > 0) {
			imprimir(listaBus);
		}
	}
}
