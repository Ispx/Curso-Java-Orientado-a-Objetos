package ForEach;

import java.util.ArrayList;
import java.util.List;

public class forEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * The method forEach() funciona exatamente como um for(:) 
		 * 
		 * 
		 */
		
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
		//print all numbers
		
		list.forEach(x -> {System.out.println(x);});
		
		//print conditional
		list.forEach(x ->  { if(x > 2) {System.out.println(x);};});
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
