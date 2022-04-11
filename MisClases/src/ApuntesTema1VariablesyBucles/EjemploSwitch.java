package ApuntesTema1VariablesyBucles;

public class EjemploSwitch {

	public static void main(String[] args) {
		
//		int diaSemana = 5;
		
//		switch (diaSemana) {
		
//			case 1:
//				System.out.println("Hoy es lunes");
//				break;
//			case 2:
//				System.out.println("Hoy es martes");
//				break;
//			case 3:
//				System.out.println("Hoy es miércoles");
//				break;
//			case 4:
//				System.out.println("Hoy es jueves");
//				break;
//			case 5:
//				System.out.println("Hoy es viernes");
//				break;
//			case 6:
//				System.out.println("Hoy es sábado");
//				break;
//			case 7:
//				System.out.println("Hoy es domingo");
//				break;
//			default: 
//				System.out.println("Día de la semana incorrecto");
		
		int dia = 1;
		
		switch(dia) {
		
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Hoy es laborable");
			break;
		case 6:
		case 7:
			System.out.println("Hoy es no laborable");
			break;
	    default:
	    	System.out.println("Día erroneo");
		
		}
				
		if(dia >= 1 && dia <=5) {
			System.out.println("Hoy es laborable");
		}else if(dia >= 6 && dia <= 7) {
			System.out.println("Hoy no es laborable");
		}else {
			System.out.println("Día erroneo");
		}
				
		}

	}

