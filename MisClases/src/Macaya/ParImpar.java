package Macaya;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Random;

public class ParImpar {

	public static void main(String[] args) {

		Random a = new Random();
		File par = new File("Par.txt");
		File impar = new File("Impar.txt");

		FileWriter fwPar = null;
		FileWriter fwImpar = null;
		BufferedWriter bwPar = null;
		BufferedWriter bwImpar = null;
		PrintWriter pw = null;

		try {
			fwPar = new FileWriter(par);
			fwImpar = new FileWriter(impar);
			pw = new PrintWriter(fwPar);
			
			
			for(int i = 0; i < 50; i++) {
				int numero = a.nextInt(100);
				System.out.println(numero);
				if(numero % 2 == 0) {
					pw.write(numero);
				}else {
					bwImpar.write(numero);
				}
			}
			
			fwPar.close();
			fwImpar.close();
			
		}catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
