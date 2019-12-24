package CursoJava;

import java.util.ArrayList;
import java.util.stream.Collectors;


public class Listas {

	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<>();
		
				
		// Função add() para adicionar um elemento na lista
		list.add("Isaque");
		list.add("Samuel");
		list.add("Banana");
		list.add("Luana");
		
		// Função add(int , obj) parametrizada para adicionar um elemento na lista
		list.add(5,"Elemento");
		list.add(6,"Açucar");
		list.add(7,"Maria");
		
		//Função remove() para remover um elemento da lista
		list.remove("Banana");
		list.remove("Açucar");
		list.remove(3);
		list.remove(1);
		
		//Função removeIf() para remoção condicional
		list.removeIf( x -> x.charAt(0) == 'I');
		
		//Função encontrar a posição de um elemento
		list.indexOf("Luana");
		
		//Função filtrar elementos de uma lista
		ArrayList<String> filtrados = (ArrayList<String>) list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		//Função primeiro elemento a partir de uma determinada condição
		String elemento = list.stream().filter(x -> x.charAt(0) == 'I').findFirst().orElse(null);
		
		// Função pegar valor
		list.get(5);
		

	}

}
