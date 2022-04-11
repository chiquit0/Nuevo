package EjerciciosTema4;

public class VideoClub {

	//Atributos
	private int codigo;
	private String titulo;
	private String genero;
	private int udsStock;
	
	public VideoClub() { 
		codigo = 0;
		titulo = " ";
		genero = " ";
		udsStock = 0;
	}
	
	public VideoClub(int codigo, String titulo, String genero, int udsStock) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.genero = genero;
		this.udsStock = udsStock;
	}

	//GETTERS:
	public int getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public String getGenero() {
		return genero;
	}
	
//	public int getUdsStock() {
//		return udsStock;
//	}
	
	public String getUdsStock() {
		
		String stock = " ";
		
		if(this.udsStock == 0) {
			stock = "No disponible";
		}else {
			stock = String.valueOf(this.udsStock);
		}
		
		return stock;
	}
	
	//SETTERS:
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setUdsStock(int udsStock) {
		this.udsStock = udsStock;
	}
	
	public String toString() {
		
		return "La película " + getTitulo() + ", del género " + getGenero() +  ", con código " + getCodigo() + ", tiene " + getUdsStock() + " unidades en stock.";
	}
	
}
