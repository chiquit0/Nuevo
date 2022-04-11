package ApuntesTema6Ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ceinmark {

	public static void main(String[] args) {

//		Profesores Maria = new Profesores();
//		Profesores Claudia = new Profesores();
//		Profesores Marta = new Profesores();
//		File datos = new File("C:\\Users\\clases\\drive\\2021_2022\\PROG\\ficheros.prueba");

		ArrayList<Libros> lista = new ArrayList<Libros>();
		File datos = new File("C:\\Users\\USUARIO\\eclipse-workspace\\MisClases");
		
		FileReader fr = null;
		BufferedReader br = null;
		String linea = " ";
		Profesores prof = null;
		
		ArrayList<Profesores> listaP = null;
		String[] datosProf = null;

		for(File f : datos.listFiles()) {
			if(f.getName().equalsIgnoreCase("profesores.csv")) {
				try {
					fr = new FileReader(f);
					br = new BufferedReader(fr);
				}catch (FileNotFoundException ex) {
					System.out.println("Fichero no encontrado");
				}
			}
		}
		
		try {
			while(br.ready()) {
				linea = br.readLine();
//				datosProf = linea.split(";");
//				prof = new Profesores();
//				prof.setNombre(datosProf[0] + " " + datosProf[1] + " " + datosProf[2]);
//				prof.setDni(datosProf[3]);
//				prof.setAsignatura(datosProf[4].split("/"));
//				prof.setSalario(Double.parseDouble(datosProf[5]));
				
//				listaP.add(prof);
				
				listaP.add(new Profesores());
			}
			
			for(Profesores p: listaP) {
				System.out.println(p);
			}
			
		}catch(IOException ex) {
			System.out.println("Error de E/S del fichero");
		}catch(NumberFormatException ex) {
			System.out.println("Error al leer importes");
		}
	}
}
