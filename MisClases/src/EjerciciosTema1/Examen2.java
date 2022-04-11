package EjerciciosTema1;

import java.text.DecimalFormat;

public class Examen2 {

	public static void main(String[] args) {
		
		float c = 0.0f;
//		DecimalFormat df = new DecimalFormat("##,##")
		
		for(int f=0 ; f <= 300 ; f += 20) {
			c=(float)(f -32)*5 / 9;
//			System.out.println(f + "ºF = "+ df.format(c) + "ºC");
	}
	}
}
