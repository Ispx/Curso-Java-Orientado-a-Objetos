package ExerciciosCursoJava;

import java.util.Scanner;

public class acessFuncionarios {

	public static void main(String[] args) {
		String str = "============================================";
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a n�mero de funcion�rios a serem cadastrados: ");
		int num = sc.nextInt();
		for(; num >= 0; num --) {
			System.out.println(str);
			System.out.println("Cadastre o Id: ");
			int id = sc.nextInt();
			funcionarios.setId(id);
			System.out.println("Nome: ");
			String nome = sc.next();
			funcionarios.setNome(nome);
			System.out.println("Sal�rio: ");
			double salario = sc.nextDouble();
			funcionarios.setSalario(salario);
		}
		System.out.println(str);
		System.out.println("Informe o id do funcion�rio que desej� aumentar o sal�rio: ");
		int id = sc.nextInt();
		System.out.println("Informe a taxa de aumento: ");
		double taxa = sc.nextDouble();
		funcionarios.reajusteSalario(id, taxa);
		System.out.println(str);		
		for(int i = 0; i < funcionarios.tamanho(); i ++) {
			System.out.println(str);
			System.out.println("Id: " + funcionarios.getNumId(i));
			System.out.println("Nome: " + funcionarios.getNumNome(i));
			System.out.printf("Sal�rio: %.2f", funcionarios.getNumSalario(i));
			System.out.println();
			System.out.println(str);
		}
	
		sc.close();
	}
	

}
