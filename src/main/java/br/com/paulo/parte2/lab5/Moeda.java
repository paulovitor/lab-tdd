package br.com.paulo.parte2.lab5;

import java.util.HashMap;
import java.util.Map;

public class Moeda {

	public static final String DOLAR = "Dolar";
	public static final String EURO = "Euro";
	public static final String REAL = "Real";

	private static final String MOEDA_SINGULAR = "real";
	private static final String MOEDA_PLURAL = "reais";

	private static final String FRACAO_SINGULAR = "centavo";
	private static final String FRACAO_PLURAL = "centavos";

	private final Map<Integer, String> nomes = new HashMap<Integer, String>();

	private String tipo;

	public Moeda(String tipo) {
		this.tipo = tipo;
		preencherNomes();
	}

	public String converteParaValorPorExtenso(Double valor) {
		String extenso;
		int inteiro = (int) Math.abs(valor);
		Double fracao = valor - inteiro;
		String centavos = String.valueOf((int) Math.round(fracao * 100));
		extenso = getNome(inteiro) + " " + getNomeMoeda(inteiro);
		if (fracao > 0.0) {
			int valorEmInteiro = new Integer(centavos);
			extenso += " e " + getNome(valorEmInteiro) + " "
					+ getNomeFracao(valorEmInteiro);
		}
		return extenso;
	}

	private String getNomeFracao(int fracao) {
		return fracao == 1 ? FRACAO_SINGULAR : FRACAO_PLURAL;
	}

	private String getNomeMoeda(int inteiro) {
		return inteiro == 1 ? MOEDA_SINGULAR : MOEDA_PLURAL;
	}

	private String getNome(int valor) {
		return nomes.get(valor);
	}

	private void preencherNomes() {
		nomes.put(1, "um");
		nomes.put(2, "dois");
		nomes.put(3, "três");
		nomes.put(4, "quatro");
		nomes.put(5, "cinco");
		nomes.put(6, "seis");
		nomes.put(7, "sete");
		nomes.put(8, "oito");
		nomes.put(9, "nove");
		nomes.put(10, "dez");
		nomes.put(11, "onze");
		nomes.put(12, "doze");
		nomes.put(13, "treze");
		nomes.put(14, "quatorze");
		nomes.put(15, "quinze");
		nomes.put(16, "dezesseis");
		nomes.put(17, "dezessete");
		nomes.put(18, "dezoito");
		nomes.put(19, "dezenove");
		nomes.put(20, "vinte");
		nomes.put(30, "trinta");
		nomes.put(40, "quarenta");
		nomes.put(50, "cinquenta");
		nomes.put(60, "sessenta");
		nomes.put(70, "setenta");
		nomes.put(80, "oitenta");
		nomes.put(90, "noventa");
		nomes.put(200, "duzentos");
		nomes.put(300, "trezentos");
		nomes.put(400, "quatrocentos");
		nomes.put(500, "quinhentos");
		nomes.put(600, "seiscentos");
		nomes.put(700, "setecentos");
		nomes.put(800, "oitocentos");
		nomes.put(900, "novecentos");
	}

}
