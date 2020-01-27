package ExerciciosCursoJava;

import java.util.Scanner;

public class acessQuartoHotel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Informe o número de estudantes: ");
		QuartoHotel.registros(sc.nextInt());
		
	}
}