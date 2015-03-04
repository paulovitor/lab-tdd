package br.com.paulo.parte2.lab3;

import org.joda.time.DateTime;
import org.joda.time.Years;

public class Idade {

	public int calcula(DateTime aniversario) {
		DateTime hoje = DateTime.now();
		return Years.yearsBetween(aniversario, hoje).getYears();
	}

}
