package br.com.paulo.lab3;

import java.math.BigDecimal;

import br.com.paulo.lab2.Frete;
import br.com.paulo.lab2.UFException;

public class Embalagem {

	private Frete frete;

	public Embalagem() {
		frete = new Frete();
	}

	public BigDecimal calculoPreco(int peso) {
		return peso == 3 ? new BigDecimal(62) : new BigDecimal(24);
	}

	public int prazoDestino(String origem, String destino) throws UFException {
		return frete.prazoDestino(origem, destino);
	}

}
