package br.com.paulo.pate2.lab1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private Pattern pattern;

	public Email() {
		pattern = Pattern.compile(EMAIL_PATTERN);
	}

	public boolean valida(String email) {
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

}
