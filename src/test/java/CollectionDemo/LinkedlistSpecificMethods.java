package CollectionDemo;

import java.util.LinkedList;

public class LinkedlistSpecificMethods {

	public static void main(String[] args) {
		// Stack and Queue Specific methods
		
		LinkedList li=new LinkedList();
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		li.add(500);
		li.add(100);
		
		System.out.println(li);
		// Add first element
		li.addFirst(10);
		System.out.println("after adding first element: "+li);
		//Add last element
		li.addLast(1000);
		System.out.println("after adding last element: "+li);
		
		//Getfirst
		
		System.out.println("Get first element from list: "+li.getFirst());
		
		
		System.out.println("Get last element from list: "+li.getLast());
		//Remove first
		li.removeFirst();
		System.out.println("after removing first element from list: "+li);
		
		//remove last
		li.removeLast();
		System.out.println("after removing last element from list: "+li);

	}

}
