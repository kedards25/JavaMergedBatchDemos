package com.learning.localisedate;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocaliseDate {

	public static void main(String[] args) {
		
		Locale ruLocale=new Locale("ru", "RU");
		Locale cnLocale=new Locale("zh", "CN");
		Locale deLocale=new Locale("de", "DE");
		Locale frLocale=new Locale("fr", "FR");
		DateFormat df=DateFormat.getDateInstance(DateFormat.SHORT,ruLocale);
		System.out.println("Date in default locale: "+new Date());
		System.out.println("Date in default locale: "+df.format(new Date()));

	}

}
