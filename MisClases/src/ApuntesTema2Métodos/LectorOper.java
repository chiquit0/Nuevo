package ApuntesTema2Métodos;

import java.util.*;

public class LectorOper {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		String oper=" ";
		String num1=" ";
		String num2=" ";
		int n1=0, n2=0;
		char operacion= ' ';
		boolean terminada = false;
		
		System.out.println("Introduce una operación.");
		oper = ent.nextLine();

		//Bucle para leer la línea caracter a caracter
		for(int i=0 ; i<oper.length() ; i++) {
			if(Character.isDigit(oper.charAt(i)) && !terminada) {
					num1 += oper.charAt(i);
			}else if(Character.isDigit(oper.charAt(i)) && terminada) {
					num2 += oper.charAt(i);
			}else {
				operacion = oper.charAt(i);
				terminada=true;
			}
//			if(! Character.isDigit(oper.charAt(i))) {
//				operacion = oper.charAt(i);   
//				n1= Integer.parseInt(oper.substring(0,1));
//				n2= Integer.parseInt(oper.substring(i+1, oper.length()));
//				break;
//	
	}
	
//		n1=Integer.parseInt(num1);
//		n2=Integer.parseInt(num2);
//		
		switch(operacion) {
		
			case '+':
				System.out.println(n1+n2);
				break;
			case '-':
				System.out.println(n1-n2);
				break;
			case '*':
				System.out.println(n1*n2);
				break;
			case '/':
					if(n2 > 0) {
				System.out.println(n1/n2);
					}else {
						System.out.println("No deja dividir entre creo");
					}
				break;
			default:
				System.out.println("Operación no válida.");
		}
	}
}