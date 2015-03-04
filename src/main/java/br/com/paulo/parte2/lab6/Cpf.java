package br.com.paulo.parte2.lab6;

public class Cpf {

	public boolean validar(String cpf) {
		String cpfSemCaracteres = cpf.replace(".", "").replace("-", "");

		if (cpfSemCaracteres.length() != 11)
			return false;

		String digitoVerificador = cpfSemCaracteres.substring(
				cpfSemCaracteres.length() - 2, cpfSemCaracteres.length());

		return digitoVerificador.equals(getDigitoVerificador(cpfSemCaracteres));
	}

	private String getDigitoVerificador(String cpfSemCaracteres) {
		String novePrimeirosDigitos = cpfSemCaracteres.substring(0, 9);

		Integer primeiroDigitoVerificador = calculaDigitoVerificador(
				novePrimeirosDigitos, 10);
		Integer segundoDigitoVerificador = calculaDigitoVerificador(
				novePrimeirosDigitos
						+ String.valueOf(primeiroDigitoVerificador), 11);

		return String.valueOf(primeiroDigitoVerificador)
				+ String.valueOf(segundoDigitoVerificador);
	}

	private Integer calculaDigitoVerificador(String caracteres, int peso) {
		Integer somatorio = calculaSomatorioComPeso(caracteres, peso);
		Integer resto = somatorio % 11;
		return resto < 2 ? new Integer(0) : new Integer(11 - resto);
	}

	private Integer calculaSomatorioComPeso(String novePrimeirosDigitos,
			int peso) {
		int somatorio = 0;
		for (int contador = 0; contador < novePrimeirosDigitos.length(); contador++) {
			somatorio += Integer.parseInt(novePrimeirosDigitos.substring(
					contador, contador + 1)) * peso--;
		}
		return somatorio;
	}

}
