package ApuntesTema4ClasesyObjetos;

public class PruebaVehiculos {

	public static void main(String[] args) {
		//EN UNA CLASE CON METODO MAIN, GENERAR 2 INSTANCIAS DE 2 VEHICULOS, UTILIZANDO LOS METODOS SET, DAR VALORES A LOS ATRIBUTOS.
		//MOSTRAR POR PANTALLA QUE VEHICULO TIENE M�S KM Y CUAL ES EL M�S CARO
		
		//Dos maneras diferentes de instanciar la informaci�n
		Vehiculos seat = new Vehiculos("Seat Panda", 245000, 'G', 1500.00f);
		Vehiculos opel = new Vehiculos();
		
		opel.setMarca("Opel Astra");
		opel.setKms(15000);
		opel.setCombustible('D');
		opel.setPrecio(8331.29f);
		
		//Qu� vehiculo tiene m�s km
		if(seat.getKms() > opel.getKms()) {
			System.out.println("El que m�s kil�metros tiene es " + seat);
		}else {
			System.out.println("El que m�s kil�metros tiene es " + opel);
		}

		//Cu�l es el m�s caro
		if(seat.getPrecio() > opel.getPrecio()) {
			System.out.println("El coche m�s caro es " + opel);
		}else {
			System.out.println("El coche m�s caro es " + seat);
		}
	
		
	}

}
