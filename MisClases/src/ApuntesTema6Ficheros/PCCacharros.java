package ApuntesTema6Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PCCacharros {

	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		FileWriter fw = null;
		String linea = " "; 
		String[] producto = null;
		int stockMinimo = 5;
		
		try {
			fr = new FileReader("C:\\Users\\USUARIO\\git\\repository\\MisClases\\tarifa.csv");
			br = new BufferedReader(fr);
			fr = new FileReader("C:\\Users\\USUARIO\\git\\repository\\MisClases\\pedidos.csv");
			bw = new BufferedWriter(fw);
			
			try {
				br.readLine();
				while(br.ready()) {
					linea = br.readLine();
					producto = linea.split(";");
					if(Integer.parseInt(producto[4]) < stockMinimo) {
						bw.write(genLinea(producto, stockMinimo));
						bw.newLine();
					}
				}
				
			}catch(IOException ex) {
				System.out.println("Error E/S");
			}
			
		}catch(FileNotFoundException ex) {
			System.out.println("FileNotFoundException");
		}
	
		finally{
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
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
		
	public static String genLinea(String[] prod, int stockMinimo) {
		int cant = stockMinimo - Integer.parseInt(prod[4]);
		return prod[0]+ ";"+prod[1]+";"+cant;
		}
	}

