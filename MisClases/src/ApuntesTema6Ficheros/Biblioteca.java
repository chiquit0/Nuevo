package ApuntesTema6Ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Biblioteca {

	public static void main(String[] args) {

		ArrayList<Libros> lista = new ArrayList<Libros>();

		File fichero = new File("C:\\Users\\USUARIO\\eclipse-workspace\\MisClases\\src\\Fichero.txt");
		FileReader fr = null;
		BufferedReader br = null;
		String linea = " ";

		if (!fichero.exists()) {
			System.out.println("El fichero no existe");
			System.exit(0);
		}
		try {
			fr = new FileReader(fichero);
			br = new BufferedReader(fr);

			while (br.ready()) {
				// Asi se lee una linea
				linea = br.readLine();
				lista.add(new Libros(linea.split(";")));
			}

			imprimir(lista);

		}catch (FileNotFoundException ex) {
			System.out.println("Fichero no encontrado");
		}catch (IOException ex) {
			System.out.println("Error de E/S");

		}

		finally {
			try {
				br.close();
			}catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
	}

	public static void imprimir(ArrayList<Libros> l) {

		for(Libros lib : l) {
			System.out.println(lib);
		}
	}
}
