package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class MetodosLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Set<Classe> lhs = new LinkedHashSet<>();
		Set<Classe> lhs2 = new LinkedHashSet<>();
		Set<Classe> clone = new LinkedHashSet<>();
		
		Classe c;

		c = new Classe("Maria",20);
		lhs.add(c);
		c = new Classe("João",18);
		lhs.add(c);
		c = new Classe("Joana",22);
		lhs.add(c);
		c = new Classe("Maria",20);
		lhs.add(c);
		c = new Classe("João",18);
		lhs.add(c);
		c = new Classe("Joana",22);
		lhs.add(c);
		c = new Classe("Isaque",20);
		lhs.add(c);
		clone.addAll(lhs);
		
		lhs2.add(c);
		c = new Classe("Ana",20);
		lhs2.add(c);
		c = new Classe("Karina",18);
		lhs2.add(c);
		c = new Classe("Luana",22);
		lhs2.add(c);
		c = new Classe("Joana",20);
		lhs2.add(c);
		c = new Classe("Silva",18);
		lhs2.add(c);
		c = new Classe("Joana",22);
		lhs2.add(c);
		c = new Classe("Julia",20);
		lhs2.add(c);
		
		
		System.out.println("Ordem dos valores de lhs");
		for(Classe e : lhs) {
			System.out.println(e.getName() + " - " + e.getIdade());
		}
		
		System.out.println("\n\nOrdem dos valores de lhs2");
		for(Classe e : lhs2) {
			System.out.println(e.getName() + " - " + e.getIdade());
		}
		
		System.out.println("\n\n-------------------------------------------------");
		
		
		System.out.println("\n\nConcatenado os valores de lhs com lhs2");
		clone.addAll(lhs2);

		
		for(Classe e: clone) {
			System.out.println(e.getName() + " - " + e.getIdade());
		}
		
		System.out.println("\n\n-------------------------------------------------");
		System.out.println("Valores de lhs2 que estão em lhs: ");
		lhs.retainAll(lhs2);
		for(Classe e : lhs) {
			System.out.println(e.getName() + " - " + e.getIdade());
		}
		System.out.println("\n\nTodos os valores de lhs2 estão presentes no objeto clone? " + clone.containsAll(lhs2) );

		
		System.out.println("\n\nRemovendo quem tem 18 anos\n");
		clone.removeIf(x -> x.getIdade() == 18);
		for(Classe e : clone) {
			System.out.println(e.getName() + " - " + e.getIdade());
		}
		
		
	}

}
