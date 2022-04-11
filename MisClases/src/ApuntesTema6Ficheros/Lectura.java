package ApuntesTema6Ficheros;

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
		String linea = " ";
		int numLineas = 0, totalChar = 0, totalPalabras = 0;
		
		try {
			fichero = new File("C:\\Users\\clases\\Desktop\\sobremesas.txt");
			fr = new FileReader(fichero);
			br = new BufferedReader(fr);
			
			while(br.ready()) {
				linea = br.readLine();
				numLineas++;
				totalChar += linea.length();
				System.out.println(numLineas + " " + linea.length());
			}
			System.out.println(numLineas + " líneas " + totalChar + " caracteres.");
			
		}catch(FileNotFoundException ex) {
			System.out.println("Fichero no encontrado");
		}catch(IOException ex) {
			System.out.println("Error de lectura/escritura.");
		}finally {
			if(br != null ) {
				try {
					
				}catch(Exception ex) {
					
				}
			}
		}
		
		
		
		
	}

}
