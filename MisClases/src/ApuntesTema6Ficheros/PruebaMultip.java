package ApuntesTema6Ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PruebaMultip {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		File dir = null;
		FileWriter fw = null;
		BufferedWriter bw = null;

		System.out.println("Introduce un directorio");
		dir = new File(ent.nextLine());

		if(!dir.exists()) {
			if(dir.mkdirs()) {
				System.out.println("Directorio creado.");
			}else {
				System.out.println("Error");
			}

		}

		// Bucle para las 10 tablas
		for(int i = 1; i < 10; i++) {
			try {
				// Generamos un objeto writer por cada fichdro independiente
				fw = new FileWriter(dir + "\\tabla.del." + i + ".txt");
				bw = new BufferedWriter(fw);
				// Bucle que genera las tablas
				for(int j = 1; j <= 10; j++) {
					bw.write(i + " X " + j + " = " + (i * j));
					bw.newLine();
				}

			}catch (IOException ex) {
				System.out.println("Error de E/S");
			}finally {
				try {
					if(bw != null) {
						bw.close();
					}
					if(fw != null) {
						fw.close();
					}
				}catch(Exception ex) {
					System.out.println(ex.getMessage());
				}
			}
		}
	}
}
