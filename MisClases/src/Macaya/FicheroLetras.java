package Macaya;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FicheroLetras {

	public static void main(String[] args) {
		//Un texto leido por un fichero
		//Contras vocales, consonantes y espacios
		//La información se copia en otro fichero
		
		
		//El punto muestra la ruta en la que te encunetras
		File raiz = new File("."); 
		//getAbosultePath te da la ruta a la que estás apuntando
		System.out.println(raiz.getAbsolutePath()); 
		
		//También sirve con una /
		File noticia = new File("src\\Noticia.txt"); 
		if(!noticia.exists()) {
			System.out.println("EL fichero no existe");
			System.exit(0);
		}
		
		FileWriter fw = null;
		PrintWriter pw = null;
		FileReader fr = null;
		BufferedReader br = null;
		int[] contador= {0,0,0}; //El primero es para vocales, el segundo es para consonantes y el tercero para espacios
		
		try {
			fr = new FileReader(noticia);
			br = new BufferedReader(fr);
			
			String linea = "";
			while((linea = br.readLine())!=null) {
				for(int i=0 ; i<linea.length(); i++) {
					char letra = linea.charAt(i);
					if(isVocal(letra)) {
						contador[0]++;
					}else if (isConsonante(letra)) {
						contador[1]++;
					}else if(isEspacio(letra)) {
						contador[2]++;
					}
				}
			}
			
			fr.close();
			br.close();
					
		}catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		try {
			fw = new FileWriter(new File("Noticias_informe.txt"));
			pw = new PrintWriter(fw);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
	//Función para comprobar si las letras son vocales o no
	public static boolean isVocal(char letra) {
		String vocales = "aeiou";
		char letraMin = Character.toLowerCase(letra);
		
		if(vocales.indexOf(letraMin) >= 0) {
			return true;
		}
		return false;
	}
	
	//Función para comprobar si las letras son consonantes o no
	public static boolean isConsonante(char conson) {
		String consonante = "bcdfghjklmnñpqrstvwxyz";
		char letraCons = Character.toLowerCase(conson);
		
		if(consonante.indexOf(letraCons) >= 0) {
			return true;
		}
		return false;
	}
	//Función para saber cuantos espacios hay en el fichero
	public static boolean isEspacio(char esp) {
		if(esp==' ') {
			return true;
		}
		return false;
	}
}
