package com.learing.localisecurrency;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class LocaliseCurrency {

	public static void main(String[] args) {
		Locale ruLocale=new Locale("ru", "RU");
		Locale cnLocale=new Locale("zh", "CN");
		Locale deLocale=new Locale("de", "DE");
		Locale frLocale=new Locale("fr", "FR");
		NumberFormat nf=NumberFormat.getCurrencyInstance(cnLocale);
		//System.out.println("Date in default locale: "+new Date());
		System.out.println("Date in default locale: "+nf.format(100000));

	}

}
