package ApuntesTema1VariablesyBucles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		float resultado = Calculadora.suma(5.2f, 4.8f);
		float esperado = 10f;
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testResta() {
		float resultado = Calculadora.restar(5.2f, 4.2f);
		float esperado = 1.0F;
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testDivision() {
		float resultado = Calculadora.dividir(10f, 2f);
		float esperado = 5f;
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testMultiplicar() {
		float resultado = Calculadora.multiplicar(5f, 4f);
		float esperado = 20.0F;
		assertEquals(esperado, resultado);
	}


}
