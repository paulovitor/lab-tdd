package br.com.paulo.parte1.lab2;

import java.util.Arrays;

/**
 * Classe do lab-2-prazo-de-entrega
 * 
 * @author paulo
 */
public class Frete {

	private String[] ufs = { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES",
			"GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ",
			"RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" };

	public int prazoDestino(String origem, String destino) throws UFException {
		validaUF(origem);
		validaUF(destino);
		if (origem.toLowerCase().equals(destino.toLowerCase()))
			return 5;
		return 15;
	}

	private void validaUF(String uf) throws UFException {
		if (uf == null || !Arrays.asList(ufs).contains(uf.toUpperCase()))
			throw new UFException("UF (" + uf + ") inválida!");
	}

}
