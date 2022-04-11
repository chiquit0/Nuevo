package ApuntesTema4ClasesyObjetos;

import java.util.ArrayList;

public class Zoo {

	public static void main(String[] args) {
		//Dar de alta 8 animales en en el zoo: 2.5p
		//Crear un informe con la siguiente información: 
		//-Generar un lista de los animales agrupados por habitat
		//-Calcular los costes de mantenimiento diario de cada tipo de jaula si:
				//Las terrestres son 15€ al día
				//Las jaulas de las aver 20€ al día
				//Los estanques 45€ al día
		
		String[] habitat = new String[] {"Tierra", "Mar", "Aire"};
		String[] comida = new String[] {"Carne", "Pienso", "Otros"};
		float[] totales = new float[3];
		int[] jaulas = new int[3];
		float[] precios = new float[] {15.0f, 45.0f, 20.0f};
		
		ArrayList<Animales> lista = new ArrayList<Animales>(); 
		//int id, String especie, String habitat, String comida, float kg
		lista.add(new Animales(1, "Ornitorrinco", "Mar", "Otros", 2.5f));
		lista.add(new Animales(2, "León", "Tierra", "Carne", 1.33f));
		lista.add(new Animales(3, "Zebra", "Tierra", "Pienso", 32.5f));
		lista.add(new Animales(4, "Ballena", "Mar", "Otros", 5.6f));
		lista.add(new Animales(5, "Delfín", "Mar", "Carne", 2.7f));
		lista.add(new Animales(6, "Cacatúa", "Aire", "Pienso", 0.5f));
		lista.add(new Animales(7, "Loro", "Aire", "Pienso", 1.2f));
		lista.add(new Animales(8, "Jirafa", "Tierra", "Otros", 2.4f));
		
		System.out.println(lista.size()); //Nos da la cantidad de animales que hay
		
		for(int i=0; i<habitat.length ; i++) { //Recorre los habitats: tierra(0), mar(1), aire(2)
			System.out.println("Animales de " + habitat[i]);
			for(int j=0 ; j<lista.size() ; j++) { //Para recorrer todas las listas
			//Desde 0(int j=0), mientras sea menor que 8(j<lista.size(), de uno en uno (j++)
				if(habitat[i].equals(lista.get(j).getHabitat())) { //habitat[i] devuelve un string, con .equals(que compara 2 strings) comparamos los strings habitat
					System.out.println("\t " + lista.get(j));
					jaulas[i]+= precios[i];
				}
				if(comida[i].equals(lista.get(j).getComida())) {
					totales[i] += lista.get(j).getKg() *7;
				}
			
			}
		}
		
		for(int i=0; i<comida.length ; i++) {
			System.out.println("Total de " + comida[i]+ " a comprar " + totales[i]);
			System.out.println("Total de mantenimiento de jaulas " + habitat[i] + " es de " + jaulas[i]);
		}
		
	}
}
