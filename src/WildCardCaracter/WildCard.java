package WildCardCaracter;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
	
	private List<? extends Animal> Lista = new ArrayList<>();
	

	public Animal getLista(int i) {
		return  this.Lista.get(i);
	}

	public void setLista(List<? extends Animal> lista) {
		this.Lista = lista;
	}
	
	
	

}
