package br.com.paulo.parte2.lab2;

import java.math.BigDecimal;

public class Emprestimo {

	public final static BigDecimal SALARIO_MINIMO = new BigDecimal(788);
	private BigDecimal limite = BigDecimal.ZERO;
	private BigDecimal valorDisponivel = BigDecimal.ZERO;

	public Emprestimo(BigDecimal salario) {
		this.setLimite(defineLimite(salario));
		this.valorDisponivel = getLimite();
	}

	private BigDecimal defineLimite(BigDecimal salario) {
		return salarioEntreUmEDoisSalariosMinimo(salario) ? salario
				.multiply(new BigDecimal(2)) : salario;
	}

	private boolean salarioEntreUmEDoisSalariosMinimo(BigDecimal salario) {
		return salario.compareTo(SALARIO_MINIMO) >= 0
				&& salario
						.compareTo(SALARIO_MINIMO.multiply(new BigDecimal(2))) <= 0;
	}

	public BigDecimal fazEmprestimo(BigDecimal valor)
			throws EmprestimoException {
		temValorDisponivelParaEmprestimo(valor);
		retiraValor(valor);
		return valor;
	}

	private void temValorDisponivelParaEmprestimo(BigDecimal valor)
			throws EmprestimoException {
		if (valor.compareTo(valorDisponivel) > 0)
			throw new EmprestimoException(
					"Valor solicitado maior que o limite disponível");
	}

	private void retiraValor(BigDecimal valor) {
		valorDisponivel = valorDisponivel.min(valor);
	}

	public BigDecimal getLimite() {
		return limite;
	}

	public void setLimite(BigDecimal limite) {
		this.limite = limite;
	}

}
