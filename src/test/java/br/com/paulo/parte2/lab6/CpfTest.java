package br.com.paulo.parte2.lab6;

import static org.junit.Assert.*;

import org.junit.Test;

public class CpfTest {

	@Test
	public void deveValidarCpfValido() {
		assertTrue(new Cpf().validar("123.456.789-09"));
	}

	@Test
	public void deveValidarCpfComDigitoVerficadorInvalido() {
		assertFalse(new Cpf().validar("123.456.789-08"));
	}

	@Test
	public void deveValidarCpfComMenosDeOnzeNumeros() {
		assertFalse(new Cpf().validar("123.456.789"));
	}

	@Test
	public void deveValidarCpfComCaracteresInvalidos() {
		assertFalse(new Cpf().validar("123.456.789/09"));
	}

}
