package ApuntesTema5Fechas;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ManejoExcep3 {

	public static void main(String[] args) {
		
	try {
		leerFichero(9);
		System.out.println("main");
	}catch(FileNotFoundException ex) {
		System.out.println("Error FileNotFoundException");
	}catch(IOException ex) {
		System.out.println("Error IOException");
	}catch(Exception ex) {
		System.out.println("Error Exception");
	}
}

	public static void leerFichero(int op)throws IOException, FileNotFoundException, Exception {
		System.out.println("Método leer y buscar");
		if(op == 1) {
			throw new IOException();
		}else if(op == 2) {
			throw new FileNotFoundException();
		}else {
			throw new IllegalAccessException();
		}
	}
	
}
