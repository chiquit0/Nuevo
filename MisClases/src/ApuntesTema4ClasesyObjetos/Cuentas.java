package ApuntesTema4ClasesyObjetos;

public class Cuentas {

	//Crea una clase llamada Cuentas que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).
	//El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.
	//Crea sus métodos get, set y toString (no me vale el de por defecto).
	
	//Atributos:
	private String titular;
	private float saldo;
	private static float total = 0.0f;
	
	public Cuentas(String titular) {
		this.titular = titular;
		this.saldo = 0;
	}
	
	public Cuentas(String titular, float cantidad) {
		this.saldo = cantidad;
		this.titular = titular;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public float getCantidad() {
		return saldo;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setCantidad(float cantidad) {
		total = total - saldo + cantidad;
		this.saldo = cantidad;
	}
	
	public void ingresar(double cantidad) {
		if(cantidad > 0 ) {
			this.saldo += (float)cantidad; 
			total += (float) cantidad;
		}
	}
	
	public double retirar(double cantidad) {
		
		if(cantidad < this.saldo && cantidad > 0) {
			this.saldo -= cantidad;
			total -= cantidad;
		}else { 
			System.out.println("Imposible sacar " + cantidad + ". Se retirará " + this.saldo);
			total -= this.saldo;
			this.saldo = 0;
		}
		
		return this.saldo;
	}
	
	public String toString() {
		return "Cuenta: \n\t Titular: " + getTitular() + "\n\t Saldo=" + getCantidad();
	}
	
}
