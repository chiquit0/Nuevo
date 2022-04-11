package ApuntesTema6Ficheros;

import java.io.Serializable;

public class Libros implements Serializable{

//Definir los atributos de la clase:
	public int ISBN;
	public String titulo;
	public String autor;
	public int stock;
	
//Definir métodos:
	public Libros() {
		ISBN = 0;
		titulo = " ";
		autor = " ";
		stock = 0;
	}
	
	public Libros(int ISBN, String titulo, String autor, int stock) {
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.stock = stock;	
	}
	
	public Libros(String[] libro) {
		this.ISBN = Integer.parseInt(libro[0]);
		this.titulo = libro[1];
		this.autor = libro[2];
		this.stock = Integer.valueOf(libro[3]);
	}
	
//GETTERS:
	public int getISBN() {
		return ISBN;
	}
	 
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getStock() {
		return stock;
	}
	
//SETTERS:
	public void setISBN(int ISBN) {
		this.ISBN = ISBN; 
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void setnumPag(int stock) {
		this.stock = stock;
	}
	
	public String toString() {
		return "El libro " + getTitulo() + " con ISBN " + getISBN() + " creado por el autor " + getAutor() + " tiene " + getStock() + " ejemplares en stock.";
	}
}
