package Macaya;

import java.time.LocalDate;

public enum Zodiaco {

	ARIES(LocalDate.of(0, 3, 21), LocalDate.of(0, 4, 19)), 
	TAURO(LocalDate.of(0, 4, 20), LocalDate.of(0, 5, 21)),
	GEMINIS(LocalDate.of(0, 5, 21), LocalDate.of(0, 6, 20)),
	CANCER(LocalDate.of(0, 6, 21), LocalDate.of(0, 7, 22)), 
	LEO(LocalDate.of(0, 7, 23), LocalDate.of(0, 8, 22)), 
	VIRGO(LocalDate.of(0, 8, 23), LocalDate.of(0, 9, 22)), 
	LIBRA(LocalDate.of(0, 9, 23), LocalDate.of(0, 10, 22)),
	ESCORPIO(LocalDate.of(0, 10, 23), LocalDate.of(0, 11, 22)), 
	SAGITARIO(LocalDate.of(0, 11, 22), LocalDate.of(0, 12, 21)), 
	CAPRICORNIO(LocalDate.of(0, 12, 22), LocalDate.of(0, 1, 19)), 
	ACUARIO(LocalDate.of(0, 1, 20), LocalDate.of(0, 2, 18)), 
	PISCIS(LocalDate.of(0, 2, 19), LocalDate.of(0, 3, 20));
	
	private LocalDate inicio;
	private LocalDate fin;
	
	private Zodiaco(LocalDate inicio, LocalDate fin) {
		this.fin = fin;
		this.inicio = inicio;
	}

	public LocalDate getInicio() {
		return inicio;
	}

	public LocalDate getFin() {
		return fin;
	}

	
	
}
