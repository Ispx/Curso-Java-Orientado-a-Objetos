package Set;

public @interface Diferencas {
	
	/*
	 * A interface Set não aceita valores repitidos, outra característica fundamental dele é o 
	 * fato de que a ordem em que os elementos são armazenados pode não ser a ordem na qual eles foram inseridos no conjunto.
	 *  A interface não define como deve ser este comportamento. Tal ordem varia de implementação para implementação.
	 * 
	 * 
	 * 
	 * A diferença entre HashSet, TreeSet e LinkedHashSet está relacionado a performance e a ordenação dos dados.
	 * 
	 * HashSet tem a melhor performance, porém os valores inseriodos são ordenados aleatóriamente.
	 * LinkedHashSet tem a segunda melhor perfomance, os valores são ordenados da maneira que são inseridos.
	 * TreeSet tem a pior performance, os valores são ordenados em classificação númerica ou A - Z.
	 * 
	 * Primeiro Lugar: HashSet (como esperado) com tempo de 2244768.
	 * Segundo Lugar: LinkedHashSe com tempo de 2263320 (muito próximo ao HashSet).
	 * Terceiro Lugar: TreeSet com tempo de 3549314 (bem mais lento que os outros por sua ordenação).
	 * É importante salientar uma questão muito importante, nenhuma das implementações da interface Set são  thread-safe, ou seja, 
	 * se você está usando múltiplas threads para acessar o mesmo Set você deve sincronizar esses acessos externamente, 
	 * pois como dissemos, o Set não o fará. Esse é um ponto fraco para aplicações que trabalham com frequência com múltiplas threads, pois você teria que ficar sincronizando os acessos ao seu Set para garantir a consistência dos dados, porém levando em consideração a rapidez do HashSet ou mesmo a 
	 * unicidade de elementos do Set como um todo, você deve ponderar se vale a pena deixar de usar o Set por falta de sincronismo nativo
	 * 
	 */
	
	/*
	 * 	set.add(e);
		set.addAll(c);
		set.contains(o);
		set.clear();
		set.contains(o);
		set.containsAll(c);
		set.equals(o);
		set.forEach(action);
		set.getClass();
		set.hashCode();
		set.isEmpty();
		set.iterator();
		set.notify();
		set.notifyAll();
		set.parallelStream();
		set.remove(o);
		set.removeAll(c);
		set.removeIf(filter);
		set.retainAll(c); // Informa quais são os valores contidos em a e b
		set.size();
		set.spliterator();
		set.stream();
		set.toArray();
		set.toArray(generator);
		set.toString();
		set.wait();
		set.wait(timeoutMillis);
	 */
}
