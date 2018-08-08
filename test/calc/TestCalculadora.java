package calc;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadora {

	@Test
	public void testDiaria1eKMnaMedia() {
		
		Calculadora c = new Calculadora();
		float v = c.valor(1, 100);
		if( v != 90 ){
			fail("Valor incorreto - esperava 90 - veio " + v);
		}
	}
	
	
	@Test
	public void testDiaria5eKMEstourado() {
		
		Calculadora c = new Calculadora();
		float v = c.valor(5, 550);
		if( v != 950 ){
			fail("Valor incorreto - esperava 950 - veio " + v);
		}
	}
	
	@Test
	public void testDiaria6eKMnaMedia() {
		
		Calculadora c = new Calculadora();
		float v = c.valor(6, 600);
		if( v != 480 ){
			fail("Valor incorreto - esperava 480 - veio " + v);
		}
	}
	
	@Test
	public void testDiaria16eKMnaMedia() {
		
		Calculadora c = new Calculadora();
		float v = c.valor(16, 1600);
		if( v != 1120 ){
			fail("Valor incorreto - esperava 1120 - veio " + v);
		}
	}

}
