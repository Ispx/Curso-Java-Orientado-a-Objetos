package OperadoresBasicos;

import java.util.Locale;

public class printFormatado {

	public static void main(String[] args) {
		
		/* 
		 * %f "Para números flutuantes"
		 * %s "Para strings"
		 * %d "Para números inteiros"
		 * %n "Para quebra de linha"
		 */
		Locale.setDefault(Locale.US);
		double num = 12.53755;
		
		System.out.printf("%.2f ", num);
	}

}
