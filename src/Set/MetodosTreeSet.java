package Set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MetodosTreeSet {
	
	/*
	 * O método TreeSet deleta itens duplicados
	 * Classifica os valores por ordem segundo o seu tipo
	 * Não permite a inserção de valores através de objeto de classe se a mesma não implementar a interface Comparable<>
	 * Para inserir os muitos valores se utiliza objeto do tipo List
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
	Set<String> ts = new TreeSet<>();
	Set<String> ts2 = new TreeSet<>();
	Set<String> clone = new TreeSet<>();
	Set<ParaTreeSet> tree = new TreeSet<>();
	

	
	
		List<String> l = new ArrayList<>();
		l.add("Isaque");
		l.add("Ana");
		l.add("Joana");
		l.add("Pedro");
		l.add("Isaque");
		l.add("Ana");
		l.add("joana");

		
		ts.addAll(l);
		clone.addAll(ts);
		
		l = new ArrayList<>();
		l.add("Isaque");
		l.add("Ana");
		l.add("Joana");
		l.add("Pedro");
		l.add("Isaque");
		l.add("Ana");
		l.add("joana");
		l.add("Joaquim");
		l.add("Maria");
		l.add("Paula");
		l.add("Paloma");
		l.add("Ciro");
		l.add("Ana");
		l.add("joana");

		
		ts2.addAll(l);
		
		
		System.out.println("Valores de ts: ");
		for(String e : ts) {
			System.out.println(e);
		}
		System.out.println("\nValores de ts2");
		for(String e : ts2) {
			System.out.println(e);
		}
		
		System.out.println("------------------------------------------------");
		
		System.out.println("Todos os valores de ts2 estão em ts? " + ts.containsAll(ts2));
		System.out.println("Valores contidos em ts2 que contém em ts:\n");
		ts.retainAll(ts2);
		for(String e : ts) {
			System.out.println(e);
		}
		
		
		clone.addAll(ts2);
		
		System.out.println("\n--------------------------------------------------");
		ts.addAll(ts2);
		System.out.println("valores de ts é substituido pelos valores de ts2");
		for(String e : ts) {
			System.out.println(e);
		}
		
		System.out.println("\n---------------------------------------------------");
		System.out.println("Valores de ts concatenados com ts2:");
		for(String e :clone) {
			System.out.println(e);
		}
		
		
		clone.removeIf(x -> x.charAt(0) == 'J' || x.charAt(0) == 'j');
		
		System.out.println("\n\nNomes com inicial J removidos: ");
		for(String e : clone) {
			System.out.println(e);
		}
		
		
		/*
		 * Através do método CompareTo conseguimos personalizar a ordenação dos valores
		 * Neste caso foi criado um algoritmo para ordenar por idade
		 * 
		 */
		ParaTreeSet c = new ParaTreeSet("Isaque",21);
		tree.add(c);
		c = new ParaTreeSet("Karla",19);
		tree.add(c);
		
		System.out.println("\n\nElemento da Classe 'paraTreeSet'");
		for(ParaTreeSet e : tree) {
			System.out.println(e.getName() + " - " + e.getIdade());
		}
		
	}
}