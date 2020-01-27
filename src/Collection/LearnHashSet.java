package Collection;

/*Caracteristicas do HashSet
 * 
 * Não tem ordenação na varredura ou impressão. A ordem de saída não é a mesma de entrada;
 * Aceitam valores do tipo null;
 * Não é sincronizada (thread-safe);
 * Velocidade no acesso, leitura e modificação de dados;
 * Read more: http://www.linhadecodigo.com.br/artigo/3669/trabalhando-com-a-interface-set-no-java.aspx#ixzz6AIe0n49h

 */

import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class LearnHashSet {

	public static void main(String[] args) {
		

		HashSet<ClasseTeste> hashSet2 = new HashSet<ClasseTeste>();
		
		//Adicionados itens 
		hashSet2.add(new ClasseTeste("Isaque",21));
		hashSet2.add(new ClasseTeste("Maria",12));
		hashSet2.add(new ClasseTeste("Joao",35));
		hashSet2.add(new ClasseTeste("Maria",21));
		hashSet2.add(new ClasseTeste("Luana",15));
		hashSet2.add(new ClasseTeste("Luana",15));
		
		hashSet2.forEach(e -> System.out.println(e.getNome()));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
