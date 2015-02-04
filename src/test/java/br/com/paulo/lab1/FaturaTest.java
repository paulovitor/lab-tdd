package br.com.paulo.lab1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FaturaTest {

	@Test
	public void deveVerificarPagamentosAtrasados() {
		assertEquals("Pagamento feito com atraso de 5 dias", 5,
				new Fatura().verificaPgto("25/11/2010", "30/11/2010"));
		assertEquals("Pagamento feito com atraso de 30 dias", 30,
				new Fatura().verificaPgto("10/04/2011", "10/05/2011"));
	}

	@Test
	public void deveVerificarPagamentoEmDia() {
		assertEquals("Pagamento feito em dias", 0,
				new Fatura().verificaPgto("01/11/2010", "01/11/2010"));
	}

	@Test
	public void deveVerificarPagamentoComUmDiaDeAtraso() {
		assertEquals("Pagamento feito com atraso de 1 dia", 1,
				new Fatura().verificaPgto("27/12/2010", "28/12/2010"));
	}
}
