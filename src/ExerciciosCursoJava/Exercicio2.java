package ExerciciosCursoJava;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		double area, pi, raio;
		pi = (double) 3.14159;
		area = raio = 0;
		System.out.println("Informe o raio: ");
		raio = valor.nextDouble();
		
		area = pi * (raio * raio);
		System.out.println("A = " + area);
	}

}
