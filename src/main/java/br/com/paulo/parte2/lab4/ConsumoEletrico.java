package br.com.paulo.parte2.lab4;

import java.util.ArrayList;

public class ConsumoEletrico {

	private Cidade cidade;

	public ConsumoEletrico(Cidade cidade) {
		this.setCidade(cidade);
	}

	public Double calculaCustoDeConsumoEletrico(
			ArrayList<AparelhoEletrico> aparelhos, Integer horas) {
		Double valor = 0.00;
		for (AparelhoEletrico aparelhoEletrico : aparelhos) {
			valor += aparelhoEletrico.calculaConsumoEmKWh(horas)
					* cidade.getValorKWh();
		}
		return valor;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

}
