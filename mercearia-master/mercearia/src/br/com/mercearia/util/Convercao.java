package br.com.mercearia.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Convercao {
	static Calendar dataRetorno;

	public static Calendar dataEmTexto(String dataEmTexto) throws ParseException {
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
		dataRetorno = Calendar.getInstance();
		dataRetorno.setTime(date);
		return dataRetorno;
	}
}
