package Collection;

/*Caracteristicas do Set
 *Velocidade na pesquisa de dados, sendo mais r�pida que um objeto do tipo List;
 *A inser��o de dados � mais lenta;
 *Permite trabalhar com conjuntos e pode ser implementado como inst�ncias das classes HashSet ou TreeSet;
 *N�o precisa especificar a posi��o para adicionar um elemento;
 *N�o aceita valores duplicados. Se caso inserir um registro que j� tenha no Set n�o ser� adicionado.
 *Podem ser implementados como inst�ncias das classes HashSet ou TreeSet;
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
		set2.add(new ClasseTeste("Jo�o",31));
		set2.add(new ClasseTeste("Pedro", 11));
		set2.add(new ClasseTeste("Evelin",21));
		set2.add(new ClasseTeste("Evelin", 22));

		//Add valores duplicados
		set2.add(new ClasseTeste("Isaque",21));
		set2.add(new ClasseTeste("Maria", 21));
		set2.add(new ClasseTeste("Jo�o",31));
		set2.add(new ClasseTeste("Pedro", 11));
		set2.add(new ClasseTeste("Evelin",21));
		set2.add(new ClasseTeste("Evelin", 22));
		

		set2.forEach(e -> System.out.println(e.getNome()));
		
		
		
		
		
		

	}

}
