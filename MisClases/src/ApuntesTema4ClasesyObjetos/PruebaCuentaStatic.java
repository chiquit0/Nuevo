package ApuntesTema4ClasesyObjetos;

public class PruebaCuentaStatic {

	public static void main(String[] args) {
		
//		System.out.println(Cuentas.total);
		
		Cuentas laro = new Cuentas("Laro", 100);
		
		System.out.println(laro);
		
//		System.out.println(Cuentas.total);
		
		Cuentas angel = new Cuentas("Angel", 50);
		
//		System.out.println(Cuentas.total);
		System.out.println(laro);
		System.out.println(angel);
		
		laro.retirar(30);
		angel.ingresar(30);
//		System.out.println(Cuentas.total);

	}

}
