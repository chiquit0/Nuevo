package ApuntesTema4ClasesyObjetos;

public class Animales {
	//Crear una aplicacion para la administracion de un zoologico. En el zoologico se almacenaran animales de todos los tipos y habitats. 
	//Será importante saber, para realizar un inventario, los siguientes datso de los animlaes (propiedades privadas):
	//Id del animal | Raza o especie | Hábitat (tierra, mar o aire) | Comida (carne, pescado o pienso) | Kg de comida al dia
	
	
	//Atributos:
	private int id;
	private String especie;
	private String habitat;
	private String comida;
	private float kg;
	
	//Definir métodos
	public Animales() {
		id = 0;
		especie = " ";
		habitat = " ";
		comida = " ";
		kg = 0.0f;
	}
	
	public Animales(int id, String especie, String habitat, String comida, float kg) {
		this.id = id;
		this.especie = especie;
		this.habitat = habitat;
		this.comida = comida;
		this.kg = kg;
	}


	//GETTERS
	public int getId() {
		return id;
	}

	public String getEspecie() {
		return especie;
	}

	public String getHabitat() {
		return habitat;
	}

	public String getComida() {
		return comida;
	}

	public float getKg() {
		return kg;
	}
	
	
	//SETTERS
	
	public void setId(int id) {
		this.id = id;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public void setComida(String comida) {
		this.comida = comida;
	}
	
	public void setKg(float kg) {
		this.kg = kg;
	}
	
	public String toString() {
		
		return getId()+ " - " + getEspecie() + " - " + getHabitat()+ " - " + getComida() + " - " + getKg();
	}
	
	
	
	
	
}
