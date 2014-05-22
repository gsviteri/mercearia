package br.com.mercearia.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Conversao {
	static Calendar dataRetorno;

	public static String calendarEmTexto(Calendar calendar) {
		Date date = calendar.getTime();
		String resposta = new SimpleDateFormat("dd/MM/yyyy").format(date);
		return resposta;
	}

	public static Calendar textoEmData(String textoEmData)
			throws ParseException {
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(textoEmData);
		dataRetorno = Calendar.getInstance();
		dataRetorno.setTime(date);
		return dataRetorno;
	}

	public static Calendar textoEmDataHora(String textoEmData)
			throws ParseException {
		Date date = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss")
				.parse(textoEmData);
		dataRetorno = Calendar.getInstance();
		dataRetorno.setTime(date);
		return dataRetorno;
	}

	public static Calendar getCurrentTime() {
		Calendar calendar;
		DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		try {
			date = (Date) formatter.parse(date.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}

	public static Timestamp timeStamp(Date dataUtil) {
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		System.out.println("Data util " + df.format(dataUtil));
		Timestamp timeStamp = new Timestamp(dataUtil.getTime());
		System.out.println("Data sql " + df.format(timeStamp));
		return timeStamp;
	}
}
