package Exercicio207;

import java.util.Map;

public class program {

	public static void main(String[] args) {
		
		/*
		 * Este algoritmo faz a leitura de um arquivo que contém nome e voto de X número de pessoas, 
		 * remove os nomes repetidos e soma os votos.
		 * 
		 * 
		 */
	
		String path = "C:\\Users\\isaqu\\Desktop\\votos.txt";
		
		LerArquivo arquivo = new LerArquivo(path);
		Eleitores eleitores = new Eleitores(arquivo);
		
		
		arquivo.Ler();
		eleitores.removeDuplicates();
		
	
		System.out.println(eleitores.getEleitores());

		

	}

}
