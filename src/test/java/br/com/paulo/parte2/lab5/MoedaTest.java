package br.com.paulo.parte2.lab5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoedaTest {

	@Test
	public void deveConverterValorDeCincoReaisECinquentaCentavosParaValorPorExtenso() {
		Double valor = 5.50;
		String valorPorExtenso = new Moeda(Moeda.REAL)
				.converteParaValorPorExtenso(valor);

		assertEquals("cinco reais e cinquenta centavos", valorPorExtenso);
	}
	
	// TODO: Criar mais testes

}
