package ExerciciosCursoJava;

import java.util.Locale;
import java.util.Scanner;

public class AcessDolar {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informo quantos o valor cambial do dolár: ");
		double vdolar = sc.nextDouble();
		System.out.println("Informo quantos doláres pretende comprar: ");
		double dolar = sc.nextDouble();
		
		System.out.printf("Valor em reais a ser pago: %.2f", Dolar.CurrencyConverter(vdolar,dolar));
		
		
		
	}

}
