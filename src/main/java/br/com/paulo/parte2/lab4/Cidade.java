package br.com.paulo.parte2.lab4;

public class Cidade {

	private String nome;
	private Double valorKWh;

	public Cidade(String nome, Double valorKWPorHora) {
		this.setNome(nome);
		this.setValorKWh(valorKWPorHora);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorKWh() {
		return valorKWh;
	}

	public void setValorKWh(Double valorKWPorHora) {
		this.valorKWh = valorKWPorHora;
	}

}
