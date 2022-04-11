package Macaya;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ficheros {

	public static void main(String[] args) {

		Scanner lec = null;
		Scanner ent = new Scanner(System.in);
		boolean continuar = true;
		int num = 0;
		File fichero = new File("Fichero.txt");
		FileWriter salida = null;
		PrintWriter writer = null;
		
		try {
			salida = new FileWriter(fichero, true);
			writer = new PrintWriter(salida);
			do{
				System.out.println("Introduce un número:");
				num = ent.nextInt();
				writer.println(num);
				if(num < 0) {
					continuar = false;
				}
			}while (continuar);

			salida.close();
		}catch (IOException e) {

		}

		try {
			lec = new Scanner(fichero);

			while (lec.hasNextInt()) {
				int n = lec.nextInt();
				System.out.println(n);
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		FileReader lector;
		BufferedReader leerFichero;
		String linea = null;

		if(fichero.exists()) {
			try {
				lector = new FileReader(fichero);
				leerFichero = new BufferedReader(lector);

				while ((linea = leerFichero.readLine()) != null) {
					System.out.println(linea);
				}
				leerFichero.close();
				
				lector.close();
			}catch (FileNotFoundException e) {
				System.out.println("EL fichero no existe");
			}catch (IOException e) {
				System.out.println("Error al leer el fichero");
			}

		}else {
			System.out.println("El fichero no existe");
		}
	}
}
