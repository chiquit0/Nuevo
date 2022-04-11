package ApuntesTema5Fechas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lectura {

	public static void main(String[] args) {
	
		File fichero = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		
		
//		FileReader fr = new FileReader("C:\\Users\\USUARIO\\Desktop");
//		FileReader fr = new FileReader(fichero);
		
//		FileReader fr = new FileReader(new FileReader("C:\\Users\\USUARIO\\Desktop"));
	try {
		fichero = new File("C:\\Users\\USUARIO\\Desktop");
		fr = new FileReader(fichero);
		br = new BufferedReader(fr);
		
//		String linea = br.readLine();
//		
//		while(linea != null) {
//			System.out.println(linea);    
//			linea = br.readLine();
//		}
		String linea = " ";
		while(br.ready()) {
			linea = br.readLine();
			System.out.println(linea);
		}
	
		}catch(FileNotFoundException ex) {
		System.out.println("Fichero no encontrado");
		}catch(IOException ex) {
			System.out.println("Erros de lectura/escritura");
		}finally {
			if(br != null) {
				try {
					br.close();
				}catch(IOException ex) {
					System.out.println(ex.getMessage());	
				}
			}
		}
	}	
}
