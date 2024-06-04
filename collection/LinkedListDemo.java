package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> l1 = new LinkedList<String>();
		System.out.println("Initial size of Linkedlist:"+l1.size());
		
		
		l1.add("Mumbai");
		l1.add("Pune");
		l1.add("Delhi");
		l1.add("Noida");
		System.out.println("Element of LinkedList:"+l1);
		System.out.println("Size of LinkedList after addition:"+l1.size());
		
		
		l1.remove(2);
		System.out.println("Element of LinkedList after deletion:"+l1);
		System.out.println("Size of LinkedList after addition:"+l1.size());
		
		
		l1.removeFirst();
		l1.removeLast();
		System.out.println("Element of LinkedList after deletion:"+l1);
		System.out.println("Size of LinkedList after addition:"+l1.size());
		
		
		System.out.println("First element of linkedlist"+l1.getFirst());
		System.out.println("Second element of linkedlist"+l1.getLast());
		
		Iterator<String> itr = l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+", ");
			
		}

	}

}
