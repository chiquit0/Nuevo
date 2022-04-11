package ApuntesTema4ClasesyObjetos;

public class Libros {
//	Crear una clase libro que contenga los siguientes atributos:
//	ISBN, titulo, autor, n�mero de p�ginas
//	Crear sus respectivos m�todos get y set correspondientes para cada atributo. Crear el m�todo toString() para mostrar la informaci�n relativa al libro con el siguiente formato:
//	�El libro con ISBN creado por el autor tiene p�ginas�
//	En el fichero main, crear 2 objetos Libro (los valores que se quieran) y mostrarlos por pantalla.
//	Por �ltimo, indicar cu�l de los 2 tiene m�s p�ginas
	
	
//Definir los atributos de la clase:
	public long ISBN;
	public String titulo;
	public String autor;
	public int numPag;
	
//Definir m�todos:
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
		return "El libro " + getTitulo() + " con ISBN " + getISBN() + " creado por el autor " + getAutor() + " tiene " + getnumPag() + " p�ginas.";
	}
}
