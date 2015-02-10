package br.com.paulo.pate2.lab2;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class EmprestimoTest {

	@Test
	public void deveValidarLimiteParaClienteComMenosDeUmSalarioMinimo()
			throws EmprestimoException {
		BigDecimal salario = new BigDecimal(200);

		assertEquals(
				"Caso o salário seja menor que um salário minimo o limite é o salário",
				salario, new Emprestimo(salario).getLimite());
	}

	@Test
	public void deveValidarLimiteParaClienteComSalarioEntreUmEDoisSalariosMinimo()
			throws EmprestimoException {
		BigDecimal salario = new BigDecimal(800);

		assertEquals(
				"Caso o salário seja de R$ 800,00 o limite é o dobro do salário",
				salario.multiply(new BigDecimal(2)),
				new Emprestimo(salario).getLimite());
	}

	@Test
	public void deveValidarLimiteParaClienteComMaisDeDoisSalariosMinimo()
			throws EmprestimoException {
		BigDecimal salario = Emprestimo.SALARIO_MINIMO.multiply(new BigDecimal(
				3));

		assertEquals(
				"Caso o salário seja maior que dois salários minimo o limite é o salário",
				salario, new Emprestimo(salario).getLimite());
	}

	@Test(expected = EmprestimoException.class)
	public void naoDeveFazerEmprestimoParaValorMaiorQueLimiteDisponivel()
			throws EmprestimoException {
		BigDecimal salario = Emprestimo.SALARIO_MINIMO;
		BigDecimal valor = Emprestimo.SALARIO_MINIMO
				.multiply(new BigDecimal(3));

		assertEquals(
				"Caso o salário seja maior que o limite disponível o emprestimo é negado",
				valor, new Emprestimo(salario).fazEmprestimo(valor));
	}

}
