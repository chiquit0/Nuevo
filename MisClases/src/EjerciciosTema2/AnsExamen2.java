package EjerciciosTema2;

public class AnsExamen2 {

	public static void main(String[] args) {
		
		System.out.println(aleatorio(69));

	}

	public static int aleatorio(int num) {
		int veces = 0;
		int numAle = 0;
		
		for(int i=1 ; i<=100 ; i++) {
			numAle = (int)(Math.random() *100) + 1;
			if(num == numAle) {
				veces++;
			}
		}
		
		return veces;
	}
	
}
