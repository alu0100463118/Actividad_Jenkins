package com.LDH.Practica;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Clase principal de las pruebas del programa. En ella estan contenidas diferentes pruebas para comprobar el correcto funcionamiento del programa.
 */

public class AppTest {

	@Test
	public void test1() {
		int esperado = 2;
		int resultado = App.calcularDistancia("amor", "flor");
		assertEquals (esperado, resultado);
	}
	
	@Test
	public void test2() {
		String palabra1 = "amor";
		String palabra2 = "roma";
		assertNotSame (palabra1, palabra2);
	}
	
	@Test
	public void test3() {
		int esperado = 0;
		int resultado = App.calcularDistancia("amor", "amor");
		assertEquals (esperado, resultado);
	}
	
	
	@Test
	public void test4() {
		int esperado = 1;
		int resultado = App.calcularDistancia("aguacate", "aguacates");
		assertTrue ("Acierto", esperado == resultado);
	}
	
	@Test
	public void test5() {
		int esperado = 5;
		int resultado = App.calcularDistancia("aguacate", "aguacates");
		assertFalse ("Fallo", esperado == resultado);
	}

}
