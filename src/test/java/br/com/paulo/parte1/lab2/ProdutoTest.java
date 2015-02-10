package br.com.paulo.parte1.lab2;

import static org.junit.Assert.assertEquals;

import java.util.LinkedHashSet;

import org.junit.Test;

import br.com.paulo.parte1.lab2.Produto;
import br.com.paulo.parte1.lab2.UFException;

public class ProdutoTest {

	@Test
	public void testCalculaFreteCursoLocalmente() throws UFException {
		LinkedHashSet<Produto> cestaCurso = new LinkedHashSet<Produto>();
		cestaCurso.add(new Produto(0, "Guia do exame SCJP", 1));

		assertEquals("24 Entrega em 5 dias",
				new Produto().checkout(cestaCurso, "SP", "SP"));
	}

	@Test
	public void testCalculaFreteLocalDiferente() throws UFException {
		LinkedHashSet<Produto> cestaCurso = new LinkedHashSet<Produto>();
		cestaCurso.add(new Produto(0, "Guia do exame SCJP", 1));
		cestaCurso.add(new Produto(1, "Dominando Hibernate", 2));

		assertEquals("62 Entrega em 15 dias",
				new Produto().checkout(cestaCurso, "BA", "SP"));
	}

	@Test
	public void testCaculaFreteMenosUmKg() throws UFException {
		LinkedHashSet<Produto> cestaCurso = new LinkedHashSet<Produto>();
		cestaCurso.add(new Produto(0, "Guia do exame SCJP", 0.500));

		assertEquals("24 Entrega em 5 dias",
				new Produto().checkout(cestaCurso, "SP", "SP"));
	}

	@Test
	public void testCalculaMaisUmKg() throws UFException {
		LinkedHashSet<Produto> cestaCurso = new LinkedHashSet<Produto>();
		cestaCurso.add(new Produto(0, "Guia do exame SCJP", 1));
		cestaCurso.add(new Produto(1, "Dominando Hibernate", 2));
		cestaCurso.add(new Produto(3, "TomCat Administrador", 1));
		cestaCurso.add(new Produto(4, "Core JSF 2.0", 1));
		cestaCurso.add(new Produto(5, "Certificação LPI", 1));

		assertEquals(" Entrega em 5 dias",
				new Produto().checkout(cestaCurso, "RJ", "rj"));
	}

}
