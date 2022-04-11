package ApuntesTema2Métodos;

public class Aleatorio {

	public static void main(String[] args) {
		
		aleatorio(2, 15);
		
	}
	public static void aleatorio(int num1, int num2) {

		int numAle = (int)(Math.random() * (num2 + 1 - num1) ) + num1;
		
		System.out.println(numAle);

	}
}
