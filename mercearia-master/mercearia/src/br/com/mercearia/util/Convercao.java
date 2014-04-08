package br.com.mercearia.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Convercao {
	static Calendar dataRetorno;

	public static Calendar textoEmData(String textoEmData)
			throws ParseException {
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(textoEmData);
		dataRetorno = Calendar.getInstance();
		dataRetorno.setTime(date);
		return dataRetorno;
	}
	public static Calendar getCurrentTime(){
		Calendar calendar;
		DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		try {
			date = (Date)formatter.parse(date.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}
}
