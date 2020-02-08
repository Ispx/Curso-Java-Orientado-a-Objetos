package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * The interface Map dont accept keys with values duplicates indepentent of implementation of equals() in the classe of object
		 * Ordened by ordem of insert
		 */
		
		Classe e;
		Map map = new LinkedHashMap<>();
		e = new Classe("Maria","Bahia");
		map.put(e.getNome(), e.getCidade());
		e = new Classe("Pedro","Piaui");
		map.put(e.getNome(), e.getCidade());
		e = new Classe("Isaque","São Paulo");
		map.put(e.getNome(), e.getCidade());
		e = new Classe("Maria","Recife");
		map.put(e.getNome(), e.getCidade());
		e = new Classe("Pedro","Piaui"); // reapet
		map.put(e.getNome(), e.getCidade());
		
		
		map.forEach((key,value) -> {System.out.println("Nome: " + key + " Cidade: " + value);});
		
		System.out.println(map.entrySet());
	
	
	}

}
