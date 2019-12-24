package ExerciciosCursoJava;

import java.util.Scanner;

public class QuartoHotel {
	
	static Scanner sc = new Scanner(System.in);
	static int numQuarto;
	static String[] nome = new String[10];
	static String[] email = new String[10];
	
	public static void registros(int numEstudantes) {
		
		for(int i = (numEstudantes - 1); i >= 0; i--) {
			System.out.println();
			System.out.println("Informe o número do quarto: ");
			numQuarto = sc.nextInt();
			if(numQuarto > 9 || numQuarto < 0) {
				System.out.println("Número de quarto inválido.");
				System.out.println("Tente novamente!");
				
			}
			else {
				System.out.println("Informe seu nome: ");
				nome[numQuarto] = sc.next();
				System.out.println("Informe seu e-mail: ");
				email[numQuarto] = sc.next();
			}
		}
	
	for(int i = 0; i < email.length; i ++) {
		if(nome[i] != null) {
			System.out.println();
			System.out.println("Número do quarto: " + i);
			System.out.println("Nome: " + nome[i]);
			System.out.println("E-mail: " + email[i]);
			}
		}
	}
}