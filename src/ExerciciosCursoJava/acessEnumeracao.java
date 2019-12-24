package ExerciciosCursoJava;

import java.util.Scanner;

public class acessEnumeracao {

	public static void main(String[] args) {
		Situacao obj = new Situacao();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Id:"  );
		int id = sc.nextInt();
		
		obj.dados(id);
		System.out.println(obj.print());
		
		}

		
	
	
	
	}

