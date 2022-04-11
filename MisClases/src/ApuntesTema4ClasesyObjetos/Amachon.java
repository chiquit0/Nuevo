package ApuntesTema4ClasesyObjetos;

import java.util.ArrayList;

public class Amachon {

	public static void main(String[] args) {
		
		//También se puede instanciar en una sola linea
		//ArrayList<Productos> carrito = new ArrayList<Productos>() 

//		Productos p1 = new Productos(1, "Roomba", 600.0, 10); //Para instanciar el producto
		
//		carrito.add(p1); //También se puede instanciar directamente desde el Array
		
//		p1.setCant(10); //Cantidad de objetos
		
//		System.out.println(p1);
//		System.out.println(carrito.get(0));
		
		ArrayList<Productos> carrito; //Declaración del ArrayList
		
		carrito = new ArrayList<Productos>(); //ArrayList instanciado
		
		carrito.add(new Productos(1, "Roomba", 600.0, 10));
		carrito.add(new Productos(2, "Freidora", 60.0, 15));
		
		System.out.println(carrito.get(0));
		System.out.println(carrito.get(1));
		
		
		
	}

}
