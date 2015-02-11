package br.com.paulo.pate2.lab3;

import static org.junit.Assert.assertEquals;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;

public class IdadeTest {

	@Test
	public void deveCalcularIdadeParaPessoaQueNaoFezAniversario() {
		DateTime aniversario = getAniversario("10/10/2005");

		assertEquals(9, new Idade().calcula(aniversario));
	}

	@Test
	public void deveCalcularIdadeParaPessoaQueJaFezAniversario() {
		DateTime aniversario = getAniversario("10/01/2005");

		assertEquals(10, new Idade().calcula(aniversario));
	}

	private DateTime getAniversario(String niver) {
		DateTimeFormatter pattern = DateTimeFormat.forPattern("dd/MM/yyyy");
		DateTime aniversario = pattern.parseDateTime(niver);
		return aniversario;
	}

}
