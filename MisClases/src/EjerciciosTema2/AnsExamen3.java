package EjerciciosTema2;

import java.util.Scanner;

public class AnsExamen3 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		int day = 0, month = 0, year = 0;
		
		do {
			System.out.println("Día");
			day = ent.nextInt();
			System.out.println("Mes");
			month = ent.nextInt();
			System.out.println("Año");
			
			year = ent.nextInt();
		
		
		}while(! checkFecha(day, month, year));

		System.out.println("La fecha es " + day + nombMes(month) + " " +  year);
	}
	
	public static String nombMes(int month) {
		String mes = " ";
		
		
		return mes;
	}
	
	
	public static boolean checkFecha(int d, int m, int y) {
		boolean valida = false;
		
		if( (m==11 || m==4 || m==6 || m==9) && (d >= 1 && d<=30) ) {
			valida = true;
		}else if( (m==2 && (d>=1 && d<=28)) || (d>=1 && d<= 29) && y%4 == 0)  {
			valida = true;
		}else if( (m>=1 && m<=12) && (d>=1 && d<=31) ) {
			valida = true;
		}
		return valida;
	}
}
