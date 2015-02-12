package br.com.paulo.parte2.lab4;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class ConsumoEletricoTest {

	private static final double VALOR_KWH_DF = 0.24341;
	private static final double DELTA = 0.01;

	@Test
	public void deveCalcularCustoDeConsumoEletricoDeUmChuveiroEmUmaHora() {
		ArrayList<AparelhoEletrico> aparelhos = new ArrayList<AparelhoEletrico>();
		aparelhos.add(new Chuveiro());
		Double valor = new ConsumoEletrico(new Cidade("DF", new Double(
				VALOR_KWH_DF))).calculaCustoDeConsumoEletrico(aparelhos, 1);

		assertEquals(new Double(0.58), valor, DELTA);
	}

}
