package br.com.paulo.lab2;

import java.util.LinkedHashSet;

public class Produto {
	
	private int id;
	private String titulo;
	private double peso;
	private Frete frete;

	public Produto(int id, String titulo, double peso) {
		this();
		this.setId(id);
		this.setTitulo(titulo);
		this.setPeso(peso);
	}

	public Produto() {
		frete = new Frete();
	}

	public String checkout(LinkedHashSet<Produto> cestaCurso, String origem,
			String destino) throws UFException {
		double pesoTotal = 0.00;
		for (Produto produto : cestaCurso) {
			pesoTotal = pesoTotal + produto.getPeso();
		}
		int valor = pesoTotal <= 1 ? 24 : pesoTotal == 3 ? 62 : 0;
		int dias = frete.prazoDestino(origem, destino);
		return (valor == 0 ? "" : valor) + " Entrega em " + dias + " dias";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
