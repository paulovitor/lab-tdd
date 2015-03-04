package br.com.paulo.parte2.lab1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.paulo.parte2.lab1.Email;

public class EmailTest {

	@Test
	public void deveValidarEmailValido() {
		assertTrue(new Email().valida("paulovitor@gmail.com"));
	}

	@Test
	public void deveValidarEmailInvalido() {
		assertFalse(new Email().valida("paulovitorgmailcom"));
		assertFalse(new Email().valida("paulovitorgmail.com"));
		assertFalse(new Email().valida("paulovitor@gmailcom"));
		assertFalse(new Email().valida("paulo#vitor@gmail.com"));
		assertFalse(new Email().valida("paulo vitor@gmail.com"));
	}

}
