package CollectionDemo;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayListAndLinkedListCommonMethods {

	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		li.add("E");
		li.add("D");
		li.add("G");
		li.add("A");
		li.add("M");
		li.add("X");
		li.add("B");
		
		// Add one linkedlist elements to another
		
		LinkedList l=new LinkedList();
		l.addAll(li);
		System.out.println(l);
		
		// Remove all
		
		l.removeAll(li);
		System.out.println(l);
		
		//Sorting- collections.sort(collection)
		System.out.println("Before sorting :"+li);
		Collections.sort(li);
		System.out.println("After sorting :"+li);
		
		// Reverse
		System.out.println("Before reverse"+li);
		Collections.sort(li,Collections.reverseOrder());
		
		System.out.println("After reverse"+li);
		
		// Shuffle
		
		Collections.shuffle(li);
		System.out.println(li);
		
		
		

	}

}
