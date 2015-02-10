package br.com.paulo.parte1.lab3;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.paulo.parte1.lab2.UFException;
import br.com.paulo.parte1.lab3.Embalagem;

public class EmbalagemTest {

	@Test
	public void testCalcularFreteAcimaUmKg() {
		assertEquals("Valor do Frete: ", new BigDecimal(62),
				new Embalagem().calculoPreco(3));
	}

	@Test
	public void testCalculaFreteAteUmKg() {
		assertEquals("Valor do Frete: ", new BigDecimal(24),
				new Embalagem().calculoPreco(1));
	}

	@Test
	public void testPrazoEntregaLocal() throws UFException {
		assertEquals("Entrega em 5 dias", 5,
				new Embalagem().prazoDestino("SP", "sp"));
	}

	@Test
	public void testPrazoEntregaForaEstado() throws UFException {
		assertEquals("Entrega em 15 dias", 15,
				new Embalagem().prazoDestino("BA", "SP"));
	}

}
