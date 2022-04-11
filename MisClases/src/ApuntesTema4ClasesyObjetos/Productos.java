package ApuntesTema4ClasesyObjetos;

public class Productos {

	//Atributos
	public int cant, dto;
	private String desc;
	private double precio;
	
	public Productos() {
		cant = 0;
		desc = " ";
		precio = 0.0;
		dto = 0;
	}
	
	public Productos(int cant, String nombre, double precio, int dto) {
		this.cant = cant;
		this.desc = nombre;
		this.precio = precio;
		this.dto = dto;
		
	}
	
	public Productos(int cant, String nombre, double precio) {
		this.cant = cant;
		this.desc = nombre;
		this.precio = precio;
		this.dto = 0;
		
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		if(cant > 0) {
			this.cant = cant;
		}else {
			this.cant = 0;
		}
	}

	public int getDto() {
		return dto;
	}

	public void setDto(int dto) {
		if(dto > 0) {
			this.dto = dto;
		}else {
			this.dto = 0;
		}
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		if(!desc.isEmpty()) {
			this.desc = desc;
		}else {
			this.desc = "Descripción genérica.";
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if(precio > 0) {
			this.precio = precio;
		}else {
			this.precio = 0;
		}
	}
	public double getCantDTO() {
		return ((double)dto/100) * precio;
	}
	
	public double getTotal() {
		return getCant() + (getPrecio() - getCantDTO());
		
	}
	
	public String toString() {
		
		return getCant() + " " + getDesc() + " " + getPrecio() + " " + getTotal();
		}
}
	
	
	
	

