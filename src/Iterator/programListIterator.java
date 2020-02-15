package Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class programListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		/*
		 *  Forward direction

		// Returns true if the iteration has more elements
		public boolean hasNext();

		// same as next() method of Iterator
		public Object next();

		// Returns the next element index 
		// or list size if the list iterator
		// is at the end of the list
		public int nextIndex();

		// Backward direction

		// Returns true if the iteration has more elements
		// while traversing backward
		public boolean hasPrevious();

		// Returns the previous element in the iteration
		// and can throws NoSuchElementException
		// if no more element present
		public Object previous();

		// Returns the previous element index 
		//  or -1 if the list iterator is at the 
		// beginning of the list
		public int previousIndex();

		// Other Methods
		 
		// same as remove() method of Iterator
		public void remove();

		// Replaces the last element returned by 
		// next() or previous() with the specified element 
		public void set(Object obj);

		// Inserts the specified element into the list at
		// position before the element that would be returned 
		// by next(),
		public void add(Object obj);
		
		*/
		List<String> s = new ArrayList<>();
		
		s.add("Isaque");
		s.add("Maria");
		s.add("Joana");
		s.add("Pedro");
		s.add("Xuxa");
		s.add("Daniela");
		s.add("Isabela");
		
		
		//Implementing an object type ListIterator
		
		ListIterator li = s.listIterator();
		
		System.out.println("Order of insert");
		//printing elements
		while(li.hasNext()) {
			
			System.out.println(li.next());
		}
		
		
		System.out.println("\n\n");
		
		//inserting new element inside of listIterator
		li.set("Joana");
		
		li.add("Laura");
		
		//printing elements in reverse order
		System.out.println("Reverse Order");
		while(li.hasPrevious()) {
			
			System.out.println(li.previous());
			
			
		}
		
		

		
	}

}
