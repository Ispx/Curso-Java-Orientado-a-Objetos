package Map;

import java.util.HashMap;
import java.util.Map;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Classe e;
		Map<String,String> map = new HashMap();
		
		e = new Classe("Isaque","Bahia");
		map.put(e.getNome(), e.getCidade());
		e = new Classe("Paula", "Belo Horizonte");
		map.put(e.getNome(), e.getCidade());
		e = new Classe("Joana","Paraiba");
		map.put(e.getNome(), e.getCidade());
		
		//print all keys
		map.forEach((key,value) -> {System.out.println(key);});
		
		
		
		System.out.println("\n");
		
		//print conditional
		map.forEach((key,value) -> {if(key.charAt(0) == 'I' ) {System.out.println(key);}});
		
		
		
		
		
	}

}
