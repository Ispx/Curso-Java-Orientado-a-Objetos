package ExerciciosCursoJava;

import java.util.Scanner;

import OperadoresBasicos.Encapsulamento;

public class AcessEncapsulamento {

	public static void main(String[] args) {
		
		
		// Printando acesso
		System.out.println("Printando acesso: " + Encapsulamento.getProduct());
		System.out.println("Printando acesso: "  + Encapsulamento.getPrice());
		System.out.println("Printando acesso: " + Encapsulamento.getQuantity());
		
		// Alterando valores dos atributos private pelos métodos set
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um novo valor para o produto: ");
		double valor = sc.nextDouble();
		Encapsulamento.setPrice(valor);
		System.out.println("Valor alterado: " + Encapsulamento.getPrice());
		Encapsulamento.setProduct("Sabão");
		System.out.println("Nome alterado: " + Encapsulamento.getProduct());
		Encapsulamento.setQuantity(9);
		System.out.println("Quantidade alterada: " + Encapsulamento.getQuantity());
	}

}
