package br.com.paulo.lab2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FreteTest {

	@Test
	public void testPrazoEntregaLocal() throws UFException {
		assertEquals("Entrega em 5 dias", 5,
				new Frete().prazoDestino("SP", "sp"));
	}

	@Test
	public void testPrazoEntregaForaEstado() throws UFException {
		assertEquals("Entrega em 15 dias", 15,
				new Frete().prazoDestino("BA", "SP"));
	}

	@Test(expected = UFException.class)
	public void deveValidaUFInexistente() throws UFException {
		assertEquals("UF inexistente", new Frete().prazoDestino("PL", "RJ"));
	}

	@Test(expected = UFException.class)
	public void deveValidaUFInvalida() throws UFException {
		assertEquals("UF inválido",
				new Frete().prazoDestino("SP", "Rio de Janeiro"));
	}

	@Test(expected = UFException.class)
	public void deveValidaUFVazia() throws UFException {
		assertEquals("UF nula", new Frete().prazoDestino("SP", null));
	}

}
