package CursoJava;

import java.util.ArrayList;
import java.util.stream.Collectors;


public class Listas {

	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<>();
		
				
		// Fun��o add() para adicionar um elemento na lista
		list.add("Isaque");
		list.add("Samuel");
		list.add("Banana");
		list.add("Luana");
		
		// Fun��o add(int , obj) parametrizada para adicionar um elemento na lista
		list.add(5,"Elemento");
		list.add(6,"A�ucar");
		list.add(7,"Maria");
		
		//Fun��o remove() para remover um elemento da lista
		list.remove("Banana");
		list.remove("A�ucar");
		list.remove(3);
		list.remove(1);
		
		//Fun��o removeIf() para remo��o condicional
		list.removeIf( x -> x.charAt(0) == 'I');
		
		//Fun��o encontrar a posi��o de um elemento
		list.indexOf("Luana");
		
		//Fun��o filtrar elementos de uma lista
		ArrayList<String> filtrados = (ArrayList<String>) list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		//Fun��o primeiro elemento a partir de uma determinada condi��o
		String elemento = list.stream().filter(x -> x.charAt(0) == 'I').findFirst().orElse(null);
		
		// Fun��o pegar valor
		list.get(5);
		

	}

}
