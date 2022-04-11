package ApuntesTema6Ficheros;

import java.io.File;
import java.io.IOException;

public class Directorios {

	public static void main(String[] args) {

//		File directorios = new File("C:\\Users\\USUARIO\\Desktop");
//		
//		
//		
//		//Devuelve un array de strings con la ruta de los directorios que hemos indicado arriba
//		//Ya que devuelve un array, metemos el "directorios.list" dentro de un array de Strings

		// String lista[] = directorios.list();
//		
//		//Con el bucle for each se muestran todos los ficheros dentro de la ruta que hemos indicado al principio
//		for(String file : lista) {
//			System.out.println(file);
//		}
//	}

//*******************************************************************************************************************************	

//		File directorio = new File("C:\\Users\\USUARIO\\Desktop");
//		File fich = null;
//		
//		String lista[] = directorio.list();
//		
//		for(String file : lista) {
//			fich = new File(file);
//			//Con el if estamos comprobando si el archivo es un directorio o no
//			if(fich.isDirectory()) {
//				System.out.println(fich.getName());
//			}
//		}
//	

//********************************************************************************************************************************

//		File directorio = new File("C:\\Users\\USUARIO\\Desktop");
//
//		File[] lista = directorio.listFiles();
//
//		for (int i = 0; i < lista.length; i++) {
//			try {
//				if (lista[i].isDirectory()) {
//					System.out.println(lista[i].getCanonicalPath());
//				}
//			} catch (IOException ex) {
//				System.out.println(ex.getMessage());
//			}
//		}

//********************************************************************************************************************************

//		File directorio = new File("C:\\Users\\USUARIO\\Desktop");
//		File[] lista = directorio.listFiles();
//		String nomDirec = " ", nomFich = " ";
//		int conD = 0, conF = 0;
//		
//		for (int i = 0; i < lista.length; i++) {
//			if (lista[i].isDirectory()) {
//				nomDirec += lista[i].getName() + "\n";
//				conD++;
//			}else {
//				nomFich += lista[i].getName() + "\n";
//				conF++;
//			}
//			
//		}
//		
//		System.out.println("Lista de directorios \n" + nomDirec + "\n Total directorios: " + conD);
//		System.out.println("lista de ficheros \n" + nomFich + "\n Total ficheros: " + conF);

//********************************************************************************************************************************

//		File directorio = new File("C:\\Users\\USUARIO\\Desktop");
//		File[] lista = directorio.listFiles();
//		File maxFile = lista[0];
//		
//		
//		for(int i=0 ; i<lista.length ; i++) {
//				if(maxFile.length() < lista[i].length()) {
//					maxFile = lista[i];
//				}
//			}
//		For(File f : lista){
//			if(maxFile.length() < f.length()) {
//				maxFile = f;
//			}
//		}
//		System.out.println(maxFile.getName() + " " + (maxFile.length()/1024.00f));

//*********************************************************************************************************************************	

		File fichero = new File("texto.txt");
		try {
			if (fichero.createNewFile()) {
				System.out.println("Fichero creado");
			}else {
				System.out.println("Error al crear el fichero");
			}

		}catch(IOException ex) {
			System.out.println(ex.getMessage());

		}

	}
}
