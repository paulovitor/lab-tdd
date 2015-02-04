package br.com.paulo.lab1;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Classe do lab-1-pagamentos-de-faturas
 *  
 * @author paulo
 */
public class Fatura {

	public int verificaPgto(String dataDeVencimento, String dataDePagamento) {
		DateTimeFormatter pattern = DateTimeFormat.forPattern("dd/MM/yyyy");

		DateTime dataInicial = pattern.parseDateTime(dataDeVencimento);
		DateTime dataFinal = pattern.parseDateTime(dataDePagamento);
		return Days.daysBetween(dataInicial, dataFinal).getDays();
	}

}
