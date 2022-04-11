package ApuntesTema4ClasesyObjetos;

public class Libros {
//	Crear una clase libro que contenga los siguientes atributos:
//	ISBN, titulo, autor, número de páginas
//	Crear sus respectivos métodos get y set correspondientes para cada atributo. Crear el método toString() para mostrar la información relativa al libro con el siguiente formato:
//	“El libro con ISBN creado por el autor tiene páginas”
//	En el fichero main, crear 2 objetos Libro (los valores que se quieran) y mostrarlos por pantalla.
//	Por último, indicar cuál de los 2 tiene más páginas
	
	
//Definir los atributos de la clase:
	public long ISBN;
	public String titulo;
	public String autor;
	public int numPag;
	
//Definir métodos:
	public Libros() {
		ISBN = 0;
		titulo = " ";
		autor = " ";
		numPag = 0;
	}
	
	public Libros(long ISBN, String titulo, String autor, int numPag) {
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;	
	}

//GETTERS:
	public long getISBN() {
		return ISBN;
	}
	 
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getnumPag() {
		return numPag;
	}
	
//SETTERS:
	public void setISBN(long ISBN) {
		this.ISBN = ISBN;  //el this hace referencia al atributo o a cualquier metodo de la clase
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void setnumPag(int numPag) {
		this.numPag = numPag;
	}
	
	public String toString() {
		return "El libro " + getTitulo() + " con ISBN " + getISBN() + " creado por el autor " + getAutor() + " tiene " + getnumPag() + " páginas.";
	}
}
