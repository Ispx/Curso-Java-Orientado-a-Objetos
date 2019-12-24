package ExerciciosCursoJava;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		
		int linha = 0;
		int coluna = 0;
		Scanner sc = new Scanner(System.in);
		int l = 0, c = 0;		
		System.out.println("Número de linhas: ");
		l = sc.nextInt();
		System.out.println("Número de colunas: ");
		c = sc.nextInt();
		
		int[][] matriz = new int[l][c];
		
		for(int i = 0; i < matriz.length; i ++) {
			for(int j = 0; j < matriz.length; j ++) {
				System.out.println("Informe um valor: ");
				int valor = sc.nextInt();
				matriz[i][j] = valor;
			}
		}
		
		for(int i = 0; i < matriz.length; i ++) {
			for(int j = 0; j < matriz.length; j ++) {
				System.out.print(matriz[i][j] + " ");
			}
				System.out.println();
		}
		
		System.out.println("Informe um valor a ser procurado: ");
		int valor = sc.nextInt();
		
		for(int i = 0; i < matriz.length; i ++) {
			for(int j = 0; j < matriz.length; j ++) {
				if(valor == matriz[i][j]) {
					linha = i;
					coluna = j;
					break;
				
				}
			}
		}
		

		if(coluna < c) {
			System.out.println("Esquerda: " + matriz[linha][coluna -1]); 
		}

		if(coluna > 0) {
			System.out.println("Direita: " + matriz[linha][coluna + 1]);
		}

		if(linha < l) {
			System.out.println("Abaixo: " + matriz[linha+1][coluna]);
		}

		if(linha > 0) {
			System.out.println("Acima: " + matriz[linha-1][coluna]);
		}


		
	}
}


