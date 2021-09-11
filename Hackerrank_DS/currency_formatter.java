package Hackerrank_DS;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

class currency_formatter {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		double in = ob.nextDouble();
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("US: "+ nf.format(in));
		
		Locale INLocale = new Locale.Builder().setLanguage("en").setRegion("IN").build();
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(INLocale);
		System.out.println("INDIA: "+ nf1.format(in));
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println("CHINA: "+ nf2.format(in));
		
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println("FRANCE: "+ nf3.format(in));

	}

}
