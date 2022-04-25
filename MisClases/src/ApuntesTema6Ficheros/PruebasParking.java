package ApuntesTema6Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import ApuntesTema4ClasesyObjetos.Vehiculos;

public class PruebasParking {

	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		ArrayList<Parking> lista = new ArrayList<Parking>();
		
		try {
			fr = new FileReader("C:\\Users\\USUARIO\\git\\repository\\MisClases\\parking.csv");
			br = new BufferedReader(fr);
			
			while(br.ready()) {
				lista.add(new Parking(br.readLine().split(";")));
			}
			
			System.out.println("Leidos " + lista.size() + " vehiculos");
			System.out.println("***************");
			for(Parking v : lista) {
				System.out.println(v);
				System.out.println("*****************");
			}
			
			
		}catch(FileNotFoundException ex) {
			System.out.println("Fichero no encontrado");
		}catch(IOException ex) { //Para el br.ready, ya que necesita la excepcion por si no se puede leer el fichero
			System.out.println("Erros de E/S");
		}
	}

}
