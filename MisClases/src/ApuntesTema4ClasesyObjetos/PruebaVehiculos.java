package ApuntesTema4ClasesyObjetos;

public class PruebaVehiculos {

	public static void main(String[] args) {
		//EN UNA CLASE CON METODO MAIN, GENERAR 2 INSTANCIAS DE 2 VEHICULOS, UTILIZANDO LOS METODOS SET, DAR VALORES A LOS ATRIBUTOS.
		//MOSTRAR POR PANTALLA QUE VEHICULO TIENE MÁS KM Y CUAL ES EL MÁS CARO
		
		//Dos maneras diferentes de instanciar la información
		Vehiculos seat = new Vehiculos("Seat Panda", 245000, 'G', 1500.00f);
		Vehiculos opel = new Vehiculos();
		
		opel.setMarca("Opel Astra");
		opel.setKms(15000);
		opel.setCombustible('D');
		opel.setPrecio(8331.29f);
		
		//Qué vehiculo tiene más km
		if(seat.getKms() > opel.getKms()) {
			System.out.println("El que más kilómetros tiene es " + seat);
		}else {
			System.out.println("El que más kilómetros tiene es " + opel);
		}

		//Cuál es el más caro
		if(seat.getPrecio() > opel.getPrecio()) {
			System.out.println("El coche más caro es " + opel);
		}else {
			System.out.println("El coche más caro es " + seat);
		}
	
		
	}

}
