package br.com.paulo.parte2.lab4;

public class Chuveiro implements AparelhoEletrico {

	private Integer wattsDePotencia;

	public Chuveiro() {
		wattsDePotencia = new Integer(2400);
	}

	public Double calculaConsumoEmKWh(Integer horas) {
		return getKiloWatts() * horas;
	}

	private Double getKiloWatts() {
		return new Double(wattsDePotencia) / 1000;
	}

}
