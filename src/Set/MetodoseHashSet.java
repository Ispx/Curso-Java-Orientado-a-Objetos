package Set;

import java.util.HashSet;
import java.util.Set;

public class MetodoseHashSet {
	/*  Lista de todos os m�todos HashSet
	 * 
	 * N�o tem ordena��o na varredura ou impress�o. A ordem de sa�da n�o � a mesma de entrada;
	 * Aceitam valores do tipo null;
	 * N�o � sincronizada (thread-safe);
	 * Velocidade no acesso, leitura e modifica��o de dados;
	 * Read more: http://www.linhadecodigo.com.br/artigo/3669/trabalhando-com-a-interface-set-no-java.aspx#ixzz6C3HAIWUu
	 
	 *		HashSet<String> hash;
		hash.add(e);
		hash.addAll(c);
		hash.clear();
		hash.clone();
		hash.contains(o);
		hash.containsAll(c);
		hash.equals(o);
		hash.forEach(action);
		hash.getClass();
		hash.hashCode();
		hash.isEmpty();
		hash.iterator()
		hash.notify();
		hash.notifyAll();
		hash.parallelStream()
		hash.remove(o);
		hash.removeAll(c);
		hash.removeIf(filter);
		hash.retainAll(c);
		hash.size();
		hash.spliterator();
		hash.stream();
		hash.toArray();
		hash.toString();
		hash.wait();
	 */

	public static void main(String[] args) {

		Set<Classe> hs = new HashSet<>();
		Set<Classe> hs2 = new HashSet<>();
		Set<Classe> clone = new HashSet<>();
 		Classe c = new Classe("Isaque",21);
		
	
		hs.add(c);
		c = new Classe("Maria",20);
		hs.add(c);
		c = new Classe("Jo�o",18);
		hs.add(c);
		c = new Classe("Joana",22);
		hs.add(c);
		c = new Classe("Maria",20);
		hs.add(c);
		c = new Classe("Jo�o",18);
		hs.add(c);
		c = new Classe("Joana",22);
		hs.add(c);
		c = new Classe("Isaque",20);
		hs.add(c);
		clone.addAll(hs);
		
		hs2.add(c);
		c = new Classe("Ana",20);
		hs2.add(c);
		c = new Classe("Karina",18);
		hs2.add(c);
		c = new Classe("Luana",22);
		hs2.add(c);
		c = new Classe("Joana",20);
		hs2.add(c);
		c = new Classe("Silva",18);
		hs2.add(c);
		c = new Classe("Joana",22);
		hs2.add(c);
		c = new Classe("Julia",20);
		hs2.add(c);
		
		//"-------------------------------------------------------------------------------"
		System.out.println("Valores de hs:");
		for(Classe e : hs) {
			System.out.println(e.getName() + " - " + e.getIdade());
		}
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Vaores de hs2: ");
		for(Classe e : hs2) {
			System.out.println(e.getName() + " - " + e.getIdade());
		}
		
		System.out.println("\nTodos os valores de hs2 est�o em hs? " + hs.containsAll(hs2));
		
		hs.retainAll(hs2); //Informa quais s�o os valores contidos em b e a
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("Quais s�o os valores contidos em hs2 que cont�m em hs? ");
		for(Classe e : hs) {
			System.out.println(e.getName() + " - " + e.getIdade());
		}
		
		hs.addAll(hs2); // Substituiu os valores de hs por hs2
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("Agora os valores de hs s�o os valores presente em hs2:");
		for(Classe e : hs) {
			System.out.println(e.getName() + " - " + e.getIdade());
		}
		
		System.out.println("\n---------------------------------------------------------------");
		clone.addAll(hs2);
		System.out.println("Valores de hs concatenados com hs2:");
		for(Classe e : clone) {
			System.out.println(e.getName() + " - " + e.getIdade());
		}
		
		
		System.out.println("\n\nRemove pessoas com idade >= 20 ou com a inicial igual a 'A' ");
		clone.removeIf(x -> x.getIdade() >= 20 || x.getName().charAt(0) == 'A' || x.getName().charAt(0) == 'a');
		
		for(Classe e : clone) {
			System.out.println(e.getName() + " - " + e.getIdade());
		}
		System.out.println("\n\nTamanho:  " + clone.size());
		

	}

}
