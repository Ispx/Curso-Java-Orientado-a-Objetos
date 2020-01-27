package Exercicio204;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		LerArquivo ler;

		
		System.out.println("Entre com o caminho do arquivo: = 'C:\\\\Users\\\\isaqu\\\\OneDrive\\\\Área de Trabalho\\\\file.txt' ");
		String caminho = "C:\\Users\\isaqu\\OneDrive\\Área de Trabalho\\file.txt";
		
		ler = new LerArquivo(caminho);
		ler.lendoArquivo();
		
		
		System.out.println("Total de users: " + ler.getLinked().size());
		
		System.out.println("\nUsers: \n");
		
		for(String e : ler.getLinked().getLinked()) {
			System.out.println(e);
		}
		
		
		

	}

}
