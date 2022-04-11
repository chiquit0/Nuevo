package ApuntesTema2M�todos;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		String user = "Lara", pass = "12345";
		String userIN= " ", passIN = " ";
		
		Scanner ent = new Scanner(System.in);
		System.out.println("Introduce el nombre de usuario: ");
		userIN = ent.nextLine();
		System.out.println("Introduce la contrase�a: ");
		passIN = ent.nextLine();
		
		verificar(user, pass, userIN, passIN);
	}

	public static void verificar (String user, String pass, String in, String pwd) {
			
		if(user.equals(in) && pass.equals(pwd)) {
			saludar(user);
		}else if(! user.equals(in)) {
			error(user);
		}else {
			error("");
		
		}
	
	}
		public static void error(String user) {
			if(! user.isEmpty()) {
				System.out.println("No existe el usuario " + user);
			}else {
				System.out.println("Contrase�a incorrecta.");
			}
	}

	public static void saludar(String nombre) {
		System.out.println("Login correcto, bienvenido " + nombre + ".");
		
	}
}
