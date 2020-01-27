package TiposCoringas;

import java.util.ArrayList;
import java.util.List;

/*
 * Tipos coringa, s�o vari�veis gen�ricas mais trabalhadas em Listas
 * Sua finalidade � fazer de uma lista um tipo gen�rico para que ela receba 
 * valores n�o previsiveis mais que s�o do mesmo tipo.
 */
public class Coringa {
	public static void main(String[] args) {
		
		List<?> coringa; // Lista tipo coringa
		List<Integer> numeros = new ArrayList<>(); //Lista tipo Integer
		List<String> palavras = new ArrayList<>(); //Lista tipo String
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		
		palavras.add("Ola");
		palavras.add("Noite");
		palavras.add("Dia");
		
		coringa = palavras;
		System.out.println(coringa.get(0));
		
		coringa  = numeros;
		System.out.println(coringa.get(0));
		
	}
	
	
	
	
}
