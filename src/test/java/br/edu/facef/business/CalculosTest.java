package br.edu.facef.business;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculosTest {

	private Calculos calculos;
	
	@Before
	public void init() {
		this.calculos = new Calculos();
	}
	
	@Test
	public void deveSomarNumerosPositivo() {
		
		Integer valor1 = 5;
		Integer valor2 = 10;
		Integer valorEsperado = 15;
		
		assertEquals(valorEsperado, 
				this.calculos.somar(valor1, valor2));
				
	}

	
	@Test
	public void deveSomarNumerosNegativos() {
		
		Integer valor1 = -10;
		Integer valor2 = -20;
		Integer valorEsperado = -30;
		
		assertEquals(valorEsperado, 
				this.calculos.somar(valor1, valor2));
				
	}
}
