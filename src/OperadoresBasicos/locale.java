
package OperadoresBasicos;

import java.util.Locale;
import java.util.Scanner;
public class locale {

	public static final String US = null;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // valores flutuantes com pontuação
		Locale.getDefault();
		double num;
		Scanner sn = new Scanner(System.in);
		System.out.println("Num: ");
		num = sn.nextDouble();
		System.out.println(num);
	}

}
