package ApuntesTema6Ficheros;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Parking {

	private String matricula;
	private String propietario;
	private String modelo;
	private LocalTime hInicio;
	private LocalTime hFinal;
	public DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m");
	
	
	public Parking() {
		matricula = " ";
		propietario = " ";
		modelo = " ";
		hInicio = LocalTime.now(); //Le ponemos la hora de inicio por defecto la hora actual
		hFinal = LocalTime.now().plusMinutes(15);
	}
	
	public Parking (String matricula, String propietario, String modelo, LocalTime hInicio, LocalTime hFinal) {
		this.matricula = matricula;
		this.propietario = propietario;
		this.modelo = modelo;
		this.hInicio = hInicio;
		this.hFinal = hFinal;
	}
	
	public Parking (String[] datos) {
		
	this.matricula = datos[0];
	this.propietario = datos[1] + " " + datos[2] + " " + datos[3];
	this.modelo = datos[4];
	this.hInicio = LocalTime.parse(datos[5], df);
	this.hFinal = LocalTime.parse(datos[6], df);
	
	}
	
	
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public LocalTime gethInicio() {
		return hInicio;
	}

	public void sethInicio(LocalTime hInicio) {
		this.hInicio = hInicio;
	}

	public LocalTime gethFinal() {
		return hFinal;
	}

	public void sethFinal(LocalTime hFinal) {
		this.hFinal = hFinal;
	}

	public DateTimeFormatter getDf() {
		return df;
	}

	public void setDf(DateTimeFormatter df) {
		this.df = df;
	}

	public String getTotal() {
		//Para saber el tiempo total que ha estado y calcular el precio
		long dur = Duration.between(hInicio, hFinal).toMinutes();
		float total = 0.5f*dur;
		
		
		return total + "€ por " + dur + " minutos";
	}
	
	public String toString() {
		return "Matricula " + getMatricula() + "\n" +
				"Propietario " + getPropietario() + "\n" +
				"Total a pagar: " + getTotal();
 	}
	
}
