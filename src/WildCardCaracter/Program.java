package WildCardCaracter;

import java.util.ArrayList;
import java.util.List;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*O processo de WildCardCaracter se faz atrav�s de uma Lista,
		 * O tipo da lista tem que ser Coringa e extender uma Classe. 
		 * exemplo: List<? extends Classe> obj;
		 * 
		 * Uma vez extendido a classe dentro da lista, o objeto da lista herda todos os m�todos e objetos desta classe
		 * E de suas super ou sub classes.
		 * 
		 * Para evitar problemas com respeito ao acesso a objetos privados, a lista coringa deve ser criada dentro de uma Classe especifica,
		 * e a mesma deve ser instanciada em tempo de execu��o, s� assim se evitar� problemas com acesso a objetos privados da classe herdada.
		 * 
		 * Uma lista coringa n�o tem consigo o m�todo add() para adicionar valores dentro do seu vetor de lista,
		 * para que o mesmo receba valores o objeto da lista coringa deve ter seus valores instanciados atrav�s do "="
		 * 
		 * 
		 * A vantagem de trabalhar com lista coringa � que n�o se faz necess�rio criar objetos especificos para manipular objetos de classes especificas.
		 */

		List<? extends Animal> lista = new ArrayList<>(); // Pior m�todo, cria��o do objeto em tempo de execu��o, neste m�todo � poss�vel acessar os objetos privados da classe herdada.
		lista.get(0).especie(); // Acessando atributo privado  da classe herdada
		lista.get(0).som(); // Acessando atributo privado da classe herdada
		
		WildCard wild = new WildCard(); // Melhor m�todos, atrav�s desse m�todo n�o temos acesso aos objetos privados da classe herdada.
		
		
		List<Cachorro> cachorro = new ArrayList<>() {{add(new Cachorro("Aauau","Mamifero"));}};
		List<Ave> ave = new ArrayList<>() {{add(new Ave("piu piu","mamifero"));}};
		
		wild.setLista(cachorro);
		System.out.println(wild.getLista(0).getSom());
		System.out.println();
		
	
		wild.setLista(ave);
		System.out.println(lista.get(0).getEspecie());
		System.out.println(wild.getLista(0).getEspecie());
		
		
		
		
		
	}

}
