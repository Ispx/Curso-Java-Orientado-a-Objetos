package Set;

public @interface Diferencas {
	
	/*
	 * A interface Set n�o aceita valores repitidos, outra caracter�stica fundamental dele � o 
	 * fato de que a ordem em que os elementos s�o armazenados pode n�o ser a ordem na qual eles foram inseridos no conjunto.
	 *  A interface n�o define como deve ser este comportamento. Tal ordem varia de implementa��o para implementa��o.
	 * 
	 * 
	 * 
	 * A diferen�a entre HashSet, TreeSet e LinkedHashSet est� relacionado a performance e a ordena��o dos dados.
	 * 
	 * HashSet tem a melhor performance, por�m os valores inseriodos s�o ordenados aleat�riamente.
	 * LinkedHashSet tem a segunda melhor perfomance, os valores s�o ordenados da maneira que s�o inseridos.
	 * TreeSet tem a pior performance, os valores s�o ordenados em classifica��o n�merica ou A - Z.
	 * 
	 * Primeiro Lugar: HashSet (como esperado) com tempo de 2244768.
	 * Segundo Lugar: LinkedHashSe com tempo de 2263320 (muito pr�ximo ao HashSet).
	 * Terceiro Lugar: TreeSet com tempo de 3549314 (bem mais lento que os outros por sua ordena��o).
	 * � importante salientar uma quest�o muito importante, nenhuma das implementa��es da interface Set s�o  thread-safe, ou seja, 
	 * se voc� est� usando m�ltiplas threads para acessar o mesmo Set voc� deve sincronizar esses acessos externamente, 
	 * pois como dissemos, o Set n�o o far�. Esse � um ponto fraco para aplica��es que trabalham com frequ�ncia com m�ltiplas threads, pois voc� teria que ficar sincronizando os acessos ao seu Set para garantir a consist�ncia dos dados, por�m levando em considera��o a rapidez do HashSet ou mesmo a 
	 * unicidade de elementos do Set como um todo, voc� deve ponderar se vale a pena deixar de usar o Set por falta de sincronismo nativo
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
		set.retainAll(c); // Informa quais s�o os valores contidos em a e b
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
