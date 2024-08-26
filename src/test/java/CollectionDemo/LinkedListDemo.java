package CollectionDemo;
import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		// Declaration
		//Specific type 
		// LinkedList<String> list=new LinkedList<String>();
		
          LinkedList li= new LinkedList();
          
          li.add(100);
          li.add("Amit");
          li.add("Amit");
          li.add(10.90);
          li.add(true);
          li.add(null);
          li.add(null);
          
          //Print all the values
          System.out.println(li);
          
          //Size of linkedlist  
          System.out.println("Size of the linked list is : "+li.size());
          
          //Remove an element
          li.remove(2);
          System.out.println("After removing the linkedlist elements are: "+li);
          
          //Insert/Adding element in the middle
         li.add(4, 'A');
         System.out.println("After inserting element in the middle :"+li);
         
         //Retriving value
         
         System.out.println("Retriving the value: "+li.get(4));
         
         // changing/Modifiying/ Replacing the value
         li.set(5, "Hello");
         System.out.println("After modifying the value: "+li);
         
         //Contains()
         System.out.println( "The value is contain ? :"+li.contains(null));
         System.out.println( "The value is contain ? :"+li.contains(200));
         
         //isEmpty
         
         System.out.println("The list is empty or not?  "+li.isEmpty());
         
         
         //Reading the data: for loop
         
        /* for(int i=0;i<=li.size()-1;i++)
         {
        	 System.out.println(li.get(i));
         }
         */
         // Using for each loop
         
         /*for(Object i: li)
         {
        	 System.out.println(i);
        	
         }*/
       
         
         
         
         
         
         
         
         
         
	}

}
