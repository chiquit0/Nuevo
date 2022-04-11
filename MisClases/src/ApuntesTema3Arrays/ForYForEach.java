package ApuntesTema3Arrays;

public class ForYForEach {

	public static void main(String[] args) {
	
		//Array donde hay nombres almacenados
		String[] nombres  = {"Alejandro", "Gabriel", "Maria", "Lucia", "Paula", "Jana"};
		
		//Hacemos un bucle for para que salgan todos los nombres por pantalla
		
		//Sintaxis: for(inicialización int i=0 ; condición i<X ; aumento o decremento i++ | i--) {
		//				INSTRUCCIONES (SYSO, IF ELSE...)
		for(int i=0 ; i<6 ; i++) {
			System.out.println(nombres[i]);
		}
		//INT SIEMPRE ES I=0, I<6 SIGNIFICA QUE EL BUCLE VA A FUNCIONAR SIEMPRE QUE I NO PASE DE 7, YA QUE SOLO HAY 6 NOMBRES
		//POR LO TANTO EL BUCLE VA A RECORRER EL ARRAY 6 VECES MOSTRANDONOS LOS 6 NOMBRES
		//I++ PARA QUE VAYA RECORRIENDO EL ARRAY DE 1 EN 1
	
	}

}
