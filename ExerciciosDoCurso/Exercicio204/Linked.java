package Exercicio204;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linked{
	
	
	private Set<String> linked = new LinkedHashSet<>();
	
	public Linked(String linked) {
		
		this.linked.add(linked);
	}	
	

	public int size() {
		return linked.size();
	}
	
	
	public Set<String> getLinked() {
		return this.linked;
	}


	public void setLinked(String linked) {
		this.linked.add(linked);
	}


	
	
	

}
