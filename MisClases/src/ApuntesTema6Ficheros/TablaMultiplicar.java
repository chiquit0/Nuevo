package ApuntesTema6Ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {

		FileWriter fw = null;
		BufferedWriter bw = null;
		Scanner ent = new Scanner(System.in);
		int num = 0;

		try {

			System.out.println("Introduce un número");
			num = ent.nextInt();
			fw = new FileWriter(new File("src/apuntestema6ficheros/tabla del " + num + ".txt"));
			bw = new BufferedWriter(fw);

			for(int i = 1; i <= 10; i++) {
				bw.write(num + " x " + i + " = " + (num * 1));
				bw.newLine();
			}

		}catch (IOException ex) {
			System.out.println("Error de E/S");
		}catch (InputMismatchException ex) {
			System.out.println("Introduce un número");
		}

		finally {
			try {
				if(bw != null && fw != null) {
					bw.close();
					fw.close();
				}
			}catch (Exception ex) {
				System.out.println("Error al cerrar");
			}
		}
	}
}
