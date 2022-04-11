package ApuntesTema4ClasesyObjetos;

public class PruebaPrecio {

	public static void main(String[] args) {
		
        //		Precio p = new Precio();
        //		p.setEuros(3.63); //Se asigna un valor
        //		p.euros = 0.34; //Aquí se cambia directamente el valor
        //		System.out.println("Precio" + p.getEuros());

		
		Precio pokemon = new Precio();            //Los métodos llevan un paréntesis al final
		Precio queso = new Precio(3.63, "Queso");
		
//		System.out.println("Precio" + pokemon.euros);
//		System.out.println("Nombre" + pokemon.nombre);
		
		//Asignamos valores a p y q de formas diferentes
		System.out.println("Precio " + queso.euros);
		System.out.println("Nombre " + queso.nombre);
	}

}
