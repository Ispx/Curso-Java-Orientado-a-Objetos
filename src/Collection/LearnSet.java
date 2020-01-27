package Collection;

/*Caracteristicas do Set
 *Velocidade na pesquisa de dados, sendo mais rápida que um objeto do tipo List;
 *A inserção de dados é mais lenta;
 *Permite trabalhar com conjuntos e pode ser implementado como instâncias das classes HashSet ou TreeSet;
 *Não precisa especificar a posição para adicionar um elemento;
 *Não aceita valores duplicados. Se caso inserir um registro que já tenha no Set não será adicionado.
 *Podem ser implementados como instâncias das classes HashSet ou TreeSet;
 *Read more: http://www.linhadecodigo.com.br/artigo/3669/trabalhando-com-a-interface-set-no-java.aspx#ixzz6AIl9uQgw  
 */

import java.util.HashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<String> set1 = new HashSet<String>();
		Set<ClasseTeste> set2 = new HashSet<ClasseTeste>();
		
		set1.add("boa");
		set1.add("Dia");
		set1.add("Noite");
		
		//Add itens duplicados
		set1.add("boa");
		set1.add("Dia");
		set1.add("Noite");
		
		//----------------------------------------------------------
		
		set2.add(new ClasseTeste("Isaque",21));
		set2.add(new ClasseTeste("Maria", 21));
		set2.add(new ClasseTeste("João",31));
		set2.add(new ClasseTeste("Pedro", 11));
		set2.add(new ClasseTeste("Evelin",21));
		set2.add(new ClasseTeste("Evelin", 22));

		//Add valores duplicados
		set2.add(new ClasseTeste("Isaque",21));
		set2.add(new ClasseTeste("Maria", 21));
		set2.add(new ClasseTeste("João",31));
		set2.add(new ClasseTeste("Pedro", 11));
		set2.add(new ClasseTeste("Evelin",21));
		set2.add(new ClasseTeste("Evelin", 22));
		

		set2.forEach(e -> System.out.println(e.getNome()));
		
		
		
		
		
		

	}

}
