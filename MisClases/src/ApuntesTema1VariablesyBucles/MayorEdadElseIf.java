package ApuntesTema1VariablesyBucles;

public class MayorEdadElseIf {

	public static void main(String[] args) {
		//Menor que < Mayor que >
		int day=5, month=0, year=2003;
		
//		if(year < 2003) {
			//Nacidos antes del 2003, tienen al menos 19 años
//			System.out.println("Es mayor de edad.1"); 
//		}else if(year==2003 && month < 10) {
			//Nacidos antes de octubre de 2003, tienen 18 años y pocos meses
//			System.out.println("Es mayor de edad.2");
//		}else if(year==2003 && month==10 && day<=5){
			//Nacidos antes de hoy (5/10/2003)
//			System.out.println("Es mayor de edad.3");
//		}else {
//			System.out.println("Es menor de edad");
			
		if( (year < 2003) || (year==2003 && month < 10) || (year==2003 && month==10 && day<=5) ) {  //Se puede poner así para ahorrar lineas de código
			System.out.println("Es mayor de edad");
		}else {
			System.out.println("Es menor de edad");
		}
		
		
//		switch(month) {
//		
//			case 1: 
//				month = enero;
//				break;
//			case 2:
//				month = febrero;
//				break;
//			case 3:
//				month = marzo;
//				break;
//			case 4:
//				month = abril;
//				break;
//			case 5: 
//				month = mayo;
//				break;
//			case 6:
//				month = junio;
//				break;
//			case 7:
//				month = julio;
//				break;
//			case 8:
//				month = agosto;
//				break;
//			case 9:
//				month = septiembre;
//				break;
//			case 10:
//				month = octubre;
//				break;
//			case 11:
//				month = noviembre;
//				break;
//			case 12:
//				month = diciembre;
//				break;
//			default:
//				System.out.println("Mes incorrecto");
//							
		}
		
//			System.out.println("Fecha completa: " + day + " de " + mes + " de " + year);
	}


