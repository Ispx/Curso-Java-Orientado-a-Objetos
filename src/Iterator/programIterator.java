package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class programIterator {

	public static void main(String[] args) {

		/*
		 * Iterator is provide by FrameWork Collection
		 *
		 * O method iterator is used than want to modify the elements of an object of type Collection
		 * To iterator over an element must creat an object of type Iterator;
		 * The object A iterator must be implemented through of an object C calling the method iterator()
		 * 
		 * hasNext() - Verify if have next elements
		 * next(); - return the value of next element
		 * remove(); - remove element
		 * 
		 * 
		 */
		
		List<Integer> i = new ArrayList<>();
		
		i.add(1);
		i.add(15);
		i.add(19);
		i.add(1515);
		i.add(6);

		
		
		//method hasNext(), verify if has more elements (boolean)
		for(Iterator t = i.iterator();t.hasNext();) {
			//method next() return next element of list
			System.out.println(t.next());
			
		}
		
		
		
	}

}
