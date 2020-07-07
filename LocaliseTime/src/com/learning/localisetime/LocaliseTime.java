package com.learning.localisetime;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocaliseTime {

	public static void main(String[] args) {
		Locale ruLocale=new Locale("ru", "RU");
		Locale cnLocale=new Locale("zh", "CN");
		Locale deLocale=new Locale("de", "DE");
		Locale frLocale=new Locale("fr", "FR");
		//instead of getDateInstance we have getTimeInstance in this
		DateFormat df=DateFormat.getTimeInstance(DateFormat.SHORT,frLocale);
		System.out.println("Date in default locale: "+new Date());
		System.out.println("Date in default locale: "+df.format(new Date()));

	}

}
